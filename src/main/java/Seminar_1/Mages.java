package Seminar_1;

public class Mages extends BasicHero{
    static public int mana; // мана
    static public float power; // мощность заклинания

    public Mages(int health, int stamina, int hit, String name, int mana, float power) {
        super(health, stamina, hit, name);
        this.mana=mana;
        this.power=power;
    }
    public class Witch extends Mages{
        public int armor;
        private String speed;

        public Witch(int health, int stamina, int hit, String name, // Экземпляр класса Маги - Колдун
                     int mana, float power, int armor, String speed) {
            super(health, stamina, hit, name, mana, power);
            this.armor=armor;
            this.speed=speed;
        }
    }
    public class Monk extends Mages {
        public int treat;
        private String slowness;
        public Monk(int health, int stamina, int hit, String name, // Экземпляр класса Маги - Монах
                    int mana, float power, int treat, String slowness) {
            super(health, stamina, hit, name, mana, power);
            this.treat=treat;
            this.slowness=slowness;
        }
    }
}
