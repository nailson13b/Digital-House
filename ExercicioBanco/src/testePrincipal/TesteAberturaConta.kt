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



//    Nubank.inserir(joaocorrente)
//
//    Nubank.mostrarDados()
//
//    Nubank.remover(mariapoupanca)
//

//    relatorio.gerarRelatorio(Nubank)

Nubank.menu()
//    Nubank.inserir(333,500.00)
//    Nubank.inserir(444,1000.00)
//    Nubank.mostrarDados()
//    println("--------------------------------")
////    Nubank.remover(333)
//    Nubank.procurarConta(333)
//    Nubank.mostrarDados()
}