package Seminar_1.Units;

import Seminar_1.Map.Coordinats;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BasicHero implements Interface_BH {
    protected String name;
    protected int hit; // ударять
    protected int health; // здоровье
    protected int stamina; // защита
    protected Coordinats coordinats;
    protected int initiative; // инициатива по ходу
    protected String status; // статус персонажа
    protected float curHp; // текущее здоровье


    public BasicHero(String name, int hit, int health, int stamina, int x, int y, int initiative) {
        this.name = name;
        this.hit = hit;
        this.health = health;
        this.stamina = stamina;
        this.coordinats= new Coordinats(x,y);
        this.initiative = initiative;
        this.status = "Stand";
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
        return String.format(" %s %s %s \u2764: %s \u2661: %s \u2694: %s In: %s",this.getClass().getSimpleName(),this.name,
                this.status, this.health, this.curHp, this.hit, this.initiative);
    }

    protected void getDamage(float damage){
        this.curHp -= damage;
        if(this.curHp <= 0){
            this.status = "Die";
            this.curHp = 0;
        }

        if(this.curHp>this.health) {
            this.curHp = this.health;
        }

    }
    public int getInitiative() {return this.initiative;}
}


