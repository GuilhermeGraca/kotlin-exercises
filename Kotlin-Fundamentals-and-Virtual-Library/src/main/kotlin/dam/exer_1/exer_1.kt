package org.example.dam.exer_1
import kotlin.math.pow


//Exercicio 1 - inicializar um int array com os primeiros 50 quadrados perfeitos

//a) com um int array constructor
val quadradosPerfeitos = IntArray(50) {(it + 1) * (it + 1)}
// it representa cada indice do array

//Sem construtor ficaria assim:
fun alineaA(){
    //val meuArray = arrayOf(1, 2, 3) é para interoperabilidade
    //val numeros: List<Int> = listOf(1, 2, 3) - Lista imutavel
    //val listaMutavel = mutableListOf(1, 2, 3) - Lista mutavel, permite adicionar ou remover

    /*
    * Arrays:
    * Sem construtor, ex: arrayOf: Dasse os valores diretamente
    * Com construtor, ex: Array(n) { ... } : Damos a regra/formula para gerar os valores
    * */

    val quadradosPerfeitos = mutableListOf<Int>()
    for (i in 1..50){
        quadradosPerfeitos.add(i*i)
    }
    println(quadradosPerfeitos.joinToString())
}


//b) com um map e um range
val quadradosPerfeitosB = (1..50).map {it.toDouble().pow(2).toInt()}
//.pow só recebe double para ser universal
//val quadradosPerfeitosB = (1..50).map{ it * it}

//c) com um array com construtor

val quadradosPerfeitosC = Array(50) {(it + 1) * (it + 1)}

fun main() {
    println("Alinea a)")
    //print em loop:
    //for(i in quadradosPerfeitos) {println(i)}
    //print em string
    println(quadradosPerfeitos.joinToString())
    //alineaA()

    println("Alinea b)")
    println(quadradosPerfeitosB.joinToString())

    println("Alinea c)")
    println(quadradosPerfeitosC.joinToString())



}