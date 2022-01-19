package NPCTest.SupportTest.HealingItemsTest;
import NPC.Support.HealingItems.Herbs;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class HerbsTest {
    
    Herbs herb;

    @Before
    public void before() {
        herb = new Herbs(200);
    }
    
    @Test
    public void hasHealingAmount() {
        assertEquals(200, herb.getHealingValue());
    }

}
