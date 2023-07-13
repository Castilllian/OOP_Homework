package Seminar_1.Units;

import java.util.ArrayList;

public abstract class Soldiers extends BasicHero implements Interface_BH{
    public int armor; // броня

    public Soldiers(Names name, int hit, int health, int curHp, int stamina, int x, int y, int initiative) {
        super(name, 10, 100, 100, 8, x, y, 5);
        this.armor = armor;
    }
    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> team2) {
        if (state.equals(States.DEAD)) return;
        BasicHero nearestFoe = findNearest(team);
    }
    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" arm: %d", this.armor);
    }
}
