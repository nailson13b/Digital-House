class DigitalHouseManager(
    var listaAlunos: MutableList<Aluno>,
    var listaProfessor: MutableList<Professor>, /* Talvez seja necessario separar essa lista em Lista de Adjunto e Lista de Titular*/
    var listaCurso: MutableList<Curso>,
    var listaMatricula: MutableList<Matricula>,
    nome: String,
    codigo: Int,
    qtMaxAlunos: Int

): Curso(nome, codigo, qtMaxAlunos) {


    fun registrarCurso(
        nome: String,
        codigoCurso: Int,
        quantidadeMaximaDeAlunos: Int
    ) {
        var curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        listaCurso.add(curso)
        println("Curso ${curso.nome} registrado com sucesso.")
    }

    fun excluirCurso(codigoCurso: Int?) {
        for (i in listaCurso) {
            if (i.codigo == codigoCurso) {
                listaCurso.remove(i)
                println("Curso $codigoCurso, removido.")
                return
            }
        }
        println("Curso nao existe.")
    }

    fun registrarProfessorAdjunto(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int = 0,
        quantidadeDeHoras: Int
    ) {
        var professorAdjunto = ProfessorAdjunto(
            nome,
            sobrenome,
            codigoProfessor,
            tempoDeCasa,
            quantidadeDeHoras
        )
        listaProfessor.add(professorAdjunto)
        println("Professor adjunto $professorAdjunto registrado com sucesso.")
    }

    fun registrarProfessorTitular(
        nome: String,
        sobrenome: String,
        codigoProfessor: Int,
        tempoDeCasa: Int = 0,
        especialidade: String
    ) {
        var professorTitular = ProfessorTitular(nome, sobrenome, codigoProfessor, tempoDeCasa, especialidade)
        listaProfessor.add(professorTitular)
        println("Professor titular $professorTitular registrado com sucesso.")
    }

    fun excluirProfessor(
        codigoProfessor: Int
    ) {
        for (i in listaProfessor) {
            if (i.codigo == codigoProfessor) {
                listaProfessor.remove(i)
                var curso: Curso? = listaCurso.find {
                    it.listaProfessorAlocados.contains(i)
                }
                curso?.listaProfessorAlocados?.remove(i)
                println("Professor $codigoProfessor, removido.")
                return
            }
        }
        println("Professor nao existe.")
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        listaAlunos.add(aluno)
        println("Aluno $aluno registrado com sucesso.")
    }

    fun matricularAlunoCurso(
        codigoAluno: Int,
        codigoCurso: Int
    ) {
        var aluno: Aluno? = listaAlunos.find {
            codigoAluno == it.codigo
        }
        var curso: Curso? = listaCurso.find {
            codigoCurso == it.codigo
        }



        if (curso != null) {
            if (curso.listAlunosMatriculados.size < curso.qtMaxAlunos) {
                curso.adicionarUmAluno(aluno)
                var matricula = Matricula(aluno, curso)
                listaMatricula.add(matricula)
                println("A matricula do aluno ${matricula.alunoM} no curso ${matricula.cursoM} foi realizada com sucesso em ${matricula.dataM}.")
            } else {
                println("Não foi possivel adicionar $aluno pois a capacidade máxima de ${curso.qtMaxAlunos} alunos foi atingida no curso de ${curso.nome}.")
            }
        }

    }

    fun alocarProfessor(
        codigoCurso: Int,
        codigoProfessorTitular: Int,
        codigoProfessorAdjunto: Int
    ) {
        var curso: Curso? = listaCurso.find {
            codigoCurso == it.codigo
        }

        var professorTitular: Professor? = listaProfessor.find {
            codigoProfessorTitular == it.codigo
        }

        var professorAdjunto: Professor? = listaProfessor.find {
            codigoProfessorAdjunto == it.codigo
        }



        if (professorTitular != null) {
            curso?.listaProfessorAlocados?.add(professorTitular)
            if (professorAdjunto != null) {
                curso?.listaProfessorAlocados?.add(professorAdjunto)
            }
        }
        println("Professores abaixo alocados ao curso de $curso:")
                curso?.listaProfessorAlocados?.forEach { professores ->
                println(professores)


        }

    }


}