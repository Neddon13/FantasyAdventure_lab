package NPCTest.EnemyTest;
import NPC.Enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TrollTest {

    private Troll troll1;

    @Before
    public void before() {
        troll1 = new Troll(2000);
    }

    @Test
    public void hasHealth() {
        assertEquals(2000, troll1.getHealthPoints());
    }

    @Test
    public void canTakeDamage() {
        troll1.takeDamage(300);
        assertEquals(1700, troll1.getHealthPoints());
    }
}
