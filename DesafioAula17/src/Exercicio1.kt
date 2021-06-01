
fun main(){
    var arrayList: MutableList<String> = mutableListOf()

    arrayList.add("Pato")
    arrayList.add("Cachorro")
    arrayList.add("Gato")

    try {
        println(arrayList[3])
    } catch (e: IndexOutOfBoundsException) {
        println(e.localizedMessage)
    }
}