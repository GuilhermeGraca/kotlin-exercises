package org.example.dam.virtual_library

abstract class Book (
    val title: String,
    val author: String,
    val publicationYear: Int,
    availableCopies: Int,//não se coloca val nem var para fazer o custom setter
){
    var availableCopies: Int = availableCopies//vem do construtoralor de iniciação
        set(value){
            //a keyword field é um backing field - representa o espaço de memoria real onde o valor está guardado
            field = value
            if (value <= 0){
                println("Warning: Book is now out of stock!")
            }
        }

    val era: String
        get() = when {
            publicationYear < 1980 -> "Classic"
            publicationYear in 1989..2010 -> "Modern"
            else -> "Contemporarty"
        }

    override fun toString(): String {
        return "Title: $title, " +
                "Author : $author, " +
                "Era : $era, " +
                "Available : $availableCopies"
    }

    abstract fun getStorageInfo(): String //metodo abstrato do requisito adicional

    init {
        //No output de exemplo isto não é feito, mas no enunciado diz que o init block dá print de uma mensagem
        println("The book with the title: '$title' and author: '$author' has been created!")
    }


}
