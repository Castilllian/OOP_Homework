package Seminar_1.Units;

public abstract class Soldiers extends BasicHero {
    public int armor; // броня

    public Soldiers(String name, int x, int y) {
        super(name, 15, 100, 30, x, y, 4);
        this.armor = 10;
    }
}
