package WeaponTest;


import Weapon.Axe;
import Weapon.WeaponAbs;
import org.junit.Before;
import org.junit.Test;
import NPC.Enemy.*;

import static org.junit.Assert.assertEquals;

public class AxeTest {

    Axe axe;
    Orc orc;
    @Before
    public void before(){
        axe = new Axe(150);
        orc = new Orc(1500);
    }

    @Test
    public void hasDamage(){
        assertEquals(150, axe.getDamage());
    }

    @Test
    public void canInflictDamage(){
        axe.attack(orc);
        assertEquals(1350, orc.getHealthPoints());
    }

}