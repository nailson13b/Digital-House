import java.lang.ArithmeticException
import kotlin.jvm.Throws

class CalculoMatematico {
    @Throws(ArithmeticException::class)
    fun divisao(x: Int, y: Int): Int {
        return if (y == 0) {
            throw ArithmeticException("Divisao por zero")
        } else {
            x / y
        }
    }
}

fun main() {
    val calculoMatematico = CalculoMatematico()


    try {
        println(calculoMatematico.divisao(4,0))
    } catch (e: ArithmeticException) {
        println(e.message)
    }

}