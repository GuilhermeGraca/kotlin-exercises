package annotations

/*
* Uma annotation é como uma nota q se mete no codigo para dar mais informação ao compilador/ferramentas
*
* Neste caso serve para marcar funções com uma mensagem. Dps um annotation processor pode ler a msg durante a compulação e fazer uma ação
* como gerar ficheiros, logs, validações etc..
* */

@Target(AnnotationTarget.FUNCTION) //a annotation só pdoe ser aplicada a funções
@Retention(AnnotationRetention.SOURCE) //a annotation só existe durante a compilação, não estará disponível em runtime
annotation class Greeting(val message: String) //a annotation tem um parâmetro que permite passar uma greeting message como argumento da annotation