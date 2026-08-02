package dam.exer_2

fun main() {
    val wordCache = Cache<String, Int>()
    val idCache = Cache<Int, String>()

    wordCache.put("kotlin",1)
    wordCache.put("scala",1)
    wordCache.put("haskell",1)

    println("--- Word frequency cache ---")

    println("Size: ${wordCache.size()}")
    println("Frequency of \"kotlin\": ${wordCache.get("kotlin")}")
    println("getOrPut \"kotlin\": ${wordCache.getOrPut("kotlin", { 0 })}")//O lambda pode ser passado como argumento dentro dos parenteses () ou fora
    println("getOrPut \"java\": ${wordCache.getOrPut("java",{ 0 })}") //O que está no lambada é o valor que é devolvido quando a key não existe
    println("Size after getOrPut: ${wordCache.size()}")
    println("Transform \"kotlin\" (+1): ${wordCache.transform("kotlin") { it +1 }}")
    println("Transform \"cobol\" (+1): ${wordCache.transform("cobol") { it +1 }}")
    println("Snapshot : ${wordCache.snapshot()}")

    println()

    println("--- Id registry cache ---")

    idCache.put(1, "Alice")
    idCache.put(2, "Bob")

    println("Id1 -> ${idCache.get(1)}")
    println("Id2 -> ${idCache.get(2)}")
    idCache.evict(1)
    println("After evict id 1, size: ${idCache.size()}")
    println("Id 1 after evict -> ${idCache.get(1)}")


    println("\n--- Challenge Teste ---")

    val cacheTeste = Cache<String, Int>()
    cacheTeste.put("a", 0)
    cacheTeste.put("b", 1)
    cacheTeste.put("c", 2)
    cacheTeste.put("d", 0)
    println("Snapshot inicial: ${cacheTeste.snapshot()}")

    val apenasZeros = cacheTeste.filterValues { valor -> valor == 0 }
    //apenasZeros.put("e",9) // não é mutavel, se descomentar, dá erro
    println("Valores com value 0 (filterValues): $apenasZeros")

}

