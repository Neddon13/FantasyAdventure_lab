package PlayerTest.FighterTest;

import Behaviours.IWeapon;
import NPC.Enemy.EnemyAbs;
import NPC.Enemy.Orc;
import Player.Fighter.Barbarian;
import Weapon.Axe;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;
    Orc orc;
    Sword sword;


    @Before
    public void before(){
        axe = new Axe(150);
        orc = new Orc(1000);
        barbarian = new Barbarian("Jax", 1000, axe);
        sword = new Sword(200);

    }

    @Test
    public void hasWeapon(){
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void canAttack(){
        barbarian.attack(orc);
        assertEquals(850, orc.getHealthPoints());
    }

    @Test
    public void canChangeWeapon(){
        barbarian.changeWeapon(sword);
        assertEquals(true, barbarian.getWeapon() instanceof Sword);
    }


}
