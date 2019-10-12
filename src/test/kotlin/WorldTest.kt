import org.junit.Assert.*
import org.junit.Test

class WorldTest {

    @Test
    fun `Test a new world is empty`(){
        val world = World()

        val size = world.livingCells.size

        assertEquals(0, size)
    }

    @Test
    fun `Test a cell can be added to the world`(){
        val world = World()

        world.setLivingAt(1, 1)
        val size = world.livingCells.size

        assertEquals(1, size)
    }
}