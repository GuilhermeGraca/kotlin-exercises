package org.example.dam.virtual_library

data class LibraryMember(
    val name: String,
    val membershipId: Int,
    val borrowedBooks: MutableList<String> = mutableListOf(),//valor default para não ter que inicializar sempre que se cria
)
