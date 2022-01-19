package Spells;

import Behaviours.ISpell;

public class SpellAbs implements ISpell {
    private int damage;

    public SpellAbs (int damage) {
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }
}
