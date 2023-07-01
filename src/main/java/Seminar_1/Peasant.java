package Seminar_1;

public class Peasant extends Soldiers {  // Экземпляр класса пехоты - Крестьянин
    public Peasant(int health, int stamina, int hit, String name, int armor) {
        super(health, stamina, hit, name,armor);
    }

    public Peasant(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Peasant";
    }
}
