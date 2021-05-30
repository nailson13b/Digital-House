package exercicios

fun main(){
 var prova = Prova()
 var numeros = Numeros()

    numeros.difNumbers
    numeros.listNumbers.add(5)
    numeros.listNumbers.add(5)
    numeros.listNumbers.add(6)
    numeros.listNumbers.add(7)
    numeros.listNumbers.add(8)
    numeros.listNumbers.add(8)
    numeros.listNumbers.add(8)

    numeros.listNumbers.forEach {
        println(it)
    }
    println(prova.somaTotal(set = numeros.listNumbers))
}