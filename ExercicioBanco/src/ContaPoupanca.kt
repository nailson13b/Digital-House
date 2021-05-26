import java.util.*

class ContaPoupanca(
    override var numeroDaConta: Int,
    override var saldo: Double = 0.00,
    var limite: Double = 1000.00
) : ContaBancaria(), Imprimivel {



    override fun criarConta(numero: Int, primeiroDeposito: Double) {
        numeroDaConta = numero
        saldo = primeiroDeposito
    }

    override fun sacar(value: Double) {
        when {
            value <= saldo -> {
                saldo -= value
                println("Saque de R$$value realizado com sucesso.")
            }
            value > saldo ->{
                println(
                    "Saldo insuficiente! Você deseja utilizar o seu limite especial atual de R$$limite?\n" +
                            "Digite 1 para SIM ou 2 para NÃO\n")
                var reader = Scanner(System.`in`)
                var answer: Int = reader.nextInt()
                if (answer == 1) {
                    var total = saldo + limite
                    limite = total - value
                    saldo = 0.00
                    println("Saque de R$$value realizado com sucesso do seu limite especial.")
                } else {
                    println("Operação encerrada.")
                }
            }
        }
    }

    override fun depositar(value: Double) {
        if (limite < 1000.00 && value > 1000.00 - limite) {
                var total = limite + value
                saldo = total - 1000.00
                limite = (total - saldo)
            println("Você depositou R$$value e seu saldo atual é de R$${this.saldo} e seu cheque especial foi restabelecido para R$${limite}.")
            } else {
            saldo = 0.00
            limite += value

            //this.saldo += value
            println("Você depositou R$$value e seu saldo atual é de R$${this.saldo} e seu cheque especial foi restabelecido para R$${limite}.")
        }

    }

    override fun mostrarDados() {
        println(
            "Numero da conta: $numeroDaConta.\n" +
                    "Saldo atual: R$$saldo.\n" +
                    "Limite disponivel: R$$limite.\n"
        )
    }
}