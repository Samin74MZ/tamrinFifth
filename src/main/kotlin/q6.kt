fun main(){
    val n=5
    println("Your input is: $n")  //O(1) complexity is 1

    //O(n) complexity is 5
    for ( i in 0.. n) {
        println("Your output is $i")
    }
    //O(n^2)  complexity is  25
    for ( i in 1.. n) {
        for( j in 1.. n) {
            println("Your output is $i and $j")
        }
    }
    //O(n!) complexity is 120
    for ( i in 1..factorial(n)){
        println("Your output is $i")
    }
}
fun factorial(n:Int):Long{
    var factorial=1
    for(k in 1..n){
        factorial*=k
    }
    return factorial.toLong()
}