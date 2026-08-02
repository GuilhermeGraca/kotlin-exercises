package org.example.dam.virtual_library

class DigitalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int, //os atributos que são herdados não têm val pois vão ser passados para o construtor de book
    val fileSize: Double, // em MB
    val format: String, //
): Book(title = title, author = author, publicationYear = publicationYear, availableCopies = availableCopies) {

    override fun toString(): String {
        return "${super.toString()}\n" +
                "Storage: \n" +
                getStorageInfo()
    }

    override fun getStorageInfo() : String{
        return "Stored digitally: $fileSize MB, Format: $format"
    }

    init {
        //Quando inicializa valida o formato passado e lança exceção em caso de erro
        val formatos = listOf("PDF", "EPUB", "MOBI")
        if (format !in formatos) {
            if(format.uppercase() in formatos){
                throw IllegalArgumentException("ERROR: The format '$format' must be in uppercase!")
            } else {
                throw IllegalArgumentException("ERROR: The format '$format' is not valid! \n Valid formats: $formatos")
            }
        }
    }

}