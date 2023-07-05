package Seminar_1;

public abstract class Archers extends BasicHero {
    static public float luck; // удача

    public Archers(String name, int x, int y) {
        super(name, 5, 100, 10, x, y);
        this.luck = 20;
    }

}