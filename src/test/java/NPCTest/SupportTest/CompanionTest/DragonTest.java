package NPCTest.SupportTest.CompanionTest;

import NPC.Support.Companions.Dragon;
import NPC.Enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DragonTest {

    private Dragon dragon;
    private Troll troll1;

    @Before
    public void before() {
        dragon = new Dragon(400);
        troll1 = new Troll(2000);
    }

    @Test
    public void hasDamage() {
        assertEquals(400, dragon.getDamage());
    }

    @Test
    public void canChangeDamage() {
        dragon.setDamage(600);
        assertEquals(600, dragon.getDamage());
    }

    @Test
    public void canDefend() {
        dragon.defend(troll1);
        assertEquals(1600, troll1.getHealthPoints());
    }
}
