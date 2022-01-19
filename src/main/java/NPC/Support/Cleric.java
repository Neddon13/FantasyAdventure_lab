package NPC.Support;

import Behaviours.IHeal;
import Player.PlayerAbs;

public class Cleric {

    private IHeal healingItem;

    public Cleric(IHeal healingItem) {
        this.healingItem = healingItem;
    }

    public IHeal getHealingItem() {
        return healingItem;
    }

    public void setHealingItem(IHeal healingItem) {
        this.healingItem = healingItem;
    }

    public void healPlayer(PlayerAbs player) {
        healingItem.heal(player);
    }
}
