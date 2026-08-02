package dam.exer_4

import kotlin.math.pow
import kotlin.math.sqrt

/*
* Este exercicio tem o intuito de implementar um vetor 2D
*
* A diferença de uma class normal para uma data class
* é que a data classe ao ser compilada, gera automaticamente metodos como
* equals, hashCode, toString..
*
* As data classes obrigam a ter pelo menos um parametro no construtor
* Numa class normal o == compara se os objetos apontam para a mesma instancia
* Enquanto que numa data class o == compara se os objetos tem os mesmos valores nos seus atributos
* */
data class Vec2 (
    val x: Double,
    val y: Double
) : Comparable<Vec2> { //Implementa a interface Comparable para que se possa usar o Max e Min do enunciado sem problema
    //Overload de operadores

    //Para defenir o comportamento dos operadores em kotlin utiliza se a keyword operator
    // e uma função com o nome especifico do operador
    //Não se pode inventar operadores, só se pode utilizar os operadores predefinidos

    //A soma de dois vetores é a soma das componentes em x e y
    operator fun plus(otherVector : Vec2) = Vec2(
        this.x + otherVector.x,
        this.y + otherVector.y)

    //A subtração de dois vetores é a subtração das componentes em x e y
    operator fun minus(otherVector : Vec2) = Vec2(
        this.x - otherVector.x,
        this.y - otherVector.y)

    //A multiplicação de um vetor por um escalar é a multiplicação das componentes por esse escalar
    operator fun times(scalar: Double) = Vec2(
        this.x * scalar,
        this.y * scalar)

    //A negação de um vetor (Unary) é a multiplicação do vetor por -1
    operator fun unaryMinus() = Vec2(
        this.x * -1,
        this.y * -1)


    //O compare to corresponde aos operadores <, >, <=, >=
    //Por exemplo um vetor é maior que outro se a sua magnitude for maior
    //Como o compareTo é um metodo da interface Comparable tem que se fazer override
    override operator fun compareTo(other: Vec2): Int {
        val thisMagnitude = this.magnitude()
        val otherMagnitude = other.magnitude()
        return thisMagnitude.compareTo(otherMagnitude)
        //Este compareTo acima é da classe do Double, -1 é menor, 0 é igual, 1 é maior
        //Quando se escreve a > b  (booleano) o que é executado é a.compareTo(b) > 0, dai esta função retornar Int
    }

    //Função que não são operatores

    fun magnitude():Double {
        //raiz quadrada das componentes ao quadrado somadas
        val magnitude = sqrt(this.x.pow(2) + this.y.pow(2))
        return magnitude
    }

    fun dot(otherVector: Vec2): Double {
        //produto escalar é a soma das multiplicações das componentes
        //x1*x2 + y1*y2
        val dotProduct = this.x * otherVector.x + this.y * otherVector.y
        return dotProduct
    }

    fun normalized(): Vec2 {
        //Um vetor normalizado tem cada componente dividida pela norma/magnitude
        val magnitude = this.magnitude()
        if (magnitude == 0.0) {
            throw IllegalStateException("Cant normalize - zero vector")
        }
        return Vec2((this.x / magnitude), (this.y / magnitude)) //Vetor unitário
    }


    //O get corresponde ao operador de indexar,
    // por exemplo v[0] vai retorna x e v[1] vai retornar y
    operator fun get(index: Int): Double {
        return when(index) {
            0 -> this.x
            1 -> this.y
            else -> throw IndexOutOfBoundsException("Index must be 0 or 1")
        }
    }




}