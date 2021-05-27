package testePrincipal

import Banco
import ContaCorrente
import ContaPoupanca
import Relatorio

fun main(){
    var joaocorrente = ContaCorrente(
        111,
        1000.00
    )
    var mariapoupanca = ContaPoupanca(222,900.00)
    var Nubank = Banco(mutableListOf (joaocorrente,mariapoupanca))

    var relatorio = Relatorio()


Nubank.menu()

}