package NPC.Support.HealingItems;

import Behaviours.IHeal;

public class Herbs implements IHeal {
    
    private int healingValue;
    
    public Herbs(int _healingValue) {
        this.healingValue = _healingValue;
    }
    
    public int getHealingValue() {
        return healingValue;
    }

    @Override
    public void heal() {
        System.out.println("healed");
    }
}
