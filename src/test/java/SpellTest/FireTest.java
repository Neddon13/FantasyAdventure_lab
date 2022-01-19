package SpellTest;

import org.junit.Before;
import org.junit.Test;;
import static org.junit.Assert.assertEquals;
import Spells.Fire;
import NPC.Enemy.*;



public class FireTest {

    Fire fire;
    Orc orc;

    @Before
    public void before(){
         fire = new Fire(95);
         orc = new Orc(1500);

    }

    @Test
    public void hasPowerValue(){
        assertEquals(95, fire.getDamage());
    }


    @Test
    public void canCastSpellEffectively(){
        fire.castSpell(orc);
        assertEquals(1405, orc.getHealthPoints());
    }
}
