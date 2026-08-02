package dam.exer_3
/*
* O objetivo deste exercício é ter um pipeline para processar uma lista de raw strings,
* por uma sequência de transformações configuráveis
* */




class Pipeline {

    /*
    A lista ordenada (mutableListOf) é composta por tuplos com o nome da transformação (String) e a função lambda de transformação
    Um tuplo em kotlin é defenido com a classe Pair: Pair<A, B>
    A função lambda recebe uma lista de strings e retorna uma lista de strings depois de transformar
    */
    private val transformationStepsList = mutableListOf<Pair<String, (List<String>) -> List<String>>>()

    //Esta função adiciona um passo de transformação nomeada ao pipeline
    fun addStage(name: String, transform: (List<String>) -> List<String>) {
        //No kotlin os <> são usados para defenir tipos / generics e os () são usados para chamar funções ou passar argumentos
        val namedstage : Pair<String, (List<String>) -> List<String>> = Pair(name, transform) //cria um par com o nome e a função de transformação
        transformationStepsList.add(namedstage)//
    }

    //O execute corre / aplica todas as transformações que estão no pipeline por ordem ao input e retorna o resultado final
    fun execute(input: List<String>): List<String> {
        var transfomedInput = input //cria uma variavel mutavel para armazenar o resultado das transformações. Inicialmente é igual ao input
        for (step in transformationStepsList) {
            val transformFunction = step.second //pega na função atual de transformação do tuplo (é o segundo elemento do par)
            transfomedInput = transformFunction(transfomedInput) //aplica a função de transformação ao input e atualiza o input para o resultado da transformação
        }
        return transfomedInput //devolve o resultado final depois de aplicar todas as transformações
    }

    //A função imprime o nome de cada passo pela ordem que está pipeline
    fun describe() {
        println("Pipeline stages:")
        for(i in 0..<transformationStepsList.size) {
            val name = transformationStepsList[i].first //pega no nome da transformação do tuplo (é o primeiro elemento do par)
            println("${i+1}. $name")
        }
    }

    //CHALLENGE

    /*
    * Recebe o nome de dois stages
    * combina os
    * substitui a primeira stage pelo resultado da combinação
    * remove a segunda stage da pipeline
    *
    * NOTA: Se as stages não forem adjacentes o resultado da pipeline pode ser diferente do que é pretendido
    * A ordem com que dos nomes passados como argumento também é importante pois vai ditar a ordem pelo que as transformações vão ser feitas e aonde vai ficar
    * */
    fun compose(firstStageName: String, secondStageName: String){
        //pega de cada stage com o indexOfFirst que pega no indice do primeiro elemento que tiver a condição dada
        val firstStageIndex = transformationStepsList.indexOfFirst{ it.first == firstStageName } //it.first é o nome
        val secondStageIndex = transformationStepsList.indexOfFirst{ it.first == secondStageName }

        val composedStageName : String = "composed $firstStageName + $secondStageName"

        if (firstStageIndex == -1 || secondStageIndex == -1) {
            throw IllegalArgumentException("Stage or stages not found in the pipeline!")
        }

        //pega nas funções
        val firstTransform = transformationStepsList[firstStageIndex].second
        val secondTransform = transformationStepsList[secondStageIndex].second

        //pega no resultado da primeira transformação e passa para a segunda transformação
        val composedTransform: (List<String>) -> List<String> = {
            input -> secondTransform(firstTransform(input))
        }

        //val composedTransform = firstTransform.andThen(secondTransform)

        //No sitio onde estava a primeira stage fica a stage composta
        transformationStepsList[firstStageIndex] = Pair(composedStageName, composedTransform)

        //A segunda stage é removida da lista
        transformationStepsList.removeAt(secondStageIndex)

    }


}