package exercicios

open class Prova {

    fun somaTotal(set: MutableList<Int>): Int = set.reduce {
        sum, element -> sum + element
    }

}