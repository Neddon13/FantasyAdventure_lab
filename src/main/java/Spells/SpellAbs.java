package Spells;

import Behaviours.ISpell;
import NPC.Enemy.EnemyAbs;

public class SpellAbs implements ISpell {
    private int damage;

    public SpellAbs (int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    @Override
    public void castSpell(EnemyAbs enemy) {
        enemy.takeDamage(getDamage()); 
    }
}
