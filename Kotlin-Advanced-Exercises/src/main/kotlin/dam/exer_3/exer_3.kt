package dam.exer_3

//Uma top-level function é uma função que é defenida fora de uma classe
//Neste caso tambem é uma higher order function porque recebe uma função lambda como parametro
//recebe um lambda do tipo Pipeline, sem argumentos e sem retorno - é um bloco de codigo q vai ser aplicado ao pipeline
//Temos um literal como recetor, o literal é uma função aplicada a um objeto
fun buildPipeline(action: Pipeline.() -> Unit): Pipeline {
    val pipeline = Pipeline() //cria uma instancia de Pipeline
    pipeline.action() //aplica a função passada ao pipeline
    return pipeline
}

//TESTES:

val logs = listOf (
    " INFO : server started ",
    " ERROR : disk full ",
    " DEBUG : checking config ",
    " ERROR : out of memory ",
    " INFO : request received ",
    " ERROR : connection timeout "
)

//Para usar o buildPipeline temos de lhe passar a transformação inicial
val pipeline : Pipeline = buildPipeline() {
    /*Como ao construir o buildPipeline dissemos que Pipeline.() -> Unit
    * já estamos a dizer q o lambda pertence à classe pipeline, então temos acesso ao metodos da Pipeline
    *, podemos usar o this mas não é necessário
    * Todos os metodos passados são tratados como um unico bloco de codigo que é a função lambda
    * */

    //map porque está à espera de receber uma lista de strings
    this.addStage("Trim", {input -> input.map { it.trim() }}) //trim remove os espaços em branco no inicio e no fim de cada string
    addStage("Filter errors", {input -> input.filter { it.contains("ERROR") }}) //filtra as strings que tem a palavra "ERROR"
    addStage("Uppercase", {input -> input.map { it.uppercase() }}) //transforma as strings em maiusculas
    addStage("Add index", {input -> input.mapIndexed { index, value -> "${index+1}. $value" }}) //mapIndexed é um map que tambem recebe o indice do elemento
    //o value é a string original
}
val pipelineOutput : List<String> = pipeline.execute(logs) //passa os logs pelo pipeline e guarda o resultado

//CHALLENGE 2
//Esta função coordena a execução de dois pipelines e mostra o resultado dos dois
fun fork(
    input: List<String>,
    firstPipeline: Pipeline,
    secondPipeline: Pipeline
): Pair<List<String>, List<String>> {
    val firstResult = firstPipeline.execute(input)
    val secondResult = secondPipeline.execute(input)
    return Pair(firstResult, secondResult)
}


fun main() {
    pipeline.describe()
    println("Result:")
    for(line in pipelineOutput){
        println(line)
    }

    println("\n Test Challenges: ")

    val pipeline2 = pipeline //cria um segundo pipeline igual ao primeiro
    pipeline2.compose("Trim", "Filter errors") //combina os dois primeiros stages do pipeline2
    pipeline2.describe()
    println("Pipeline 2 OUTPUT:")
    val output2= pipeline2.execute(logs)
    for(line in output2){
        println(line)
    }//deve ser igual ao output original

    //fork test
    val (output1Fork, output2Fork) = fork(logs, pipeline, pipeline2)
    println("\nFork Test:")
    println("Pipeline 1 Output:")
    for(line in output1Fork){
        println(line)}
    println("\nPipeline 2 Output:")
    for(line in output2Fork){
        println(line)
    }


}


