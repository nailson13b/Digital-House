class Curso(
    var nome: String,
    var codigo: Int,
    var qtMaxAlunos: Int,
    var listAlunosMatriculados: MutableList<Aluno>
) {
    override fun equals(other: Any?): Boolean {
        val outroCurso = other as? Curso
        return when(other) {
            is Curso -> {
                this.codigo == outroCurso?.codigo
            }
            else -> {
                return super.equals(other)
            }
        }
    }
}