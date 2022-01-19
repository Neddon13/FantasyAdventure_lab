package SpellTest;

import org.junit.Before;
import org.junit.Test;;
import static org.junit.Assert.assertEquals;
import Spells.*;

public class PoisonTest {
    
    Poison poison;
    @Before
    public void before(){
        poison = new Poison(125);
    }
    
    @Test
    public void hasPowerValue(){
        assertEquals(125, poison.getDamage());
    }
    
    
    @Test
    public void canCastSpellEffectively(){
        
    }
}
