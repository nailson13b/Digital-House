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

    fun adicionarUmAluno(aluno: Aluno?) {
        if (listAlunosMatriculados.size < qtMaxAlunos) {
            if (aluno != null) {
                listAlunosMatriculados.add(aluno)
            } else {
                println("Esperado elemento Aluno")
            }
        } else {
            println("Capacidade máxima de $qtMaxAlunos atingida.")
        }
    }

    fun excluirAluno(aluno: Aluno) {
        for (i in listAlunosMatriculados) {
            if (i.codigo == aluno.codigo) {
                listAlunosMatriculados.remove(i)
                println("Aluno $i removido.")
                return
            }
        }
        println("Aluno não matriculado.")
    }
}