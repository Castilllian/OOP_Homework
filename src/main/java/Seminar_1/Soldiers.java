package Seminar_1;

public class Soldiers extends BasicHero{
    public int armor; // броня

    public Soldiers(int health, int stamina, int hit, String name, int armor) {
        super(health, stamina, hit, name);
        this.armor=armor;
    }

    public Soldiers(String name){
        super(name);
        this.armor=10;
    }

    public int defend(int hit){
        return hit - stamina - armor;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}
