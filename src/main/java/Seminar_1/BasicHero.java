package Seminar_1;

public abstract class BasicHero {
    public String name;
    public int hit; // ударять
    public int health; // здоровье
    public int stamina; // защита
    public BasicHero(int health, int stamina, int hit, String name){
        this.health=health;
        this.hit=hit;
        this.name=name;
        this.stamina=stamina;

    }

}
