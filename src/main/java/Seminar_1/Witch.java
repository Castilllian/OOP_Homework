package Seminar_1;

public class Witch extends Mages{
    public Witch(int health, int stamina, int hit, String name, int mana) {  // Экземпляр класса Маги - Колдун
        super(health, stamina, hit, name, mana);
    }
    public Witch(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Witch";
    }
}
