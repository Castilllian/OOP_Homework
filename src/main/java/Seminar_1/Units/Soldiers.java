package Seminar_1.Units;
import Seminar_1.Map.Coordinates;
import Seminar_1.Map.Directions;

import java.util.ArrayList;

public abstract class Soldiers extends BasicHero implements Interface_BH{

    public Soldiers(Names name, int hit, int health, int curHp, int stamina, int row, int col, int initiative) {
        super(name, 10, 100, 100, 8, row, col, 5);
    }
    @Override
    public void step(ArrayList<BasicHero> teamFoe, ArrayList<BasicHero> teamFriend) {
        if (this.isDead()) return;
        BasicHero nearestFoe = findNearest(getNotDeadTeamMembers(teamFoe));
        if (nearestFoe == null) return;
        if (this.attack(nearestFoe)) return;
        this.move(nearestFoe, getNotDeadTeamMembers(teamFriend), getNotDeadTeamMembers(teamFoe));
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public boolean attack(BasicHero enemy) {
        if (this.getCoordinates().getDistance(enemy.getCoordinates()) == 1) {
            enemy.getDamage(hit);
            state = States.ATTACK;
            return true;
        }
        return false;
    }

    public void move(BasicHero enemy, ArrayList<BasicHero> team1, ArrayList<BasicHero> team2) {
        Directions direction = this.getCoordinates().getDirection(enemy.getCoordinates());
        switch (direction) {
            case SOUTH:
                if (this.checkStepAheadIsAvailable(team1, new Coordinates(this.getCoordinates().toArray()[0] + 1, this.getCoordinates().toArray()[1]))
                        && this.checkStepAheadIsAvailable(team2, new Coordinates(this.getCoordinates().toArray()[0] + 1, this.getCoordinates().toArray()[1])))
                    this.position.setCoordinates(this.getCoordinates().toArray()[0] + 1, this.getCoordinates().toArray()[1]);
                state = States.MOVE;
                break;
            case NORTH:
                if (this.checkStepAheadIsAvailable(team1, new Coordinates(this.getCoordinates().toArray()[0] - 1, this.getCoordinates().toArray()[1]))
                        && this.checkStepAheadIsAvailable(team2, new Coordinates(this.getCoordinates().toArray()[0] - 1, this.getCoordinates().toArray()[1])))
                    this.position.setCoordinates(this.getCoordinates().toArray()[0] - 1, this.getCoordinates().toArray()[1]);
                state = States.MOVE;
                break;
            case WEST:
                if (this.checkStepAheadIsAvailable(team1, new Coordinates(this.getCoordinates().toArray()[0], this.getCoordinates().toArray()[1] - 1))
                        && this.checkStepAheadIsAvailable(team2, new Coordinates(this.getCoordinates().toArray()[0], this.getCoordinates().toArray()[1] - 1)))
                    this.position.setCoordinates(this.getCoordinates().toArray()[0], this.getCoordinates().toArray()[1] - 1);
                state = States.MOVE;
                break;
            case EAST:
                if (this.checkStepAheadIsAvailable(team1, new Coordinates(this.getCoordinates().toArray()[0], this.getCoordinates().toArray()[1] + 1))
                        && this.checkStepAheadIsAvailable(team2, new Coordinates(this.getCoordinates().toArray()[0], this.getCoordinates().toArray()[1] + 1)))
                    this.position.setCoordinates(this.getCoordinates().toArray()[0], this.getCoordinates().toArray()[1] + 1);
                state = States.MOVE;
                break;
        }
    }


    private boolean checkStepAheadIsAvailable(ArrayList<BasicHero> team, Coordinates coordinates) {
        for (BasicHero character : team) {
            if (!character.isDead() && coordinates.isEqual(character.getCoordinates())) return false;
        }
        return true;
    }
}
