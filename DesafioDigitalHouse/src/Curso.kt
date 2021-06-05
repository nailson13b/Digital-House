class Curso(
    var nome: String, /* Investigar: Essa variavel esta sendo apenas utilizada pelo ToString*/
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

    override fun toString(): String  = """
        $nome do código $codigo
    """.trimIndent()
}