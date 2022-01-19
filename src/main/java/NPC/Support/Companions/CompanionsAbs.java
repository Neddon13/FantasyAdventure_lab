package NPC.Support.Companions;

import Behaviours.IDefend;
import NPC.Enemy.EnemyAbs;

public abstract class CompanionsAbs implements IDefend {

    private int damage;

    public CompanionsAbs(int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public void defend(EnemyAbs enemy) {
        enemy.takeDamage(getDamage());
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
