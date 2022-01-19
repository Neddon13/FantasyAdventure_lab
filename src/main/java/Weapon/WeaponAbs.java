package Weapon;

import Behaviours.IWeapon;

public class WeaponAbs implements IWeapon {
    
    private int damage;
    
    public WeaponAbs (int damage) {
        this.damage = damage;
    }
    
    public int getDamage(){
        return damage;
    }
    
}
