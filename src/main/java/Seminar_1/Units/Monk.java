package Seminar_1.Units;

import java.util.ArrayList;

public class Monk extends Mages {  // Экземпляр класса магов МОНАХ
    public Monk(String name,  int x, int y) {  // Экземпляр класса Маги - Монах
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> team2){
        BasicHero nearestFoe = findNearest(team);
        //System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}
