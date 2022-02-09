class MyGenericClasses<T : Any>(t: T, tt: T) {
    private val value1 = t
    private val value2 = tt
    private var biggerOne = value1
    fun compare(): String {
        var check = 0
        if (this.value1.javaClass != this.value2.javaClass) {
            return "The variable are not comparable"
        } else {
            if (this.value1 is String && this.value2 is String) {
                check = this.value1.length.compareTo(this.value2.length)
            }
            if (this.value1 is Int && this.value2 is Int) {
                check = this.value1.compareTo(this.value2)
            }
            if (this.value1 is Char && this.value2 is Char) {
                check = this.value1.compareTo(this.value2)
            }
            if (this.value1 is Double && this.value2 is Double) {
                check = this.value1.compareTo(this.value2)
            }
            if (this.value1 is Float && this.value2 is Float) {
                check = this.value1.compareTo(this.value2)
            }
            if (this.value1 is Long && this.value2 is Long) {
                check = this.value1.compareTo(this.value2)
            }
            if (this.value1 is Short && this.value2 is Short) {
                check = this.value1.compareTo(this.value2)
            }
            if (this.value1 is ArrayList<*> && this.value2 is ArrayList<*>) {
                check = this.value1.size.compareTo(this.value2.size)
            }

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
    val one = MyGenericClasses(8, 4)
    println(one.compare())
    val two = MyGenericClasses("Samin", "Sara")
    println(two.compare())
    val three = MyGenericClasses('c', 'o')
    println(three.compare())
    val arrayList2 = ArrayList<String>()
    arrayList2.add("Samin")
    arrayList2.add("Sara")
    arrayList2.add("Amin")
    arrayList2.add("water")
    arrayList2.add("Baby")
    val arrayList1 = ArrayList<String>()
    arrayList1.add("Samin")
    arrayList1.add("Sara")
    arrayList1.add("Amin")
    arrayList1.add("Baby")
    val four = MyGenericClasses(arrayList2, arrayList1)
    println(four.compare())
    val five = MyGenericClasses(arrayList2, "Setare")
    println(five.compare())

}