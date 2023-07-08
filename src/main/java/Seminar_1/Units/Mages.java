package Seminar_1.Units;

public abstract class Mages extends BasicHero{
    static public int mana; // мана

    public Mages(String name,  int x, int y) {
        super(name, 1, 100, 20, x, y, 1);
        this.mana=100;

    }
}
