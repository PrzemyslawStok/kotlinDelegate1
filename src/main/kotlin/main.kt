interface computerDrive {
    val capacity: Double
    val speed: Double
    fun readData(): String
    fun writeData(): String
}

class ssd(override val capacity: Double, override val speed: Double) : computerDrive {
    override fun readData(): String {
        return "readData - ssd"
    }

    override fun writeData(): String {
        return "writeData - ssd"
    }

}

interface processor {
    val processorSpeed: Double
    val noCores: Double

    fun starProgram(): String
}

class interCorei7(override val processorSpeed: Double, override val noCores: Double) : processor {
    override fun starProgram(): String {
        return "startProgram"
    }

}

open class computer(drive: computerDrive, Processor: processor) : computerDrive by drive, processor by Processor {
    fun start() {
        println(readData())
        println(writeData())
    }
}


fun main() {

}
