
// Interfaces
// - Basic definitions
// - Default methods
// - Properties
// - There is not state


class Robot(var firstName:String, var lastName:String)
// funciones que cualquier clase de esta interfaz va a incluir
interface RobotManager{
    // firma de la función, sin comportamiento
    fun setRobot(firsName: String, lastName: String)
    // función
    fun setRobotInstance(robot: Robot){
        // está haciendo una llamada a la otra función
        setRobot(robot.firstName, robot.lastName)
    }
}

class MyRobotManager : RobotManager{
    override fun setRobot(firsName: String, lastName: String) {
        println("First Name : $firsName, Last Name : $lastName")
    }
    override fun setRobotInstance(robot: Robot) {
        println("Robot Initialized")
    }
}
fun main(){
    val robot = Robot("John","Doe")
    val manager = MyRobotManager()
    manager.setRobot("Vero", "Gallardo")
    manager.setRobotInstance(robot)
}