class Curso(
    var nome: String, /* Investigar: Essa variavel esta sendo apenas utilizada pelo ToString*/
    var codigo: Int,
    var qtMaxAlunos: Int
) {
    var listAlunosMatriculados = mutableListOf<Aluno>()
    var listaProfessorCurso = mutableListOf<Professor>() /*TENTATIVA*/

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
                println("A matricula do aluno $aluno no curso $nome foi realizada com sucesso.")
            } else {
                println("Esperado elemento Aluno")
            }
        } else {
            println("Não foi possivel adicionar $aluno pois a capacidade máxima de $qtMaxAlunos alunos foi atingida no curso de $nome.")
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