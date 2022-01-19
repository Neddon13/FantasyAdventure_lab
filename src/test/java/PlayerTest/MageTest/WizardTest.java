package PlayerTest.MageTest;

import Player.Mage.Warlock;
import Player.Mage.Wizard;
import Player.Mage.Wizard;
import Player.Mage.Wizard;
import org.junit.Before;
import org.junit.Test;
import Behaviours.*;
import Spells.*;
import NPC.Support.Companions.*;
import static org.junit.Assert.assertEquals;

public class WizardTest {

    Dragon dragon;
    Water water;
    Ogre ogre;
    Fire fire;
    Wizard wizard;



    @Before
    public void before(){
        dragon = new Dragon(3000);
        water = new Water(130);
        wizard = new Wizard("Spike", 1000, dragon, water);
        ogre = new Ogre(2000);
        fire = new Fire(140);
    }

    @Test
    public void hasName(){
        assertEquals("Spike", wizard.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(1000, wizard.getHealthPoints());
    }

    @Test
    public void getCompanion(){
        assertEquals(dragon, wizard.getCompanion());
    }

    @Test
    public void changeCompanion(){
        wizard.setCompanion(ogre);
        assertEquals(true, wizard.getCompanion() instanceof Ogre);
    }

    @Test
    public void getSpell(){
        assertEquals(water, wizard.getSpell());
    }

    @Test
    public void changeSpell(){
        wizard.setSpell(fire);
        assertEquals(true, wizard.getSpell() instanceof Fire);
    }
}
