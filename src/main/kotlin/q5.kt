fun main(){
    val list1= listOf(1,2,3,4,5)
    list1.sliceList(2)
    val list2= listOf('a','b','c','d','e','f','g')
    list2.sliceList(3)
}
fun <T>List<T>.sliceList(number:Int){
    val r=this.size
    val newList:MutableList<List<T>> =ArrayList()
    if (r%2==0) {
        for (i in 0 until r step number + 1) {
            newList.add(this.slice(i..i + number))
        }
    }else{
        for (i in 0 until r step number+1){
            if (i<r-number) {
                newList.add(this.slice(i..i + number))
            }else{
                newList.add(this.slice(i..i+(r-number)-2))
            }
        }
    }
    println(newList)
}