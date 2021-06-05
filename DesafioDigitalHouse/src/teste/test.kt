package teste

import Aluno
import Curso
import Matricula

fun main(){
    var maria = Aluno("Maria", "Silva", 1234)
    var listA = mutableListOf(maria)
    var android = Curso("Android", 9999,30,listA)
    var matricula = Matricula(maria, android)

    matricula.criarMatricular(maria, android)


}