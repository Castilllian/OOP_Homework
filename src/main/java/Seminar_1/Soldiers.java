package Seminar_1;

public abstract class Soldiers extends BasicHero {
    public int armor; // броня

    public Soldiers(String name, int x, int y) {
        super(name, 15, 100, 30, x, y);
        this.armor = 10;
    }
}
