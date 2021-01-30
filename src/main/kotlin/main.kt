interface computerDrive{
    val capacity: Double
    val speed: Double
    fun readData():String
    fun writeData():String
}

interface processor{

}

open class computer(drive: computerDrive, amd: processor): computerDrive by drive{
    fun start(){

    }
}





fun main() {

}
