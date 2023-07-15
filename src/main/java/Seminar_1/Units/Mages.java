package Seminar_1.Units;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Mages extends BasicHero implements Interface_BH{
    int mana; // мана
    int maxMana;

    public Mages(Names name, int hit, int health, int curHp, int stamina, int row, int col, int initiative, int mana, int maxMana) {
        super(name, 1, 100, 100, 5, row, col, 2);
        this.mana=mana;
        this.maxMana=maxMana;
    }

    private BasicHero findMostDamaged(ArrayList<BasicHero> team) {
        if (team.size() == 0) return null;
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
        if (this.isDead()) return;
        if (mana < maxMana) mana += 1;
        if (mana < hit) {
            state = States.NOMANA;
            return;
        }
        BasicHero damagedFriend = findMostDamaged(getNotDeadTeamMembers(teamFriend));
        if (damagedFriend != null) {
            damagedFriend.getHealing(hit);
            mana -= hit;
            state = States.CAST;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + String.format(" mana: %d/%d", this.mana, this.maxMana);
    }
}