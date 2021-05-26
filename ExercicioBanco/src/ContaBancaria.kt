abstract class ContaBancaria {

    abstract val numeroDaConta: Int
    abstract var saldo: Double

    abstract fun criarConta(numero: Int, primeiroDeposito: Double)


    abstract fun sacar(
        value: Double
    )

    abstract fun depositar(
        value: Double
    )

    fun transferir(value: Double, contaBancaria: ContaBancaria) {
        sacar(value)
        contaBancaria.depositar(value)
    }

}