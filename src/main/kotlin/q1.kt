import kotlin.random.Random

open class Vehicle : PrivateTrasportationVehicle, ServiceTrasportationVehicle, PublicTrasportationVehicle {
    override fun maxSpeed(): Int {
        return 111
    }

    override fun maxCapacity(): Int {
        return 4
    }
}

interface PublicTrasportationVehicle {
    fun maxSpeed(): Int
    fun maxCapacity(): Int
}

interface ServiceTrasportationVehicle {
    fun maxSpeed(): Int
    fun maxCapacity(): Int
}

interface PrivateTrasportationVehicle {
    fun maxSpeed(): Int
    fun maxCapacity(): Int
}

class Taxi : PublicTrasportationVehicle, Vehicle() {
     override fun maxSpeed(): Int {
        return 100
    }

     override fun maxCapacity(): Int {
        return 4
    }
}

class Bus : Vehicle(), PublicTrasportationVehicle {
     override fun maxSpeed(): Int {
        return 100
    }

     override fun maxCapacity(): Int {
        return 18
    }
}

class Ambulance : ServiceTrasportationVehicle, Vehicle() {
     override fun maxSpeed(): Int {
        return 155
    }

     override fun maxCapacity(): Int {
        return 5
    }
}

class Truck : Vehicle(), ServiceTrasportationVehicle {
     override fun maxSpeed(): Int {
        return 90
    }

     override fun maxCapacity(): Int {
        return 3
    }
}

class SportCar : PrivateTrasportationVehicle, Vehicle() {
     override fun maxSpeed(): Int {
        return 200
    }

     override fun maxCapacity(): Int {
        return 2
    }
}

class HatchBackCar : PrivateTrasportationVehicle, Vehicle() {
     override fun maxSpeed(): Int {
        return 120
    }

     override fun maxCapacity(): Int {
        return 4
    }
}

fun main() {

    val carList = ArrayList<Vehicle>()
    val listOfClass = listOf(Taxi(), Truck(), Bus(), Ambulance(), SportCar(), HatchBackCar())
    for (i in 0 until 10) {
        //creating randomly 10 different object from the Falafel,Pizza and Hamburger classes
        val randomIndex = Random.nextInt(listOfClass.size)
        carList.add(listOfClass[randomIndex])
    }
    println(carList)
    val sortBySpeed = carList.sortByDescending { it.maxSpeed() }
    println("After sort By Speed")
    println(sortBySpeed)
    val sortByCapacity=carList.sortByDescending { it.maxCapacity() }
    println("After sort By capacity")
    println(sortByCapacity)
}




