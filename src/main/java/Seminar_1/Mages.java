package Seminar_1;

public class Mages extends BasicHero{
    static public int mana; // мана

    public Mages(int health, int stamina, int hit, String name, int mana) {
        super(health, stamina, hit, name);
        this.mana=mana;

    }
    public Mages(String name){
        super(name);
        this.mana = 100;
    }

    public int create(){
        return mana;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}
