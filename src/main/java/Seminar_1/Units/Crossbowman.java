package Seminar_1.Units;

import java.util.ArrayList;

public class Crossbowman extends Archers{ // Экземпляр класса стрелков - Арбалетчик
    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend){
        if (this.health == 0) {return;}
        if (this.arrows == 0) {return;}
        if (this.curHp == 0) {return;}
        BasicHero nearestFoe = findNearest(teamFoe);
        nearestFoe.health -= (this.hit - this.stamina);

        for (int i = 0; i < teamFriend.size(); i++){
            if (teamFriend.get(i).getClass().getSimpleName().equals("Peasant") && teamFriend.get(i).status.equals("Stand")) {
                teamFriend.get(i).status = "Busy";
                return;
//        for (BasicHero c:teamFriend) {
//            if (c.getClass() == Peasant.class) {
//                return;
            }
        }
        this.arrows -= 1;
    }
    @Override
    public String getInfo() {
        return String.format("%s \u27B3: %s",super.getInfo(),this.arrows);
    }
}


