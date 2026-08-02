package org.example.dam.exer_2
//Exercicio 2 - Calculadora na consola
//INPUT - readln, devolve sempre string
//OUTPUT - println e print

fun printCapacidades(){
    println("1. Operador when para diferentes operações")
    println("2. Exceções para lidar com potenciais erros (ex. divisão por zero, input invalido)")
    println("3. String templates e String formatting para output claro e estruturado")
}

fun printFuncionalidades(){
    println("1. Operações Aritméticas: Adição, Subtração, Multiplicação, Divisão")
    println("2. Operadores Booleanos: AND (&&), OR (||), NOT (!)")
    println("3. Bitwise Shift Operators: Left shift (shl), right shift (shr)")
    println("4. Resultados em decimal, hexadecimal e booleano")
}

fun operacaoAritmetica(tipo: String, num1: Double, num2: Double): Double{
    //when é o equivalente ao switch do java
    val resultado = when (tipo.uppercase()){
        "ADD" ->  (num1 + num2)
        "DIV" ->  {
            if(num2 == 0.0) throw ArithmeticException("ERRO - Divisão por 0")
            (num1 / num2)
        }
        "SUB" ->  (num1 - num2)
        "MULT" -> (num1 * num2)
        else -> null
    }

    if (resultado == null) {
        throw IllegalArgumentException("ERRO - ${tipo} não é uma operação aritemética  válida")
    } else {
        return resultado
    }
}


//Operacoes bitwise e bitshifts recebem valores inteiros

fun operacaoBoolean(tipo: String, bool1: Boolean, bool2: Boolean? = null): Int{
    //? nos parametros indica q pode ser null, atribui o valor default null

    val resultado = when (tipo){
        "AND" -> {
            if(bool2 == null){ throw IllegalArgumentException("ERRO - A operação necessita de 2 valores booleanos")
            }
            if (bool1 && bool2) 1 else 0 // converte para numero para dps entrar na mostrar resultados
        }
        "OR" -> {
            if (bool2 == null) {
                throw IllegalArgumentException("ERRO - a operação necessita de 2 valores booleanos")
            }
            if (bool1 || bool2) 1 else 0
        }
        "NOT" -> if (!bool1) 1 else 0

        else -> throw IllegalArgumentException("ERRO - O tipo de operação booleana não é valida: ${tipo}")
    }

    return resultado
}

fun operacaoShift(tipo: String, num1:Int, num2:Int): Int{
    val resultado = when(tipo.lowercase()){
        "shl" -> num1 shl num2
        "shr" -> num1 shr num2
        else -> throw IllegalArgumentException("ERRO - Tipo de operação inválida: '$tipo'")
    }
    return resultado
}

//Recebe number porque pode ser double ou int
fun mostrarResultado(tipo: String, resultado: Number){

    val parteInteira = resultado.toInt() // para hex e para bool
    //quando se faz o toInt de um numero decimal ele trunca o valor

    if (resultado is Double && resultado != parteInteira.toDouble()) {
        println("AVISO - O valor decimal $resultado foi truncado para $parteInteira para as converter em Hexadecimal/Boolean.")
    }

    //formata com 2 casas decimais se for decimal, se não, adiciona .00 ao numero inteiro
    val decimal = if (resultado is Double) "%.2f".format(resultado) else "${resultado}.00"

    val hex = Integer.toHexString(parteInteira).uppercase() //O Integer.toHexString deixa as letras em minusculas

    val booleano = if (parteInteira != 0) "true" else "false"

    when(tipo.lowercase()){
        //tambem deixa excrever por extenso o tipo
        "decimal", "dec" -> println("Resultado Decimal: $decimal")
        "hexadecimal", "hex" -> println("Resultado Hexadecimal: $hex")
        "booleano", "bool" -> println("Resultado Booleano: $booleano")
        else -> throw IllegalArgumentException("ERRO - Tipo de formato de resultado inválido : '$tipo'")
    }

}

fun pedirInput(mensagem: String): String {
    while (true) {
        print("$mensagem \n")
        val input = readln().trim()

        when (input.lowercase()) {
            "quit" -> return "QUIT"
            "back" -> return "BACK"
            "help" -> {
                println("\n--- MENU DE AJUDA ---")
                printHelp()
                println("---\n")
            }
            else -> if (input.isNotEmpty()) return input
        }
    }
}

