package dam.exer_1

import kotlin.math.round

/*
* Sealed class serve para representar uma hierarquia de classes com uma herança controlada
* Ela é abstrata por defeito, não dá para instanciar diretamente,
*
* As subclasses da sealed class podem ser :
* - data class: para representar dados imutáveis
* - object: para representar um singleton, sem estado
* - class normal: para representar uma classe com estado mutável
* */
sealed class Event{
    //Login, Purchase e Logout são eventos que possuem dados associados e são imutaveis
    // (são factos que aconteceram, os seus parametros não vão mudar (val - é só de leitura))
    // , por isso são data class
    data class Login(val username: String, val timestamp: Long) : Event()
    data class Purchase(val username: String, val amount: Double, val timestamp: Long) : Event()
    data class Logout(val username: String, val timestamp: Long) : Event()
}

/*
* Uma extension function permite adicionar funcionalidades a uma classe/interface sem usar herança
* e dem modificar a classe original
* Esta função é definida fora da classe e pode ser chamada como se fosse um metodo da classe
* com o dot notation
*
* Extension functions servem para:
* - Estender classes de terceirios que não podemos modificar (Ex: List, String, etc...)
* - Criar funções auxiliares
* - Melhorar a legibilidade do código ao evitar a repetição de código
* */
fun List<Event>.filterByUser(username: String): List<Event> {
    //o this refere-se ao tipo de recetor da função, neste caso é a List<Event>

    //lambda é uma função anónima sem nome e é passada como arg para outra função
    // a notação da lambda é { parametros -> corpo da função }, o it é uma keyword q representa o parametro quando só existe um parametro
    //filter recebe uma função lambda que é aplicada a todos os elementos da lista e retorna uma lista em q essa função é verdadeira
    val listaEventosDoUser = this.filter {
        //o it representa o elemento da lista é um Event. Poderia ser {event -> when(event){...}}
        when(it){
            //Temos que verificar primeiro o tipo de evento com o when porque o Event em si não tem o atributo username
            //Só as subclasses é que têm esse atributo. por isso é que não se pode fazer diretamente this.filter { it.username == username }
            is Event.Login -> it.username == username
            is Event.Purchase -> it.username == username
            is Event.Logout -> it.username == username
        }
    }

    return listaEventosDoUser
}

fun List<Event>.totalSpent(username: String): Double {

    //filterByUser recebe um tipo de instancia e é aplicado sobre uma lista, retorna uma lista com os elementos que têm esse tipo de instancia
    //sumOf retorna a soma dos resultados da função lambda passada como parametro
    val eventosDoUser = this.filterByUser(username)
    val comprasDoUser = eventosDoUser.filterIsInstance<Event.Purchase>()
    val totalGasto =  comprasDoUser.sumOf{it.amount} //it.amount é o valor do atributo amount de cada compra do user
    //return String.format("%.2f", totalGasto).toDouble() //arredonda com string format
    return round(totalGasto * 100) / 100 //arredonda para 2 casas decimais matematicamente
}

/*
* Uma higher-order function é uma função que aceita outra função como parametro
* ou que retorna outra função como resultado
*
* formas de passar uma função como parametro:
* (A, B) -> C  - recebe A,B e retorna C
* (A) -> Unit - recebe A e retorna Unit (void)
* */
fun processEvents(
    events: List<Event>, //parametro "normal" que é uma lista de eventos
    handler: (Event) -> Unit //função lambda, recebida no parametro "handler", a função recebe Event e retorna Unit (void)
){
    for(event in events){
        handler(event)
    }
}

fun main() {

    //1_100 é uma notação de nrs grandes, representa 1100, da msm forma que escrevemos 1,000,000 para representar 1 milhão, no kotlin fica 1_000_000
    val events = listOf (
        Event.Login("alice", 1_000 ) ,
        Event.Purchase("alice", 49.99 , 1_100 ) ,
        Event.Purchase("bob", 19.99 , 1_200 ) ,
        Event.Login("bob", 1_050 ) ,
        Event.Purchase("alice", 15.00 , 1_300 ) ,
        Event.Logout("alice", 1_400 ) ,
        Event.Logout("bob", 1_500 )
    )

    println()//quebra de linha

    //ponto 5. do exercicio - passar uma when expression no lambda do process events
    processEvents(events) { event ->
        when (event) {
            is Event.Login ->
                println("[LOGIN]    ${event.username} logged in at t=${event.timestamp}")

            is Event.Purchase ->
                println("[PURCHASE] ${event.username} spent $${event.amount} at t=${event.timestamp}")

            is Event.Logout ->
                println("[LOGOUT]   ${event.username} logged out at t=${event.timestamp}")
        }
    }
    println()

    println("Total spent by alice: $${events.totalSpent("alice")}")
    println("Total spent by bob: $${events.totalSpent("bob")}")

    println()

    println("Events for alice:")
    events.filterByUser("alice").forEach { event ->
        when (event) {
            is Event.Login ->
                println("   Login (username=${event.username}, timestamp=${event.timestamp})")

            is Event.Purchase ->
                println("   Purchase (username=${event.username}, amount=${event.amount}, timestamp=${event.timestamp})")

            is Event.Logout ->
                println("   Logout (username=${event.username}, timestamp=${event.timestamp})")
        }
    }
}