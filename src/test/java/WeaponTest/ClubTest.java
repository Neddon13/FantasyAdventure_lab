package WeaponTest;

import Weapon.Axe;
import Weapon.Club;
import org.junit.Before;
import org.junit.Test;
import NPC.Enemy.*;

import static org.junit.Assert.assertEquals;

public class ClubTest {
    
    Club club;
    Troll troll;


    @Before
    public void before(){
        club = new Club(150);
        troll = new Troll(1400);
    }

    @Test
    public void hasDamage(){
        assertEquals(150, club.getDamage());
    }

    @Test
    public void canInflictDamage(){
        club.attack(troll);
        assertEquals(1250, troll.getHealthPoints());
    }
}
