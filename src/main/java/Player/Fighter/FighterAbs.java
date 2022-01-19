package Player.Fighter;

import Behaviours.IWeapon;
import NPC.Enemy.EnemyAbs;

public class FighterAbs {

    private IWeapon weapon;

    public FighterAbs(IWeapon weapon) {
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;

    }

    public void attack(EnemyAbs enemy) {
        weapon.attack(enemy);
    }

    public void changeWeapon(IWeapon _weapon) {
        weapon = _weapon;
    }
}
