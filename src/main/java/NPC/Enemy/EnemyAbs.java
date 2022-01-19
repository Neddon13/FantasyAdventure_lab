package NPC.Enemy;

public class EnemyAbs {
    private int healthPoints;

    public EnemyAbs(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damageAmount){
        healthPoints -= damageAmount;
    }



}

