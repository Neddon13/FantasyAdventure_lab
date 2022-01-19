package NPCTest.SupportTest;

import NPC.Support.Cleric;
import NPC.Support.HealingItems.HealingItemsAbs;
import NPC.Support.HealingItems.Potions;
import NPC.Support.HealingItems.Herbs;
import Player.Fighter.Knight;
import Weapon.Sword;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClericTest {

    private Potions potion;
    private Cleric clark;
    private Herbs herb;
    private Knight darkKnight;
    private Sword sword;

    @Before
    public void before() {
        potion = new Potions(400);
        herb = new Herbs(100);
        clark = new Cleric(potion);
        sword = new Sword(500);
        darkKnight = new Knight("Bruce", 1500, sword);
    }

    @Test
    public void hasHealingItem() {
        assertEquals(true, clark.getHealingItem() instanceof HealingItemsAbs);
    }

    @Test
    public void canChangeHealingItem() {
        clark.setHealingItem(herb);
        assertEquals(true, clark.getHealingItem() instanceof Herbs);
    }

    @Test
    public void canHealPlayer() {
        assertEquals(1500, darkKnight.getHealthPoints());
        clark.healPlayer(darkKnight);
        assertEquals(1900, darkKnight.getHealthPoints());
    }
}
