abstract class Professor : Pessoa() {
    abstract override var nome: String
    abstract override var sobrenome: String
    abstract override var codigo: Int
    abstract var tempoDeCasa: Int

    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? Professor
        return when(other) {
            is Professor -> {
                this.codigo == outroProfessor?.codigo
            }
            else -> {
                return super.equals(other)
            }
        }
    }
}