package teste

import Aluno
import Curso
import DigitalHouseManager
import Matricula
import Professor

fun main(){
//    var maria = Aluno("Maria", "Silva", 1234)
//    var listA = mutableListOf(maria)
//    var android = Curso("Android", 9999,30,listA)
//    var matricula = Matricula(maria, android)
//
//    matricula.criarMatricular(maria, android)


    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessor = mutableListOf<Professor>()
    var listaCurso = mutableListOf<Curso>()
    var listaMatricula = mutableListOf<Matricula>()
    var digitalHouseManager = DigitalHouseManager(listaAlunos,listaProfessor, listaCurso, listaMatricula)

    digitalHouseManager.registrarCurso("Android", 123456, 3)
    digitalHouseManager.matricularAluno("Nailson", "Oliveira", 1313)
    digitalHouseManager.registrarCurso("Ruby", 166666, 2)
    digitalHouseManager.matricularAluno("Joao", "Oliveira", 1111)
    digitalHouseManager.matricularAluno("Maria", "Oliveira", 2222)
    digitalHouseManager.matricularAlunoCurso(1313,166666)
    digitalHouseManager.matricularAlunoCurso(1111,166666)
    digitalHouseManager.matricularAlunoCurso(2222,166666)
    digitalHouseManager.listaMatricula.forEach {
        println(it)
    }

}