class MyGenericClasses<T : Any>(t: T, tt: T) {
    private val value1 = t
    private val value2 = tt
    private var biggerOne = value1
    fun compare(): String {
        var check = 0
        if (this.value1.javaClass != this.value2.javaClass) {
            return "The variable are not comparable"
        } else {

            if (check <= 0) {
                this.biggerOne = this.value2
            }
            return "${this.biggerOne}"
        }
    }
}
fun main() {
    val zero = MyGenericClasses("Sasha", 4)
    println(zero.compare())

}