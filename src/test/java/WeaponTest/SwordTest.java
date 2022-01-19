package WeaponTest;

import Weapon.Axe;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword(200);
    }

    @Test
    public void hasDamage(){
        assertEquals(200, sword.getDamage());
    }
}
