import java.util.*

class Matricula(
    var alunoM: Aluno?,
    var cursoM: Curso?,
    var dataM: Date = Date()

) {

    fun criarMatricular(alunoM: Aluno?, cursoM: Curso?){

        println("Aluno $alunoM matriculado no curso de $cursoM em $dataM")

    }

    override fun toString(): String = """
        $alunoM matriculado no curso $cursoM
    """.trimIndent()


}