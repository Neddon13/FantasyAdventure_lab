package SpellTest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Spells.*;

public class WaterTest {

    Water water;

    @Before
    public void before(){
        water = new Water(75);
    }

    @Test
    public void hasPowerValue(){
        assertEquals(75, water.getDamage());
    }

}
