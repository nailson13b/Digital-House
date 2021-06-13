class ProfessorTitular(
    override var nome: String,
    override var sobrenome: String,
    override var codigo: Int,
    override var tempoDeCasa: Int,
    var especialidade: String
) : Professor() {

    override fun toString(): String  = """
        Professor Titular: $nome $sobrenome - $codigo
    """.trimIndent()

    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? ProfessorTitular
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