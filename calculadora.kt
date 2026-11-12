fun main (args: Array<String>){
    
    println("Digite o valor de x:")
        val x = readLine()!!.toInt()
    // mostra um erro caso o valor chegue null
    println("Digite o valor de y:")
     val y = readLine()?.toInt()!!
    //"?" Garante que só vai ser convertido em inteiro, se o dado de entrada não for nulo

      val z = (x+y)
    
    println("Resultado $z")
    
}
//Kotlin é uma linguagem com base em java, 
//então aceita tanto seus proprios comandos (que são variaões do java), 
//como os proprios comando de java