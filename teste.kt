import javax.swing.JOptionPane

fun main(args: Array<String>){

    /* PRIMEIRO EXEMPLO DE ACORDO COM AULA
    println("Digite uma valor para X:")
    var x = readLine()?.toInt()!!
    println("Digite um valor para Y:")
    var y = readLine()?.toInt()!!
    var total = 0;

    total = x+y
    println("Resultado =$total")
    */
    //__________________________________________________________________________________________
    /* SEGUNDO EXEMPLO DE ACORDO COM AULA
    // Pedindo ao usuário que digite seu nome usando um caixa de Dialogo;
    val nome = JOptionPane.showInputDialog("Digite seu nome:")

    //criar variavel formata que vai receber o nome digitado a fim de mostra em uma caixa de dialogo
    val saida = String.format("%s  %s", "Bem-Vindo",nome)
    //Apresenta nome digitado pelo usuário
    JOptionPane.showMessageDialog(null,saida)
     */
    //------------------------------------------------------------------------------------------
    /*TERCEIRO EXEMPLO DE ACORDO COM AULA*/
    val x = 2
    val y = 2
    val z = "VIT"

    println((x != y))
    println((x is Int))
    println((x == y))
    if(x != y) {
        println(x)
    }
    else {
        println("x é $x"+" e"+" y é $y")
    }
}
