class Contrato(
    override var nome: String,
    override var tipoDocumento: String
    ): Imprimivel {
    override fun imprimir() {
        println("Eu sou um contrato muito legal - $nome - $tipoDocumento")
    }
}