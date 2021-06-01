import java.lang.NullPointerException

fun main() {
    val arrayList: MutableList<String>? = null
    val arrayList2: MutableList<String> = mutableListOf()

    arrayList?.add("Pato")
    arrayList?.add("Cachorro")
    arrayList?.add("Gato")

    arrayList2.add("Pato")
    arrayList2.add("Cachorro")
    arrayList2.add("Gato")



    try {
//        println(arrayList!![2])
        println(arrayList2[5])
    } catch (e: NullPointerException) {
        println(e.stackTraceToString())
    } catch (e: IndexOutOfBoundsException){
        println(e.stackTraceToString())
    }
}