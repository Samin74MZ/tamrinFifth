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
class Clerk(override val name: String, override val age: Int, override val hourRate: Double) : Employee() {
    override fun salary(hours: Double): Double {
        return hourRate * hours / 2
    }
}

enum class Gender {
    Female,
    Male
}
data class Customer(val name: String, val age: Int, val gender: Gender)
class Main {
    fun toString(input: Employee): String {
        return input.javaClass.name + ": " + input.toString()
    }

    private var totalPayment = 0.0
    fun totalPayment(input: List<Employee>, hours: List<Double>) {
        for (employee in input) {
            this.totalPayment += employee.salary(hours[input.indexOf(employee)])
        }
        println("The total payment of all is " + this.totalPayment)
    }

    val maxBy = { managers: MutableList<Manager> ->
        var max = 0
        var indexOfManager = 0
        for (manager in managers) {
            if (max < manager.age) {
                max = manager.age
                indexOfManager = managers.indexOf(manager)
            }
        }
        println(managers[indexOfManager].toString())
    }
}
