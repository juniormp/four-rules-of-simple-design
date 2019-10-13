import org.junit.Assert.*
import org.junit.Test

class WorldTest {

    /*
        Focusing on the symmetry between a good test
         name and the code under test is a subtle design technique.

         Make sure that you are actually testing what you say you are testing.
     */

    @Test
    fun `Test a new world is empty`(){
        val world = World()

        //val size = world.livingCells.size
        val isEmpty = world.isEmpty()

        assertEquals(true, isEmpty)
    }

    @Test
    fun `Test a cell can be added to the world`(){
        val world = World()
        val location = Location(1, 1)

        world.setLivingAt(location)
        //val size = world.livingCells.size
        val isAliveAt = world.isAliveAt(location)

        assertEquals(true, isAliveAt)
    }
}
