import javax.swing.JOptionPane

fun main (agrs: Array<String>){
    /*
         != verifica se é diferente
         == verifica se é igual a
         is (instanceof) verifica se um tipo é igual a 
    */
       /*
        val x = 5
        val y = 2

        println(x != y)
        println(x == y)
    
       */
    val x = JOptionPane.showInputDialog("Digite o primeiro valor de comparação").toInt()
    val y = JOptionPane.showInputDialog("Digite o segunndo valor de comparação").toInt()
    val d = x != y
    val i = x == y

    JOptionPane.showMessageDialog(
        null,
        "comparando $x e $y \n" +
        "São diferentes? $d\n" +
        "São iguais? $i" 
    )


    /*println("A comparação entre os números $x e $y são diferentes ou não?  $d")
      println("A comparação entre os números $x e $y são iguais? $i")
    */
 

}