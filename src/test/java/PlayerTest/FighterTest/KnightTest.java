package PlayerTest.FighterTest;

import NPC.Enemy.Troll;
import Player.Fighter.Dwarf;
import Player.Fighter.Knight;
import Weapon.Club;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Club club;
    Troll troll;
    Sword sword;

    @Before
    public void before(){
        club = new Club(100);
        knight = new Knight("Metal", 2000, club);
        troll = new Troll(750);
        sword = new Sword(200);
    }

    @Test
    public void hasWeapon(){
        assertEquals(club, knight.getWeapon());
    }

    @Test
    public void canAttack(){
        knight.attack(troll);
        assertEquals(650, troll.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        knight.changeWeapon(sword);
        assertEquals(true, knight.getWeapon() instanceof Sword);
    }
}
