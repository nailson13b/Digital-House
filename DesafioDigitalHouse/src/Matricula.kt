import java.util.*

class Matricula(
    var alunoM: Aluno,
    var cursoM: Curso,
    var dataM: Date = Date()

) {

    fun criarMatricular(aluno: Aluno, curso: Curso){
        alunoM = aluno
        cursoM = curso
        println("Aluno $alunoM matriculado no curso de $cursoM em $dataM")

    }

}