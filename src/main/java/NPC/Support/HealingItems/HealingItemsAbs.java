package NPC.Support.HealingItems;

import Behaviours.IHeal;
import Player.PlayerAbs;

public abstract class HealingItemsAbs implements IHeal {

    private int healingValue;

    public HealingItemsAbs(int _healingValue) {
        this.healingValue = _healingValue;
    }

    public int getHealingValue(){
        return healingValue;
    }

    @Override
    public void heal(PlayerAbs player) {
        player.increaseHealth(healingValue);
    }
}
