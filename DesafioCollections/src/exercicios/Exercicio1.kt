package exercicios

var dicionario = Dicionario()

fun main() {

    dicionario.loteriaSonhos.forEach {
        println("O numero eh ${it.key} e o valor eh ${it.value}.")
    }

    dicionario.apelidos.forEach { entry ->
        entry.value.forEach { apelido ->
            println("${entry.key} - $apelido")
        }


    }

    val nomeApelido = StringBuilder()
    dicionario.apelidos.forEach { entry ->

        nomeApelido.append("${entry.key} - ")
        entry.value.forEach { apelido ->
            nomeApelido.append("$apelido ")
        }
        nomeApelido.appendLine()

    }
    println(nomeApelido.toString())
}



