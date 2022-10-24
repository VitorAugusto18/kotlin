import java.util.*

fun main (args: Array<String>){

    val paises = arrayOf("Brasil", "Chile", "Angola", "Canada","EUA")
    paises.sort() //ordenação alfabética da lista de países
    println("Qual país você quer saber a posição na lista?")
    var posPais = readLine().toString()
    val posicao = Arrays.binarySearch(paises, posPais)
    val tamanho = paises.count()
    //paises.reverse() -> invertendo a ordem da lista
    //paises.sortBy{it.length >6 }
    /*paises.forEach{
        println("$it")
    } usando o laço for each para trazer ordenação da lista de acordado com o solicitado no sortBy*/
    println("O país "+posPais+" está na posição "+posicao+ " de uma lista de tamanho "+tamanho)
}