fun printHelp(){
    println("--- COMANDOS GLOBAIS  ---")
    println("HELP : Mostra este menu")
    println("BACK : Volta ao passo anterior")
    println("QUIT : Sai da calculadora\n" )

    println("--- CATEGORIAS / Tipos de Algoritmo ---")
    println("ARIT  : Operações Aritméticas")
    println("BOOL  : Operações Booleanas")
    println("SHIFT : Operações de Bitwise Shift\n")

    println("--- OPERAÇÕES / Tipos de Operação ---")
    println("ARIT:")
    println("  ADD  num1 num2 : Adição ")
    println("  SUB  num1 num2 : Subtração ")
    println("  MULT num1 num2 : Multiplicação ")
    println("  DIV  num1 num2 : Divisão ")
    println("nota: os parametros nums podem ser Inteiros ou Decimais\n")

    println("BOOL:")
    println("  AND  bool1 bool2 ")
    println("  OR   bool1 bool2 ")
    println("  NOT  bool1 \n")

    println("SHIFT:")
    println("  SHL  num1 num2 : Left shift")
    println("  SHR  num1 num2 : Right shift\n")

    println("--- RESULTADOS / Tipos de Formato ---")
    println("DEC  ou DECIMAL     : Formato Decimal")
    println("HEX  ou HEXADECIMAL : Formato Hexadecimal )")
    println("BOOL ou BOOLEANO    : Formato Booleano")
}

fun apresentarPrograma() {
    println("---CALCULADORA---")

    println("Este programa tem as seguintes capacidades:")
    printCapacidades()

    println("\nEste proprama tem as seguintes funcionalidades:")
    printFuncionalidades()

    println("\nComandos Possiveis:")
    printHelp()

    println("\nSiga os passos para realizar operações que desejar...")
    println(" - Pode digitar 'help' a qualquer momento para ajuda")
    println(" - Pode digitar 'quit' a qualquer momento para sair \n")
}


fun main() {


    apresentarPrograma()

    while (true) {
        try {
            val categoria = pedirInput("Escolha a categoria (ARIT, BOOL, SHIFT): ").uppercase()
            if (categoria == "QUIT") break
            if (categoria == "BACK") {
                println("Já está no menu inicial\n")
                continue
            }

            //!in - se não estiver
            if (categoria !in listOf("ARIT", "BOOL", "SHIFT")) {
                println("ERRO: Categoria desconhecida. Use ARIT, BOOL ou SHIFT.\n")
                continue
            }

            val operacaoCompleta = pedirInput("Insira a operação e os valores (se precisar de ajuda escreva 'help'): ")
            if (operacaoCompleta == "QUIT") break
            if (operacaoCompleta == "BACK") {
                println("A voltar às categorias...\n")
                continue // com o continue volta ao início do 'while'
            }

            val partes = operacaoCompleta.split(" ")
            val comando = partes[0]

            val formato = pedirInput("Escolha o formato do resultado (DEC, HEX, BOOL): ")
            if (formato == "QUIT") break
            if (formato == "BACK") {
                println("A voltar às categorias...\n")
                continue // Volta ao início do 'while' (categoria)
            }

            println("\nA calcular...")

            when (categoria) {
                "ARIT" -> {
                    if (partes.size < 3) throw IllegalArgumentException("ERRO - É necessário 3 valores para a operação aritmética")
                    val num1 = partes[1].toDouble()
                    val num2 = partes[2].toDouble()
                    val resultado = operacaoAritmetica(comando, num1, num2)
                    mostrarResultado(formato, resultado)
                }
                "BOOL" -> {
                    if (partes.size < 2) throw IllegalArgumentException("ERRO - É necessário apenas 2 valores para a operação booleana.")
                    val bool1 = when (partes[1].lowercase()) {
                        "true" -> true
                        "false" -> false
                        else -> throw IllegalArgumentException("ERRO - Valor inválido: '${partes[1]}'. Tem de escrever 'true' ou 'false'.")
                    }
                    val bool2 = if (partes.size >= 3) {
                        when (partes[2].lowercase()) {
                            "true" -> true
                            "false" -> false
                            else -> throw IllegalArgumentException("ERRO - Valor inválido: '${partes[2]}'. Tem de escrever 'true' ou 'false'.")
                        }
                    } else {
                        null
                    }
                    val resultado = operacaoBoolean(comando.uppercase(), bool1, bool2)
                    mostrarResultado(formato, resultado)
                }
                "SHIFT" -> {
                    if (partes.size < 3) throw IllegalArgumentException("ERRO - É necessário 3 valores para a operação shift.")
                    val num1 = partes[1].toInt()
                    val num2 = partes[2].toInt()
                    val resultado = operacaoShift(comando, num1, num2)
                    mostrarResultado(formato, resultado)
                }
            }
            println("\n---\n")



        } catch (e: Exception) {
            println("${e.message}\n")
        }
    }

    println("\nFim de Programa")
}