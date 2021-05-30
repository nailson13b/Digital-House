package sistemaRoupas

abstract class Peca {
    abstract var tipo: String?
    abstract var marca: String?
    abstract var modelo: String?

    val solicitaTipo: () -> String? = {
        print(" Informe o tipo: ")
        readLine()
    }

    val solicitaMarca: () -> String? = {
        print(" Informe a marca: ")
        readLine()
    }

    val solicitaModelo: () -> String? = {
        print(" Informe o modelo: ")
        readLine()
    }

    abstract fun retirada()
}