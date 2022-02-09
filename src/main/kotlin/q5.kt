fun main(){
    val list1= listOf(1,2,3,4,5)
    sliceList(list1,2)
    val list2= listOf('a','b','c','d','e','f','g')
    sliceList(list2,3)
}
fun <T>sliceList(items:List<T>,number:Int){
    val r=items.size
    val newList:MutableList<List<T>> =ArrayList()
    if (r%2==0) {
        for (i in 0 until r step number + 1) {
            newList.add(items.slice(i..i + number))
        }
    }else{
        for (i in 0 until r step number+1){
            if (i<r-number) {
                newList.add(items.slice(i..i + number))
            }else{
                newList.add(items.slice(i..i+(r-number)-2))
            }
        }
    }
    println(newList)
}