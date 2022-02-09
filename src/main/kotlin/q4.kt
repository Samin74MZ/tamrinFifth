fun <T>print(items:ArrayList<T>){
    println(items.toString())
}
fun main(){
    val arrayList = ArrayList<Int>()
    arrayList.add(3)
    arrayList.add(7)
    arrayList.add(9)
    arrayList.add(2)
    arrayList.add(5)
    arrayList.add(5)
    arrayList.add(8)
    arrayList.add(5)
    arrayList.add(6)
    arrayList.add(3)
    arrayList.add(4)
    print(arrayList)

}