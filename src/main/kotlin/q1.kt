interface PublicTrasportationVehicle {
    fun maxSpeed()
    fun maxCapacity()
}
interface ServiceTrasportationVehicle {
    fun maxSpeed()
    fun maxCapacity()
}
interface PrivateTrasportationVehicle {
    fun maxSpeed()
    fun maxCapacity()
}
class Taxi:PublicTrasportationVehicle{
    override fun maxSpeed() {

    }

    override fun maxCapacity() {

    }
}
class Bus:PublicTrasportationVehicle{
    override fun maxSpeed() {

    }

    override fun maxCapacity() {

    }
}
class Ambulance:ServiceTrasportationVehicle{
    override fun maxSpeed() {

    }

    override fun maxCapacity() {

    }
}
class Truck:ServiceTrasportationVehicle{
    override fun maxSpeed() {

    }

    override fun maxCapacity() {

    }
}
class SportCar:PrivateTrasportationVehicle{
    override fun maxSpeed() {

    }

    override fun maxCapacity() {

    }
}
class  HatchBackCar:PrivateTrasportationVehicle{
    override fun maxSpeed() {

    }

    override fun maxCapacity() {

    }
}
fun main(){}