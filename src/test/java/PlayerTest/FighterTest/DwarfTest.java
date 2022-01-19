package PlayerTest.FighterTest;

import NPC.Enemy.Troll;
import Player.Fighter.Barbarian;
import Player.Fighter.Dwarf;
import Weapon.Axe;
import Weapon.Club;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Sword sword;
    Troll troll;
    Club club;


    @Before
    public void before(){
        sword = new Sword(200);
        dwarf = new Dwarf("Happy", 500, sword);
        troll = new Troll(750);
        club = new Club(100);
    }

    @Test
    public void hasWeapon(){
        assertEquals(sword, dwarf.getWeapon());
    }

    @Test
    public void canAttack(){
        dwarf.attack(troll);
        assertEquals(550, troll.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        dwarf.changeWeapon(club);
        assertEquals(true, dwarf.getWeapon() instanceof Club);
    }
}
