package NPCTest.SupportTest.HealingItemsTest;
import NPC.Support.HealingItems.Potions;
import Player.Fighter.Knight;
import Weapon.Sword;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PotionsTest {
    
    Potions potion;
    Knight darkKnight;
    Sword sword;

    @Before
    public void before() {
        potion = new Potions(500);
        sword = new Sword(400);
        darkKnight = new Knight("Bruce", 1500, sword);
    }

    @Test
    public void hasHealingValue() {
        assertEquals(500, potion.getHealingValue());
    }

    @Test
    public void canHeal() {
        potion.heal(darkKnight);
        assertEquals(2000, darkKnight.getHealthPoints());
    }


}
