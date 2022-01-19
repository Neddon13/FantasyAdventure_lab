package NPCTest.SupportTest.CompanionTest;

import NPC.Support.Companions.Ogre;
import NPC.Enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OgreTest {

    private Ogre ogre;
    private Troll troll1;

    @Before
    public void before() {
        ogre = new Ogre(200);
        troll1 = new Troll(2000);
    }

    @Test
    public void hasDamage() {
        assertEquals(200, ogre.getDamage());
    }

    @Test
    public void canChangeDamage() {
        ogre.setDamage(300);
        assertEquals(300, ogre.getDamage());
    }

    @Test
    public void canDefend() {
        ogre.defend(troll1);
        assertEquals(1800, troll1.getHealthPoints());
    }
}
