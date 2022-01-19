package WeaponTest;


import Weapon.Axe;
import Weapon.WeaponAbs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AxeTest {
    
    private Axe axe;

    @Before
    public void before(){
        Axe axe = new Axe(150);
    }
    
    @Test
    public void hasDamage(){
        assertEquals(150, axe.getDamage());
    }

}
