package Seminar_1;

public class Sniper extends Archers{ // Экземпляр класса стрелков - Снайпер
    public Sniper(int health, int stamina, int hit, String name, float luck) {
        super(health, stamina, hit, name, luck);
    }

    public Sniper(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Sniper";
    }
}

