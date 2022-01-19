package Player;

public class PlayerAbs {

    private String name;
    private int healthPoints;

    public PlayerAbs(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
