import java.util.Calendar
import javax.swing.JOptionPane
//Teste com uso do condicional when
fun main(Args: Array<String>){
    var date = Calendar.getInstance()
    var anoAtual = date.get(Calendar.YEAR)
    anoAtual.toInt()
    val ger1 = "Baby Boomer"
    val ger2 = "X"
    val ger3 = "Y"
    val ger4 = "Z"
    var nome = JOptionPane.showInputDialog("Qual seu nome?")
    var nomeDig = String.format("%s %S", "Olá ", nome)
    JOptionPane.showMessageDialog(null, nomeDig)

    var opcaoBot = JOptionPane.showConfirmDialog(null,"Deseja saber a qual geração você pertence?","teste", JOptionPane.YES_NO_OPTION)
    //opcaoBot.toInt()

    if(opcaoBot == JOptionPane.YES_OPTION){
        var born = JOptionPane.showInputDialog(null,"Qual o ano do seu nascimento?").toInt()

        if(born >=1945 && born <= 1964){
            JOptionPane.showMessageDialog(null, "Você pertence a geração " +ger1)
        }else if(born > 1964 && born <= 1984){
            JOptionPane.showMessageDialog(null, "Você pertence a geração " + ger2)
        }else if(born > 1984 && born <= 1999){
            JOptionPane.showMessageDialog(null,"Você pertence a geração " + ger3)
        }else if(born > 2000 && born <= anoAtual){
            JOptionPane.showMessageDialog(null,"Você pertence a geração "+ ger4)
        }else (JOptionPane.showMessageDialog(null, "Sem informação"))
        /*when(born){
            in 1945..1964 -> JOptionPane.showMessageDialog(null, "Você pertence a geração " +ger1)
            in 1965..1984 -> JOptionPane.showMessageDialog(null, "Você pertence a geração " + ger2)
            in 1985..1999 -> JOptionPane.showMessageDialog(null,"Você pertence a geração " + ger3)
            in 2000 < .. <2022 -> JOptionPane.showMessageDialog(null,"Você pertence a geração "+ ger4)
            else -> JOptionPane.showMessageDialog(null, "Sem informação")
        }*/
    }else if(opcaoBot == JOptionPane.NO_OPTION){
        JOptionPane.showMessageDialog(null,"Execução encerrada")
        System.exit(0)
    }
}
