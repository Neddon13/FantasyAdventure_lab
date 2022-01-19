package WeaponTest;

import Weapon.Sword;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Before;
import org.junit.Test;
import NPC.Enemy.*;
import static org.junit.Assert.assertEquals;


public class SwordTest {

    Sword sword;
    Orc orc;
    @Before
    public void before(){
        sword = new Sword(200);
        orc = new Orc(1500);
    }

    @Test
    public void hasDamage(){
        assertEquals(200, sword.getDamage());
    }

    @Test
    public void canInflictDamage(){
        sword.attack(orc);
        assertEquals(1300, orc.getHealthPoints());
    }
}
