fun main(args: Array<String>) {
    var  countPar:Int=0
    var countImpar=0
    for(i in 1..10 ){

        println("Informe um numero:")
        var numero = readLine()!!.toInt()

        if(numero%2==0){
            countPar++
        }else {
            countImpar++
        }
    }
    println("A quantidade de numeros digitados pares foram $countPar")
    println("A quantidade de numeros digitados impares foram $countImpar")
}

