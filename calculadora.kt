fun main (args: Array<String>){
    
    println("Digite o valor de x:")
        val x = readln()!!.toInt()
    // mostra um erro caso o valor chegue null
    println("Digite o valor de y:")
     val y = readln()?.toInt()!!
    //"?" Garante que só vai ser convertido em inteiro, se o dado de entrada não for nulo

    println("Qual operação você quer usar? (+,-,* ou /)")
    val operacao =readln()

    val resultado = when (operacao) {
        "+" -> x + y
        "-" -> x - y
        "/" -> x / y
        "*" -> x * y
        else -> null
    }
    
    println("Resultado $resultado")
    
}
//Kotlin é uma linguagem com base em java, 
//então aceita tanto seus proprios comandos (que são variaões do java), 
//como os proprios comando de java