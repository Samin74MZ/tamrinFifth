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
fun main() {
    val main = Main()
    val listOfEmployee = listOf(
        Manager("Ali", 52, 104.0),
        Clerk("Sama", 26, 110.0),
        Manager("Reza", 42, 120.0),
        Manager("Farhad", 34, 120.0)
    )
    val hours = listOf(140.0, 150.0, 130.0, 180.0)
    val customer1 = Customer("Sara", 22, Gender.Female)
    val customer2 = Customer("Maryam", 30, Gender.Female)
    for (i in listOfEmployee.indices) {
        println(main.toString(listOfEmployee[i]))
    }
    main.totalPayment(listOfEmployee, hours)
    println("Is customer1 with the same customer2:")
    println(customer2 == customer1)

    //Using maxBy that I write
    val listOfManager: MutableList<Manager> = ArrayList()
    for (employee in listOfEmployee) {
        if (employee.javaClass.name == "Manager") {
            listOfManager.add(employee as Manager)
        }
    }
    println(listOfManager.toString())
//     val maxBy = { managers: MutableList<Manager> ->
//         var max = 0
//         var indexOfManager=0
//         for (manager in managers) {
//             if (max < manager.age) {
//                 max = manager.age
//                 indexOfManager=managers.indexOf(manager)
//             }
//         }
//         println(managers[indexOfManager].toString())
//     }
    println("The manager how has maximum age is ")
    // maxBy(listOfManager)
    main.maxBy(listOfManager)
    //kotlin maxBy
    println(listOfManager.maxByOrNull { it -> it.age })
}