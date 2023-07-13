package Seminar_1.Units;

import Seminar_1.Map.Coordinats;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BasicHero implements Interface_BH {
    protected Names name;
    protected int hit; // ударять
    protected int health; // здоровье начальное (максимум)
    protected int stamina; // защита
    protected Coordinats coordinats;
    protected int initiative; // инициатива по ходу
    protected States state; // статус персонажа
    protected float curHp; // текущее здоровье


    public BasicHero(Names name, int hit, int health, int curHp, int stamina, int x, int y, int initiative) {
        this.name = name;
        this.hit = hit;
        this.health = health;
        this.curHp = curHp;
        this.stamina = stamina;
        this.coordinats= new Coordinats(x,y);
        this.initiative = initiative;
        this.state = States.READY;
    }


    public Coordinats getCoordinates() {
        return coordinats;
    }

    protected BasicHero findNearest(ArrayList<BasicHero> team) {
        ArrayList<BasicHero> notDeadCharacters = new ArrayList<>();
        for (BasicHero character : team) {
            if (!character.state.equals(States.DEAD)) notDeadCharacters.add(character);
        }
        if (notDeadCharacters.size() == 0) return null;
        BasicHero nearest = notDeadCharacters.get(0);
        for (BasicHero character : notDeadCharacters) {
            if (coordinats.getDistance(character.getCoordinates()) < coordinats.getDistance(nearest.getCoordinates())) {
                nearest = character;
            }
        }
        return nearest;
    }

    protected void getDamage(int damagePoints) {
        health -= damagePoints;
        if (health <= 0) {
            health = 0;
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
    public String getInfo() {
        return String.format("nm: %s, cl: %s, st: %s, health: %d/%d, hot: %d, stamina: %d, init: %d", this.name.name(), this.toString(), this.state.name(), this.curHp, this.health, this.hit, this.stamina, this.initiative);
    }

    public int getInitiative() {return this.initiative;}

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}


