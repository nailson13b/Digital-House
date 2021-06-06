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

    digitalHouseManager.registrarCurso("Android", 123456, 30)
    digitalHouseManager.matricularAluno("Nailson", "Oliveira", 1313)
    digitalHouseManager.matricularAlunoCurso(1313,123456)

}