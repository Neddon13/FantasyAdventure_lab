package SpellTest;

import org.junit.Before;
import org.junit.Test;;
import static org.junit.Assert.assertEquals;
import Spells.*;



public class FireTest {
    
    Fire fire;
    @Before
    public void before(){
         fire = new Fire(95);
    }

    @Test
    public void hasPowerValue(){
        assertEquals(95, fire.getDamage());
    }


    @Test
    public void canCastSpellEffectively(){

    }
}
