package dam.exer_2

/*
* Uma classe genérica que pode ter atributos de qualquer tipo
* Por exemplo, o List é uma classe genérica
*
* A sintaxe para declarar é NomeDaClasse<Tipo1, Tipo2, ...>,
* */
class Cache<
    K : Any,
    V : Any
> {
    /*
    * Um mutableMap guarda pares Key-Value que podem ser modificados
    * */
    private val storage: MutableMap<K, V> = mutableMapOf()

    fun put(key: K, value: V) {
        storage[key] = value // Se a key existir o valor é atualizado, se não é adicionado um novo par key-value
    }

    //recebe uma que e se a key existe retorna o valor do tipo V, se não retorna null
    //O ? indica que pode ser null
    fun get(key: K): V? {
         if (storage.containsKey(key)) {
            return storage[key]
        } else {
            return null }
    }

    //evict é para remover uma entrada da cache
    fun evict(key: K) {
        storage.remove(key)//O mutable map tem um metodo remove uma entrada
    }

    //retorna o numero de entradas na cache
    fun size(): Int { return storage.size }

    //getOrPut é uma higher order function porque recebe uma função como parametro
    //default é o nome do parametro que recebe a função lambda, é obrigatório ser passado
    // a função lambda não recebe parametros e retorna um valor do tipo V
    fun getOrPut(key: K, default: () -> V): V {
        //O mutable map of tem um getOrPut mas aqui vai se implementar o proprio

        if  (storage.containsKey(key)) {
            return storage[key]!! // O !! diz que o valor não é null, assim impede que dê erro
        } else {
            val value = default() //chama a função lambda para obter o valor e armazena
            storage[key] = value //adiciona o valor
            return value//retorna o valor
        }
    }

    //Transforma o valor associado a uma key com base numa função passada como parametro
    // que recebe um valor do tipo V e retorna um valor do tipo V
    fun transform(key: K, action: (V) -> V): Boolean{
        if (storage.containsKey(key)) {
            val currentValue = storage[key]!! //obtem o valor atual
            val newValue = action(currentValue) //aplica a action (função lambda) ao valor atual
            storage[key] = newValue //dá update ao valor atual com o novo valor
            return true //indica que a transformação foi bem sucedida
        } else {
            return false //se não existe, não faz nada e reorna false
        }
    }

    fun snapshot(): Map<K, V>{
        //o Map ao contrário do mutableMap é imutável, não dá para modificar
        //logo ao transformar o mutableMap em Map ficamos com um snapshot da cache no momento da chamada
        return storage.toMap()
    }

    //Challenge
    //Função que filtra as entradas da cache e retorna um Map
    fun filterValues(predicate: (V) -> Boolean): Map<K, V> {
        //O MutableMap tem um metodo que faz o trabalho de filtrar os valores com base num lambda
        //Sem a função filterValues do MutableMap, teriamos que fazer manualmente
        val filtered = mutableMapOf<K, V>()

        for ((key, value) in storage) {
            if (predicate(value)) {
                //Se o lambda for true então adiciona a lista dos filtrados
                filtered[key] = value }
        }

        return filtered.toMap()//Map imutavel, tal como foi feito no snapshot

        }
    }






