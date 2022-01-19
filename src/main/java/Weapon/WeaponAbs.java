package Weapon;

import Behaviours.IWeapon;
import NPC.Enemy.EnemyAbs;

public class WeaponAbs implements IWeapon {
    
    private int damage;
    
    public WeaponAbs (int damage) {
        this.damage = damage;
    }
    
    public int getDamage(){
        return damage;
    }

    @Override
    public void attack(EnemyAbs enemy) {
        enemy.takeDamage(getDamage());
    }

}
