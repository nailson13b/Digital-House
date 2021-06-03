class ProfessorAdjunto(
    override var nome: String,
    override var sobrenome: String,
    override var codigo: Int,
    override var tempoDeCasa: Int,
    var horasDeMonitoria: Int
) : Professor() {

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