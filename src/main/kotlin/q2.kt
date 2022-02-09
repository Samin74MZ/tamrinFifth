abstract class Employee {
    abstract val name: String
    abstract val age: Int
    abstract val hourRate: Double
    abstract fun salary(hours: Double): Double
    override fun toString(): String {
        return "name:$name age: $age hourRate:$hourRate"
    }
}
class Manager(override val name: String, override val age: Int, override val hourRate: Double) : Employee() {
    override fun salary(hours: Double): Double {
        return hourRate * hours
    }

}