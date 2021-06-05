open class Aluno(
    override var nome: String,
    override var sobrenome: String,
    override var codigo: Int
) : Pessoa() {
    override fun equals(other: Any?): Boolean {
        val outroAluno = other as? Aluno
        return when (other) {
            is Aluno -> {
                this.codigo == outroAluno?.codigo
            }
            else -> {
                return super.equals(other)
            }
        }
    }

    override fun toString(): String = """
        $nome $sobrenome com o código: $codigo
    """.trimIndent()

}