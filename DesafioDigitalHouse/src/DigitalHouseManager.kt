
class DigitalHouseManager(
    var listaAlunos: MutableList<Aluno>,
    var listaProfessor: MutableList<Professor>, /* Talvez seja necessario separar essa lista em Lista de Adjunto e Lista de Titular*/
    var listaCurso: MutableList<Curso>,
    var listaMatricula: MutableList<Matricula>

) {
    fun registrarCurso(nome:String, codigoCurso: Int, quantidadeMaximaDeAlunos:Int) {
        var curso = Curso(nome, codigoCurso,quantidadeMaximaDeAlunos)
        listaCurso.add(curso)
        println("Curso ${curso.nome} registrado com sucesso.")
    }

    fun excluirCurso(codigoCurso:Int?){
        for (i in listaCurso) {
            if (i.codigo == codigoCurso){
                listaCurso.remove(i)
                println("Curso $codigoCurso, removido.")
                return
            }
        }
        println("Curso nao existe.")
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, tempoDeCasa: Int = 0, quantidadeDeHoras: Int){
        var professorAdjunto = ProfessorAdjunto(nome, sobrenome, codigoProfessor, tempoDeCasa, quantidadeDeHoras)
        listaProfessor.add(professorAdjunto)
        println("Professor adjunto ${professorAdjunto.nome} registrado com sucesso.")
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigoProfessor: Int, tempoDeCasa: Int = 0, especialidade: String){
        var professorTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, tempoDeCasa, especialidade)
        listaProfessor.add(professorTitular)
        println("Professor titular ${professorTitular.nome} registrado com sucesso.")
    }

    fun excluirProfessor(codigoProfessor: Int){
        for (i in listaProfessor) {
            if (i.codigo == codigoProfessor){
                listaProfessor.remove(i)
                println("Professor $codigoProfessor, removido.")
                return
            }
        }
        println("Professor nao existe.")
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int){
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)
        println("Aluno ${aluno.nome} registrado com sucesso.")
    }

    fun matricularAlunoCurso(codigoAluno: Int, codigoCurso: Int) {
       var aluno: Aluno? = listaAlunos.find {
           codigoAluno == it.codigo
       }
        var curso: Curso? = listaCurso.find {
            codigoCurso == it.codigo
        }
        if (curso != null) {
            if (curso.listAlunosMatriculados.size < curso.qtMaxAlunos) {
                if (aluno != null) {
                    curso.listAlunosMatriculados.add(aluno)
                    var matricula = Matricula(aluno, curso)
                    listaMatricula.add(matricula)
                    println("A matricula do aluno $aluno no curso $curso foi realizada com sucesso.")
                } else {
                    println("Esperado elemento Aluno")
                }
            } else {
                println("Nao foi possivel matricular o aluno $aluno.\n" +
                        "Capacidade maxima de ${curso.qtMaxAlunos} atingida no curso $curso.")
            }
        }

    }

}