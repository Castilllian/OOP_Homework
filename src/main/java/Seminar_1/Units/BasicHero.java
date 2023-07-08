package Seminar_1.Units;

import Seminar_1.Map.Coordinats;

import java.util.ArrayList;

public abstract class BasicHero implements Interface_BH {
    protected String name;
    protected int hit; // ударять
    protected int health; // здоровье
    protected int stamina; // защита
    protected Coordinats coordinats;
    protected int initiative; // инициатива по ходу

    public BasicHero(String name, int hit, int health, int stamina, int x, int y, int initiative) {
        this.name = name;
        this.hit = hit;
        this.health = health;
        this.stamina = stamina;
        this.coordinats= new Coordinats(x,y);
        this.initiative = initiative;
    }


    public Coordinats getCoordinates() {
        return coordinats;
    }

    protected BasicHero findNearest(ArrayList<BasicHero> team) {
        BasicHero nearest = team.get(0);
        for (BasicHero basicHero : team) {
            if (coordinats.getDistance(basicHero.getCoordinates()) < coordinats.getDistance(nearest.getCoordinates())) {
                nearest = basicHero;
            }
        }
        return nearest;
    }

    public String getInfo() {
        return String.format("%s: health=%d", this.name, this.health);
    }
    public int getInitiative() {return this.initiative;}
}


