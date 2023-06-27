package Seminar_1;

public class Archers extends BasicHero{
    static public float accuracy; // точность
    static public float luck; // удача
    public Archers(int health, int stamina, int hit, String name, float accuracy, float luck) {
        super(health, stamina, hit, name);
        this.accuracy=accuracy;
        this.luck=luck;
    }
    public class Crossbowman extends Archers {  // Экземпляр класса стрелков - Арбалетчик
        private String dodge;
        public int maxDamage;
        public Crossbowman(int health, int stamina, int hit, String name,
                           float accuracy, float luck, String dodge, int maxDamage) {
            super(health, stamina, hit, name, accuracy, luck);
            this.maxDamage=maxDamage;
            this.dodge=dodge;
        }
    }
    public class Sniper extends Archers {  // Экземпляр класса стрелков - Снайпер
        private String hide;
        public int minDamage;
        public Sniper(int health, int stamina, int hit, String name,
                      float accuracy, float luck, String hide, int minDamage) {
            super(health, stamina, hit, name, accuracy, luck);
            this.minDamage=minDamage;
            this.hide=hide;
        }
    }
}

