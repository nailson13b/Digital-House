class ProfessorAdjunto(
    override var nome: String,
    override var sobrenome: String,
    override var codigo: Int,
    override var tempoDeCasa: Int,
    var quantidadeDeHoras: Int
) : Professor() {

    override fun toString(): String  = """
        Professor Adjunto: $nome $sobrenome - $codigo
    """.trimIndent()

    override fun equals(other: Any?): Boolean {
        val outroProfessor = other as? ProfessorAdjunto //talvez precise deixar apenas a Professor ao inves de ProfessorAdjunto
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