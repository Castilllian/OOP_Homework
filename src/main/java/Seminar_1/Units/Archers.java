package Seminar_1.Units;

import java.util.ArrayList;

public abstract class Archers extends BasicHero implements Interface_BH {
    protected int range;
    protected int arrows;
    protected int maxArrows;

    public Archers(Names name, int hit, int health, int curHp, int stamina, int x, int y, int initiative, int arrows, int maxArrows) {
        super(name, hit, health, curHp, stamina, initiative, x, y);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
    }

    @Override
    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend) {
        if (state.equals(States.DEAD) || arrows <= 0) return;
        BasicHero nearestFoe = findNearest(teamFoe);
        if (nearestFoe != null) {
            nearestFoe.getDamage(hit);
            for (BasicHero c : teamFriend) {
                if (c.getClass() == Peasant.class && c.state.equals(States.READY)) {
                    if (this.arrows < this.maxArrows) this.arrows += 1;
                    return;
                }
            }
            this.arrows -= 1;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" ammo: %d/%d", this.arrows, this.maxArrows);
    }
}