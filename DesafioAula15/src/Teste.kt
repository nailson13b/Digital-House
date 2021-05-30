fun main() {
    val foto = Foto("Rosto", "RG")
    val documento = Documento("RG","Pessoal")
    val contrato = Contrato("Contrato de aluguel", "Procuracao")
    val impressora = Impressora()
    impressora.inserirImprimivel(foto)
    impressora.inserirImprimivel(documento)
    impressora.inserirImprimivel(contrato)
    impressora.imprimirTodos()
}