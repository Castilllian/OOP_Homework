package Seminar_1;

import java.util.ArrayList;

public class Peasant extends Soldiers {  // Экземпляр класса пехоты - Крестьянин
    public Peasant(String name,int x, int y) {
        super(name, x, y);
    }


    @Override
    public String getInfo() {
        return "Peasant";
    }

    @Override
    public void step(ArrayList<BasicHero> team){
        BasicHero nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}
