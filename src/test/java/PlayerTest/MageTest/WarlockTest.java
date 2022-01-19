package PlayerTest.MageTest;

import NPC.Support.Companions.Dragon;
import NPC.Support.Companions.Ogre;
import Player.Mage.Warlock;
import org.junit.Before;
import org.junit.Test;
import Behaviours.*;
import Spells.*;
import static org.junit.Assert.assertEquals;
import NPC.Support.*;

public class WarlockTest {

    Warlock warlock;
    Dragon dragon;
    Water water;
    Ogre ogre;
    Fire fire;



    @Before
    public void before(){
        dragon = new Dragon(3000);
        water = new Water(130);
        warlock = new Warlock("Laro", 1000, dragon, water);
        ogre = new Ogre(2000);
        fire = new Fire(140);
    }

    @Test
    public void hasName(){
        assertEquals("Laro", warlock.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(1000, warlock.getHealthPoints());
    }

    @Test
    public void getCompanion(){
        assertEquals(dragon, warlock.getCompanion());
    }

    @Test
    public void changeCompanion(){
       warlock.setCompanion(ogre);
       assertEquals(true, warlock.getCompanion() instanceof Ogre);
    }

    @Test
    public void getSpell(){
        assertEquals(water, warlock.getSpell());
    }

    @Test
    public void changeSpell(){
        warlock.setSpell(fire);
        assertEquals(true, warlock.getSpell() instanceof Fire);
    }
}
