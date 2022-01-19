package Behaviours;

import NPC.Enemy.EnemyAbs;

public interface IWeapon {

    public int getDamage();
    public void attack(EnemyAbs enemy);

}
