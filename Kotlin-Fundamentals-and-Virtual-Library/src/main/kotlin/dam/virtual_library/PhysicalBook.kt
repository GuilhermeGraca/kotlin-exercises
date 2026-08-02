package org.example.dam.virtual_library

class PhysicalBook(
    title: String,
    author: String,
    publicationYear: Int,
    availableCopies: Int,
    val weight: Int, //gramas
    val hasHardCover: Boolean = true, //por default tem capa dura
) : Book(title, author, publicationYear, availableCopies) {
    override fun toString(): String {
        //reaproveita o codigo da superclasse
        return "${super.toString()}\n" +
                "Storage: \n" +
                getStorageInfo()
    }

    override fun getStorageInfo(): String {
        val coverType = if (hasHardCover) "Yes" else "No"
        return "Physical book: $weight g, Hardcover: $coverType"

    }
}