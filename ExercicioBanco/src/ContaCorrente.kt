class ContaCorrente(
    override var numeroDaConta: Int,
    override var saldo: Double,
    val taxaDeOperacao: Double = 50.00
) : ContaBancaria(), Imprimivel {
    override fun criarConta(numero: Int, primeiroDeposito: Double) {
        numeroDaConta = numero
        saldo = primeiroDeposito
    }

    override fun sacar(value: Double) {
        if (value > (saldo - taxaDeOperacao)){
            println("Saldo insuficiente.")
        } else {
            saldo -= value + taxaDeOperacao
            println("Saque de R$$value realizado com sucesso e taxa de R$$taxaDeOperacao cobrada.")
        }
    }

    override fun depositar(value: Double) {
        this.saldo += value - taxaDeOperacao
        println("Deposito de R$$value realizado com sucesso e taxa de R$$taxaDeOperacao cobrada.")
    }

    override fun mostrarDados() {
        println("Numero da conta: $numeroDaConta.\n" +
                "Saldo atual: R$$saldo.\n" +
                "Taxa de operacao: R$$taxaDeOperacao. \n")

    }

}