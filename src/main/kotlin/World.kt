class World {
    var livingCells = listOf<Int>()

    fun setLivingAt(location: Location){

    }

    fun isEmpty(){

    }

    fun isAliveAt(location: Location){

    }

}

class LivingCell(var location: Location)
class DeadCell(var location: Location)

data class Location(val x: Int, val y: Int)