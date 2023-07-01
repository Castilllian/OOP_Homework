package Seminar_1;

public class Monk extends Mages {
    public Monk(int health, int stamina, int hit, String name, int mana) {  // Экземпляр класса Маги - Монах
        super(health, stamina, hit, name, mana);
    }

    public Monk(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Monk";
    }
}
