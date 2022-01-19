package NPCTest.EnemyTest;

import NPC.Enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class OrcTest {
    
    private Orc orc1;
    
    @Before
    public void before() {
        orc1 = new Orc(1500);
    }
    
    @Test
    public void hasHealth() {
        assertEquals(1500, orc1.getHealthPoints());
    }
    
    @Test
    public void canTakeDamage() {
        orc1.takeDamage(300);
        assertEquals(1200, orc1.getHealthPoints());
    }
}
