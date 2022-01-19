package WeaponTest;

import Weapon.Axe;
import Weapon.Club;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClubTest {
    
    private Club club;

    @Before
    public void before(){
        Club club = new Club(150);
    }

    @Test
    public void hasDamage(){
        assertEquals(100, club.getDamage());
    }
}
