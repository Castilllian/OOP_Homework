package Seminar_1.Units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Mages extends BasicHero{
    static public int mana; // мана

    public Mages(String name,  int x, int y) {
        super(name, 1, 100, 20, x, y, 1);
        this.mana=100;
    }

    @Override
    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend) {
        teamFriend.sort(new Comparator<BasicHero>() {
            @Override
            public int compare(BasicHero o1, BasicHero o2) {
                return (int) ((o1.health- o1.curHp)-(o2.health- o2.curHp));
            }

        });
        teamFriend.get(0).getDamage(hit);
    }
}
