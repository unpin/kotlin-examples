package specialclasses

import java.util.Random

open class Device(var name: String)
interface Infrared {
    fun send() {}
}

object RCtrl : Device("Remote Control"), Infrared {
    fun send(command: Int) {
        println(command)
    }
}

// object RCtrl : Device("Local Control")

class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun main() {
    RCtrl.send(1)

    var rCtrl1 = RCtrl
    var rCtrl2 = RCtrl
    rCtrl1.name = "TV Control"
    println("rCtrl2 name = ${rCtrl2.name}")


    val d1=LuckDispatcher()
    val d2=LuckDispatcher()

    d1.getNumber()
    d2.getNumber()
}