package Seminar_1;

import java.util.ArrayList;

public class Witch extends Mages{
    public Witch(String name, int x, int y) {  // Экземпляр класса Маги - Колдун
        super(name, x, y);
    }

    @Override
    public String getInfo() {
        return "Witch";
    }

    @Override
    public void step(ArrayList<BasicHero> team){
        BasicHero nearestFoe = findNearest(team);
        System.out.printf("%s in %d\n", nearestFoe.getInfo(), coordinats.getDistance(nearestFoe.getCoordinates()));
    }
}
