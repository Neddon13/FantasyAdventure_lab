package Player.Mage;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Player.PlayerAbs;

public class MageAbs extends PlayerAbs {

    private IDefend companion;
    private ISpell spell;

    public MageAbs(String name, int healthPoints, IDefend companion, ISpell _spell) {
        super(name, healthPoints);
        this.companion = companion;
        this.spell = _spell;
    }

    public IDefend getCompanion() {
        return companion;
    }

    public void setCompanion(IDefend companion) {
        this.companion = companion;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }
}
