package exercicios

var numeros = Numeros()

fun main(){
    println(numeros.listNumbers)
    numeros.listNumbers.add(1)
    numeros.listNumbers.add(5)
    numeros.listNumbers.add(5)
    numeros.listNumbers.add(6)
    numeros.listNumbers.add(7)
    numeros.listNumbers.add(8)
    numeros.listNumbers.add(8)
    numeros.listNumbers.add(8)
    println(numeros.listNumbers)

    println(numeros.setNumbers)
    numeros.setNumbers.add(1)
    numeros.setNumbers.add(5)
    numeros.setNumbers.add(5)
    numeros.setNumbers.add(6)
    numeros.setNumbers.add(7)
    numeros.setNumbers.add(8)
    numeros.setNumbers.add(8)
    numeros.setNumbers.add(8)
    println(numeros.setNumbers)

    numeros.setNumbers.forEach {
        println(it)
    }

    numeros.difNumbers["Numero"] = 1
    numeros.difNumbers["Numero1"] = 5
    numeros.difNumbers["Numero2"] = 5
    numeros.difNumbers["Numero3"] = 6
    numeros.difNumbers["Numero4"] = 7
    numeros.difNumbers["Numero5"] = 8
    numeros.difNumbers["Numero6"] = 8
    numeros.difNumbers["Numero7"] = 8

    numeros.difNumbers.forEach {
        println(it)
    }

}