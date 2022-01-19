package NPCTest.SupportTest.HealingItemsTest;
import NPC.Support.HealingItems.Herbs;
import Player.Fighter.Knight;
import Player.PlayerAbs;
import Weapon.Sword;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class HerbsTest {
    
    Herbs herb;
    Knight darkKnight;
    Sword sword;

    @Before
    public void before() {
        herb = new Herbs(200);
        sword = new Sword(300);
        darkKnight = new Knight("Bruce", 1500, sword);
    }
    
    @Test
    public void hasHealingAmount() {
        assertEquals(200, herb.getHealingValue());
    }

    @Test
    public void canHeal(){
        herb.heal(darkKnight);
        assertEquals(1700, darkKnight.getHealthPoints());
    }

}
