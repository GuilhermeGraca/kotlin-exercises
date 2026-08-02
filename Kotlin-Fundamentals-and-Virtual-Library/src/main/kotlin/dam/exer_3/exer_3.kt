package org.example.dam.exer_3
//A primeira altura da bola é 100 * 0,6 = 60
//Cada salto novo é o anterior multiplicado por 0.6
fun main() {
    //O 1o parametro é a seed / primeiro salto
    //O 20parametro é a função seguinte / saltos seguintes
    //so queros os 15 primeiros saltos e apenas saltos acima de 1 de altora
    //Os 100 metros não como salto porque ainda não tocou no chão
    val sequenciaSaltos = generateSequence(100 * 0.6,{ it * 0.6 }).take(15).filter{it >= 1}
    val listaSaltos = sequenciaSaltos.toList() //converter para lista
    val listaFormatada = listaSaltos.map { String.format("%.2f", it) }//duas casas decimais em cada valor da lista
    println("Altura dos Saltos:")
    //print da altura dos saltos
    for(salto in listaFormatada){
        println("${listaFormatada.indexOf(salto) + 1}º salto: ${salto} metros")
    }
        println("Sequencia de saltos: $listaFormatada")
}