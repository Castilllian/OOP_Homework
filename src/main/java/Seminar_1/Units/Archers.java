package Seminar_1.Units;

public abstract class Archers extends BasicHero {
    static public float luck; // удача
    protected int range;
    protected int arrows;

    public Archers(String name, int x, int y) {
        super(name, 5, 100, 10, x, y, 2);
        this.luck = 20;
        this.arrows = 10;
        this.range = 5;
    }

    @Override
    public String getInfo() {
        return String.format("%s: health=%d, ammo=%d", this.name, this.health, this.arrows);
    }

}