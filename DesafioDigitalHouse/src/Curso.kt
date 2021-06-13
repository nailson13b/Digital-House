open class Curso(
    var nome: String,
    var codigo: Int,
    var qtMaxAlunos: Int
) {
    var listAlunosMatriculados = mutableListOf<Aluno>()
    var listaProfessorAlocados = mutableListOf<Professor>()

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
            println("Não foi possivel adicionar $aluno pois a capacidade máxima de $qtMaxAlunos alunos foi atingida no curso de $nome.")
        }
    }

    open fun excluirAluno(aluno: Int) {
        for (i in listAlunosMatriculados) {
            if (i.codigo == aluno) {
                listAlunosMatriculados.remove(i)
                println("Aluno $i removido.")
                return
            }
        }
        println("Aluno não matriculado.")
    }
}