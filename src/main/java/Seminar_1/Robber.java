package Seminar_1;

public class Robber extends Soldiers {  // Экземпляр класса пехоты - Разбойник
    public Robber(int health, int stamina, int hit, String name, int armor) {
        super(health, stamina, hit, name, armor);
    }

    public Robber(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Robber";
    }
}
