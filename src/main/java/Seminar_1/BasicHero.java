package Seminar_1;

import java.util.ArrayList;

public abstract class BasicHero implements Interface_BH {
    private String name;
    private int hit; // ударять
    private int health; // здоровье
    private int stamina; // защита
    protected Coordinats coordinats;

    public BasicHero(String name, int hit, int health, int stamina, int x, int y) {
        this.name = name;
        this.hit = hit;
        this.health = health;
        this.stamina = stamina;
        this.coordinats= new Coordinats(x,y);
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

}

