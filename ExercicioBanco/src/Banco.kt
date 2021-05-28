import java.lang.ref.Cleaner
import java.util.*

class Banco(
    var listaDeContas: MutableList<ContaBancaria>
) : Imprimivel {

    fun inserir() {
        var reader = Scanner(System.`in`)
        println(
            "Para criar uma conta digite :\n" +
                    "1- Conta Poupanca\n" +
                    "2- Conta Corrente\n" +
                    "3- Retornar"
        )
        var answer1: Int = reader.nextInt()
        when {
            (answer1 == 1) -> {
                println("Digite o numero da sua conta:\n")
                var numero: Int = reader.nextInt()

                println("Informe o seu primeiro deposito:\n")
                var deposito: Double = reader.nextDouble()

                var conta = ContaPoupanca(numero, deposito)
                conta.criarConta(numero, deposito)
                listaDeContas.add(conta)
                println("Conta Poupança numero: ${conta.numeroDaConta}, criada.")
            }
            (answer1 == 2) -> {
                println("Digite o numero da sua conta:\n")
                var numero: Int = reader.nextInt()

                println("Informe o seu primeiro deposito:\n")
                var deposito: Double = reader.nextDouble()

                var conta = ContaCorrente(numero, deposito)
                conta.criarConta(numero, deposito)
                listaDeContas.add(conta)
                println("Conta Corrente numero: ${conta.numeroDaConta}, criada.")
            }
            (answer1 == 3) -> {
                menu()

            }
        }
    }

    //TODO IMPLEMENTAR RETORNO PARA CONTA NAO ENCONTRADA PARA SER DELETADA
    fun remover(numero: Int) {
        for (i in listaDeContas) {
            if (i.numeroDaConta == numero) {
                listaDeContas.remove(i)
                println("Conta ${numero}, removida.")
                return
                // break
            }
        }
        println("Conta nao existe")

    }

    //TODO IMPLEMENTAR RETORNO PARA CONTA NAO ENCONTRADA
    fun procurarConta(conta: Int) {
        for (i in listaDeContas) {
            if (i.numeroDaConta == conta) {
                println("Conta encontrada")
                println(
                    "Selecione o servico: \n" +
                            "1- Sacar \n" +
                            "2- Depositar \n" +
                            "3- Relatorio\n" +
                            "4- Retornar ao Menu\n"
                )
                val reader = Scanner(System.`in`)
                val answer = reader.nextInt()
                when {
                    (answer == 1) -> {
                        println("Qual o valor deseja sacar: \n")
                        val answer2 = reader.nextDouble()
                        i.sacar(answer2)
                    }
                    (answer == 2) -> {
                        println("Qual o valor deseja depositar: \n")
                        val answer3 = reader.nextDouble()
                        i.depositar(answer3)

                    }
                    (answer == 3) -> {
                        val relatorio = Relatorio()
                        relatorio.gerarRelatorio(i)

                    }

                }


            }
        }

    }

    //TODO IMPLEMENTAR IMPRIMIVEL DO LIMITE E TAXA DA POUPANCA E CORRENTE
    override fun mostrarDados() {
        listaDeContas.forEach {
            println(
                "Numero da conta: ${it.numeroDaConta}.\n" +
                        "Saldo atual: R$${it.saldo}\n"
            )
        }
    }

    fun menu() {
        println(
            "----- BEM VINDO AO BANK -----\n" +
                    "Digite o numero correspondente ao servico desejado: \n" +
                    "1- Criar Conta\n" +
                    "2- Procurar uma conta\n" +
                    "3- Finalizar\n"
        )
        var reader = Scanner(System.`in`)
        var answer = reader.nextInt()

        while (answer != 3) {
            when {
                (answer == 1) -> {
                    inserir()
                    menu()
                }
                (answer == 2) -> {
                    println("Digite o numero da conta desejada: ")
                    var reader = Scanner(System.`in`)
                    var answer = reader.nextInt()
                    procurarConta(answer)
                    menu()
                }
                (answer == 3) -> {
                    println("Aplicativo finalizado")
                }
                else -> {
                    println("Opcao invalida")
                    menu()
                }
            }
        }
    }

}