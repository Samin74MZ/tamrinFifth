import java.util.*
import kotlin.math.pow

object ChangeType{
    fun changeToBinary(input: Int): String {
        return Integer.toBinaryString(input)
    }
    fun changeToDecimal(input:Long):Int{
        var number=input
        var decimalNumber=0
        var i=0
        var remainder:Long
        while (number.toInt()!=0){
            remainder=number%10
            number/=10
            decimalNumber+=(remainder* 2.0.pow(i.toDouble())).toInt()
            i++
        }
        return decimalNumber
    }
}
fun main(){
    val reader= Scanner(System.`in`)
    println("What kind of number do you want to change?(B/D)")
    val type= readLine()
    println("Enter your number:")
    if (type=="B"){
        val number=reader.nextLong()
        println("After change:")
        println(ChangeType.changeToDecimal(number))
    }
    if (type=="D"){
        val number=reader.nextInt()
        println("After change:")
        println(ChangeType.changeToBinary(number))
    }

}