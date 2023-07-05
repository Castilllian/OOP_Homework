package Seminar_1;

import java.util.ArrayList;

public class Crossbowman extends Archers{ // Экземпляр класса стрелков - Арбалетчик
    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }

    @Override
    public void step(ArrayList<BasicHero> team){
        BasicHero nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}


