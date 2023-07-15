package Seminar_1.Units;

import Seminar_1.Map.Coordinates;
import Seminar_1.Map.Coordinates;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BasicHero implements Interface_BH {
    protected Names name;
    protected int hit; // ударять
    protected int health; // здоровье начальное (максимум)
    protected int stamina; // защита
    protected Coordinates position;
    protected int initiative; // инициатива по ходу
    protected States state; // статус персонажа
    protected float curHp; // текущее здоровье


    public BasicHero(Names name, int hit, int health, int curHp, int stamina, int row, int col, int initiative) {
        this.name = name;
        this.hit = hit;
        this.health = health;
        this.curHp = curHp;
        this.stamina = stamina;
        this.position= new Coordinates(row,col);
        this.initiative = initiative;
        this.state = States.READY;
    }


    public Coordinates getCoordinates() {
        return position;
    }

    protected BasicHero findNearest(ArrayList<BasicHero> team) {
        if (team.size() == 0) return null;
        BasicHero nearest = team.get(0);
        for (BasicHero character : team) {
            if (!character.state.equals(States.DEAD)
                    && this != character
                    && position.getDistance(character.getCoordinates()) < position.getDistance(nearest.getCoordinates())) {
                nearest = character;
            }
        }
        return nearest;
    }
    ArrayList<BasicHero> getNotDeadTeamMembers(ArrayList<BasicHero> team) {
        ArrayList<BasicHero> notDeadTeamMembers = new ArrayList<>();
        for (BasicHero c: team) {
            if (!c.isDead()) notDeadTeamMembers.add(c);
        }
        return notDeadTeamMembers;
    }

    protected void getDamage(int damagePoints) {
        curHp -= damagePoints;
        if (curHp <= 0) {
            curHp = 0;
            state = States.DEAD;
        }
    }

    public boolean isDead() {
        return state.equals(States.DEAD);
    }

    protected void getHealing(int healPoints) {
        curHp += healPoints;
        if (curHp > health) curHp = health;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public String getInfo() {
        return String.format("nm: %s, cl: %s, st: %s, hp: %d/%d, dmg: %d, def: %d, init: %d,", this.getClass().getSimpleName(), this.name, this.state, this.curHp, this.health, this.hit, this.stamina, this.initiative);
    }
}
