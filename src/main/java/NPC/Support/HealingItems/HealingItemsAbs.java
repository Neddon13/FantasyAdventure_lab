package NPC.Support.HealingItems;

import Behaviours.IHeal;

public abstract class HealingItemsAbs implements IHeal {

    private int healingValue;

    public HealingItemsAbs(int _healingValue) {
        this.healingValue = _healingValue;
    }

    public int getHealingValue(){
        return healingValue;
    }

    @Override
    public void heal() {
        System.out.println("lol");
    }

}
