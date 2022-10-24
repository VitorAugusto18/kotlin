import java.util.*

fun main (args: Array<String>){

    val paises = arrayOf("Brasil", "Chile", "Angola", "Canada","EUA")
    paises.sort()
    println("Qual país você quer saber a posição na lista?")
    var posPais = readLine().toString()
    val posicao = Arrays.binarySearch(paises, posPais)
    val tamanho = paises.count()
    //paises.reverse()
    //paises.sort()
    //paises.sortBy{it.length >6 }
    /*paises.forEach{
        println("$it")
    }*/
    println("O país "+posPais+" está na posição "+posicao+ " de uma lista de tamanho "+tamanho)
}