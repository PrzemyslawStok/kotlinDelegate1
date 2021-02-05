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

class amdRyzen7(override val processorSpeed: Double, override val noCores: Double) : processor {
    override fun starProgram(): String {
        return "startProgram"
    }
}

open class computer(drive: computerDrive, Processor: processor) : computerDrive by drive, processor by Processor {
    fun start() {
        println(readData())
        println(writeData())
    }

    fun info() {
        println("processor speed $processorSpeed")
        println("drive speed $speed")
    }
}

class server(drive: computerDrive, Processor: processor) : computer(drive, Processor) {

}


fun main() {
    val simpleComputer = computer(ssd(2048.0, 500.0), interCorei7(1000.0, 4.0))
    simpleComputer.start()
    simpleComputer.info()

    val nextComputer = computer(ssd(1024.0, 1024.0), amdRyzen7(1500.0, 8.0))
    nextComputer.start()
    nextComputer.info()
}
