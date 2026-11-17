import javax.swing.JOptionPane

fun main (args: Array<String>){
    //Pede o nome do usuario 
    val nome = JOptiononPane.showInputDialog("Digite seu nome")

    //concatena o o nome do usuario na mensagem

    val saida = String.format("%s %s", "Bem vindo", nome)
   
    // apresenta o texto  de saida em uma interface grafica
    JOptionPane.showMessageDialog(null, saida)

    println("Bem vindo $nome")
}