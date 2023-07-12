package Seminar_1.Units;

import java.util.ArrayList;

public class Crossbowman extends Archers{ // Экземпляр класса стрелков - Арбалетчик
    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend){
        if (this.health == 0 || arrows == 0) {return;}
        BasicHero nearestFoe = findNearest(teamFoe);
        nearestFoe.health -= (this.hit - this.stamina);
        for (BasicHero c:teamFriend) {
            if (c.getClass() == Peasant.class) {
                return;
            }
        }
        this.arrows -= 1;
    }
}


