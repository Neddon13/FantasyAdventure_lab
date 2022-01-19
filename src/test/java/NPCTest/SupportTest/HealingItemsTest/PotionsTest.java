package NPCTest.SupportTest.HealingItemsTest;
import NPC.Support.HealingItems.Potions;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PotionsTest {
    
    Potions potion;
    
    @Before
    public void before() {
        potion = new Potions(500);
    }

    @Test
    public void hasHealingAmount() {
        assertEquals(200, potion.getHealingValue());
    }
}
