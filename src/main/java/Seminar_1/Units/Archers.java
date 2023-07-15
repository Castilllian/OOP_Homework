package Seminar_1.Units;

import java.util.ArrayList;

public abstract class Archers extends BasicHero implements Interface_BH {
    protected int range;
    protected int arrows;
    protected int maxArrows;

    public Archers(Names name, int hit, int health, int curHp, int stamina, int row, int col, int initiative, int arrows, int maxArrows) {
        super(name, hit, health, curHp, stamina, initiative, row, col);
        this.arrows = arrows;
        this.maxArrows = maxArrows;
    }

    @Override
    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend) {
        if (this.isDead()) return;
        this.state = States.READY;
        if (arrows <= 0) {
            this.state = States.NOAMMO;
            return;
        }
        BasicHero nearestFoe = findNearest(getNotDeadTeamMembers(teamFoe));
        if (nearestFoe != null) {
            nearestFoe.getDamage(hit);
            this.arrows -= 1;
            state = States.SHOOT;
        }
        for (BasicHero c : getNotDeadTeamMembers(teamFriend)) {
            if (c == null) return;
            if (this.arrows < this.maxArrows && c.getClass() == Peasant.class && c.state.equals(States.READY)) {
                this.arrows += 1;
                c.state = States.SUPPLY;
                break;
            }
        }
    }
    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" ammo: %d/%d", this.arrows, this.maxArrows);
    }
}