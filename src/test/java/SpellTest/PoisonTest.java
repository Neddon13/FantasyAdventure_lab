package SpellTest;

import org.junit.Before;
import org.junit.Test;;
import static org.junit.Assert.assertEquals;
import Spells.Poison;
import NPC.Enemy.*;


public class PoisonTest {

    Poison poison;
    Troll troll;
    @Before
    public void before(){
        poison = new Poison(125);
        troll = new Troll(1500);
    }

    @Test
    public void hasPowerValue(){
        assertEquals(125, poison.getDamage());
    }


    @Test
    public void canCastSpellEffectively(){
        poison.castSpell(troll);
        assertEquals(1375, troll.getHealthPoints());
    }
}
