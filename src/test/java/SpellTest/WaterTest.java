package SpellTest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Spells.Water;
import NPC.Enemy.*;

public class WaterTest {

    Water water;
    Orc orc;

    @Before
    public void before(){
        water = new Water(75);
        orc = new Orc(1400);
    }

    @Test
    public void hasPowerValue(){
        assertEquals(75, water.getDamage());
    }

    @Test
    public void canCastSpellEffectively(){
        water.castSpell(orc);
        assertEquals(1325, orc.getHealthPoints());
    }
}
