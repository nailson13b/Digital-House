package testePrincipal

import Banco
import ContaCorrente
import ContaPoupanca

fun main(){
    var joaocorrente = ContaCorrente(
        111,
        1000.00
    )
    var mariapoupanca = ContaPoupanca(222,900.00)
    var Bank = Banco(mutableListOf (joaocorrente,mariapoupanca))




    Bank.menu()

}


//    mariapoupanca.sacar(1000.00) //S: 0, L: 900
//    mariapoupanca.depositar(50.00) //S:0, L: 950
//    mariapoupanca.depositar(49.00) //S:0, L: 999
//    mariapoupanca.depositar(2.00) //S:1, L: 1000
//    mariapoupanca.sacar(1.00)
//    mariapoupanca.transferir(100.00, joaocorrente) //S:0, L: 900
//    joaocorrente.transferir(150.00, mariapoupanca)//S:50, L:1000 -- S:900
//
//
//    relatorio.gerarRelatorio(mariapoupanca)
//    relatorio.gerarRelatorio(joaocorrente)



//override fun sacar(value: Double) {
//    if (value <= saldo) {
//        saldo -= value
//        println("Saque de R$$value realizado com sucesso.")
//    } else if (value > saldo) {
//        println(
//            "Saldo insuficiente! Você deseja utilizar o seu limite especial atual de R$$limite?\n" +
//                    "Selecione 1 para SIM ou 2 para NÃO"
//        )
//        var reader = Scanner(System.`in`)
//        var answer: Int = reader.nextInt()
//        if (answer == 1 && value < limite) {
//            limite -= value
//            println("Saque de R$$value realizado com sucesso do seu limite especial.")
//        } else {
//            println("Operação encerrada.")
//        }
//    }
//}