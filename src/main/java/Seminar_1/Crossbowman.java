package Seminar_1;

public class Crossbowman extends Archers{ // Экземпляр класса стрелков - Арбалетчик
    public Crossbowman(int health, int stamina, int hit, String name, float luck) {
        super(health, stamina, hit, name, luck);
    }

    public Crossbowman(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
}

