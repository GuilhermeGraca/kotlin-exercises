package org.example.dam.virtual_library

class Library(name: String) {
    val books = mutableListOf<Book>()

    //O companion object é o equivalente ao static do java
    //cria variaveis e ou metodos que pertencem à classe em si em vez de ao objeto
    companion object {
        var totalBooksAdded = 0
        fun getTotalBooksCreated() = totalBooksAdded
    }

    fun addBook(book: Book) {
        books.add(book)
        totalBooksAdded++
        println("Book ${book.title} by ${book.author} has been added to the library.")
    }

    fun borrowBook(title: String) {
        val book = books.find { it.title == title }
        if (book != null) {
            if(book.availableCopies > 0) {
                println("Successfully borrowed '${book.title}'. Copies remaining: ${book.availableCopies}")
                book.availableCopies--
            }else {
                println("Sorry, there is no more copies to borrow.")
            }
        }else {
            println("Book not found!")
        }
    }

    fun returnBook(title:String) {
        val book = books.find { it.title == title }
        if (book != null) {
            book.availableCopies++
            println("Book '$title' returned sucessfully. Copies available: ${book.availableCopies}")
        }
    }

    fun showBooks(){

        for (book in books) {
            /*
            println(
                "Title: ${book.title}, " +
                "Author : ${book.author}, " +
                "Era : ${book.era}, " +
                "Available : ${book.availableCopies}"
            )
            println("Storage: ")
            if (book is DigitalBook) {
                print("Stored digitally: ${book.fileSize} MB, Format: ${book.format}")
            }
            else if (book is PhysicalBook) {
                val coverType = if (book.hasHardCover) "Yes" else "No"
                print("Physical book: ${book.weight}g, Hardcover: $coverType")
            }*/
            //Com o requesito do override toString deixa de ser preciso este codigo
            book.toString()
        }


    }

    fun searchByAuthor(author: String) {
        if(books.filter{it.author == author}.isNotEmpty()) {
            println("Books by $author: ")
            for (book in books.filter { it.author == author }) {
                val copSufixo  = if (book.availableCopies == 1) "copy" else "copies"
                println("    - ${book.title} (${book.era}, ${book.availableCopies} $copSufixo available)")
            }
        } else {
            println("No books with author: $author found.")
        }
    }
}