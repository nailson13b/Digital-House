import java.util.*

class Matricula(
    var alunoM: Aluno?,
    var cursoM: Curso?,
    var dataM: Date = Date()

) {
        override fun toString(): String = """
        $alunoM matriculado no curso $cursoM em $dataM
    """.trimIndent()


}