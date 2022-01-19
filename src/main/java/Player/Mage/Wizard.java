package Player.Mage;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Wizard extends MageAbs{
    public Wizard(String name, int healthPoints, IDefend companion, ISpell _spell) {
        super(name, healthPoints, companion, _spell);
    }
}
