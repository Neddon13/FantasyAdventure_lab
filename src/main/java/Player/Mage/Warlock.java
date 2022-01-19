package Player.Mage;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Warlock extends MageAbs{
    public Warlock(String name, int healthPoints, IDefend companion, ISpell _spell) {
        super(name, healthPoints, companion, _spell);
    }
}
