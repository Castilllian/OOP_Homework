package Seminar_1;

public class Archers extends BasicHero{
    static public float luck; // удача
    public Archers(int health, int stamina, int hit, String name, float luck) {
        super(health, stamina, hit, name);
        this.luck=luck;
    }
    public Archers(String name){
        super(name);
        this.luck = 20;
    }
    public float shoot(){
        return luck;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}

