package Seminar_1.Units;

import java.util.ArrayList;

public class Peasant extends Soldiers {  // Экземпляр класса пехоты - Крестьянин
    public Peasant(Names name,int row, int col) {
        super(name, 2, 100,100,5, row,col,1);
    }

    @Override
    public void step(ArrayList<BasicHero> team, ArrayList<BasicHero> team2){
        if (state.equals(States.DEAD)) return;
        state = States.READY;
    }
}
