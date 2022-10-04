fun main(args: Array<String>){
    var PtExerc = 0
    var PtPr1 = 0
    var PtPrF=0
    var TotalF = 0

    println("Qual foi sua pontuação nos exercícios?")
    PtExerc = readLine()?.toInt()!!
    println("Qual foi sua pontuação na primeira prova?")
    PtPr1 = readLine()?.toInt()!!
    println("Qual foi sua pontuação na prova final?")
    PtPrF = readLine()?.toInt()!!

    TotalF = PtExerc + PtPr1 + PtPrF
    TotalF.toInt()!!

    if(TotalF >=0 && TotalF< 60){
        println("Reprovado -> " + TotalF)
    }else if( TotalF >=60 && TotalF<=70){
            println("Na média" + TotalF)
    }else if(TotalF > 70 && TotalF <=100 ){
        println("Aprovado" + TotalF)
    }else {
        println("Nota inválida")
    }

}