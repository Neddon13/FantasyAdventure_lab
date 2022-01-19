package Player.Fighter;

import Behaviours.IWeapon;
import NPC.Enemy.EnemyAbs;
import Player.PlayerAbs;

public class FighterAbs extends PlayerAbs {

    private IWeapon weapon;

    public FighterAbs(String name, int healthPoints, IWeapon weapon) {
        super(name, healthPoints);
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
