package Seminar_1;

import java.util.ArrayList;

public class Robber extends Soldiers {  // Экземпляр класса пехоты - Разбойник
    public Robber(String name,int x, int y) {
        super(name, x, y);
    }


    @Override
    public String getInfo() {
        return "Robber";
    }

    @Override
    public void step(ArrayList<BasicHero> team){
        BasicHero nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}
