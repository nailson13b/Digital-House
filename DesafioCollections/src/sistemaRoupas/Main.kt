package sistemaRoupas

fun main() {
    val pecas = listOf(
        listOf(
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null
                override fun retirada() {

                }
            },
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null
                override fun retirada() {

                }
            }
        ),
        listOf(
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null

                override fun retirada() {

                }

            },
            object : Peca() {
                override var tipo: String? = null
                override var marca: String? = null
                override var modelo: String? = null

                override fun retirada() {

                }

            }

        )

    )

    pecas.forEach { lista ->
        println("Pecas da lista ${pecas.indexOf(lista)}")
        lista.forEach { peca ->
            println(" Peca ${lista.indexOf(peca)}")
            peca.tipo = peca.solicitaTipo()
            peca.marca = peca.solicitaMarca()
            peca.modelo = peca.solicitaModelo()
        }
        if (lista == pecas.last())
            println("----------------------------------------\n")
        else
            println()
    }

    val guardaVolumes = GuardarVolumes(identificador = 12345)

    pecas.forEach {
        println("Identificador Pecas ${pecas.indexOf(it)}: ${guardaVolumes.guardarPecas(listaDePecas = it)}")
    }

    println()

    guardaVolumes.mostrarPecas
    println()
    print("Informe o identificador para visualizar as pecas: ")
    val identificador = readLine()?.toInt()
    if (!guardaVolumes.mostrarPecas(identificador = identificador))
        println("Identificador nao encontrado!")
    println()

    var i = 12345

    pecas.forEach {
        if (guardaVolumes.devolverPecas(identificador = 12345))
            println("Pecas ${pecas.indexOf(it)} devolvidas com sucesso!")
        else
            println("Identificador nao encontrado!")
        i++
    }
    println()

    guardaVolumes.mostrarPecas
}