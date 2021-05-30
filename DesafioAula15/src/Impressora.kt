class Impressora (
    val listaImprimivel: MutableList<Imprimivel> = mutableListOf()
) {
    fun imprimirTodos(){
        listaImprimivel.forEach {
            it.imprimir()
        }
    }
}
//{
//    fun inserirImprimivel(imprimivel: Imprimivel){
//        listaImprimivel.add(imprimivel)
//}

fun Impressora.inserirImprimivel(imprimivel: Imprimivel) = this.listaImprimivel.add(imprimivel)