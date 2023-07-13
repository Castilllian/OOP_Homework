package Seminar_1.Units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Mages extends BasicHero implements Interface_BH{
    int mana; // мана
    int maxMana;

    public Mages(Names name, int hit, int health, int curHp, int stamina, int x, int y, int initiative, int mana, int maxMana) {
        super(name, 1, 100, 100, 5, x, y, 2);
        this.mana=mana;
        this.maxMana=maxMana;
    }

    private BasicHero findMostDamaged(ArrayList<BasicHero> team) {
        BasicHero mostDamaged = team.get(0);
        for (BasicHero character : team) {
            if (!character.state.equals(States.DEAD)
                    && character.curHp < character.health
                    && character.curHp/character.health < mostDamaged.curHp/mostDamaged.health) {
                mostDamaged = character;
            }
        }
        if (mostDamaged.curHp == mostDamaged.health) {
            return null;
        }
        return mostDamaged;
    }

    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend) {
        if (state.equals(States.DEAD)) return;
        BasicHero damagedFriend = findMostDamaged(teamFriend);
        if (mana < maxMana) mana += 1;
        if (damagedFriend != null && mana >= hit) {
            damagedFriend.getHealing(hit);
            mana -= hit;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" mana: %d/%d", this.mana, this.maxMana);
    }
}