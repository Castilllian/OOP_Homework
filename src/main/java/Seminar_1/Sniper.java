package Seminar_1;

import java.util.ArrayList;

public class Sniper extends Archers{ // Экземпляр класса стрелков - Снайпер
    public Sniper(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "Sniper";
    }

    @Override
    public void step(ArrayList<BasicHero> team){
        BasicHero nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}

