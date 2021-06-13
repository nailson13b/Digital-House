package principal

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



    digitalHouseManager.registrarProfessorTitular("Severus", "Snape", 1111, 0, "Kotlin")
    digitalHouseManager.registrarProfessorAdjunto("Alastor", "Moody",2222, 0, 2)
    digitalHouseManager.registrarProfessorTitular("Minerva", "McGonagall", 3333, 0, "Full Stack")
    digitalHouseManager.registrarProfessorAdjunto("Remo", "Lupin",4444, 0, 3)

    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    digitalHouseManager.matricularAluno("Harry", "Potter", 9999)
    digitalHouseManager.matricularAluno("Hermione", "Granger", 8888)
    digitalHouseManager.matricularAluno("Rony", "Weasley", 7777)
    digitalHouseManager.matricularAluno("Draco", "Malfoy", 6666)
    digitalHouseManager.matricularAluno("Cedrico", "Diggory", 5555)

    digitalHouseManager.matricularAlunoCurso(9999,20001)
    digitalHouseManager.matricularAlunoCurso(8888,20001)
    digitalHouseManager.matricularAlunoCurso(7777,20002)
    digitalHouseManager.matricularAlunoCurso(6666,20002)
    digitalHouseManager.matricularAlunoCurso(5555,20002)

    digitalHouseManager.alocarProfessor(20001, 1111,4444)
    digitalHouseManager.alocarProfessor(20002, 3333, 2222)



}