package dam.exer_4
//CHALLENGE

//Top-level para ser usado no main, se ficasse dentro do Vec2 só se podia usar a multiplicação invertida dentro da classe Vec2
//Tambem se pode fazer extension function de operadores
//Extension function é util para adicionar funcionalidades a classes sem herança ou alterar diretamente a classe original
operator fun Double.times(vector: Vec2) : Vec2 {
    return vector * this
    //inverte a ordem para usar a multiplicação que já foi implementada no Vec2
    //E obriga a retornar um Vec2 em vez de um Double
    //this é o valor escalar
}

fun main () {
    val a = Vec2 (3.0 , 4.0)
    val b = Vec2 (1.0 , 2.0)
    println ("a = $a") // a = Vec2 (x=3.0 , y =4.0)
    println ("b = $b") // b = Vec2 (x=1.0 , y =2.0)
    println ("a + b = ${a + b}") // a + b = Vec2 (x=4.0 , y =6.0)
    println ("a - b = ${a - b}") // a - b = Vec2 (x=2.0 , y =2.0)
    println ("a * 2.0 = ${a * 2.0} ") // a * 2.0 = Vec2 (x=6.0 , y =8.0)
    println ("-a = ${ -a}") // -a = Vec2 (x= -3.0 , y= -4.0)
    println ("|a| = ${a. magnitude ()}") // |a| = 5.0
    println ("a dot b = ${a.dot(b)}") // a dot b = 11.0
    println (" norm (a) = ${a. normalized ()}")
    // norm (a) = Vec2 (x=0.6 , y =0.8)
    println ("a[0] = ${a [0]} ") // a[0] = 3.0
    println ("a[1] = ${a [1]} ") // a[1] = 4.0
    println ("a > b = ${a > b}") // a > b = true
    println ("a < b = ${a < b}") // a < b = false
    val vectors = listOf ( Vec2 (1.0 , 0.0) , Vec2 (3.0 , 4.0) , Vec2 (0.0 , 2.0) )
    println (" Longest = ${vectors.max()}") // Longest = Vec2 (x=3.0 , y =4.0)
    println (" Shortest = ${vectors.min()}") // Shortest = Vec2 (x=1.0 , y =0.0)

    println("\nTESTE CHALLENGE:")
    println("a * 2.0 = ${a * 2.0}")
    println("2.0 * a = ${2.0 * a}")




}