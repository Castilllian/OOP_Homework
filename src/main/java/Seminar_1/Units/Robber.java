package Seminar_1.Units;

import java.util.ArrayList;

public class Robber extends Soldiers {  // Экземпляр класса пехоты - Разбойник
    public Robber(String name,int x, int y) {
        super(name, x, y);
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> team2){
        BasicHero nearestFoe = findNearest(team);
        //System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}
