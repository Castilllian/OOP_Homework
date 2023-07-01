package Seminar_1;

public abstract class BasicHero implements Interface_BH{
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

    public BasicHero(String name) {
        this.name=name;
        this.hit=10;
        this.health=100;
        this.stamina=0;
    }
    public int hit(){
        return hit;
    }

    public int stamina(int hit){
        return hit - stamina;
    }

    @Override
    public void step() {

    }
}
