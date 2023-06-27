package Seminar_1;

public class Soldiers extends BasicHero{
    static public float endurance; // выносливость
    static public float danger; // опасность

    public Soldiers(int health, int stamina, int hit, String name, float endurance, float danger) {
        super(health, stamina, hit, name);
        this.endurance=endurance;
        this.danger=danger;
    }
    public class Peasant extends Soldiers {  // Экземпляр класса пехоты - Крестьянин
        private int cowardice; // трусость (свойство - может убежать)
        public float spirit; // поднимает боевой дух (действие)
        public Peasant(int health, int stamina, int hit, String name,
                       float endurance, float danger, int cowardice, float spirit) {
            super(health, stamina, hit, name, endurance, danger);
            this.cowardice=cowardice;
            this.spirit=spirit;
        }
    }
    public class Robber extends Soldiers {  // Экземпляр класса пехоты - Разбойник
        private String find; // находить (свойство)
        public String trade; // торговать (действие)
        public Robber(int health, int stamina, int hit, String name,
                      float endurance, float danger, String find, String trade) {
            super(health, stamina, hit, name, endurance, danger);
            this.trade=trade;
            this.find=find;
        }
    }

    public class Spearman extends Soldiers {  // Экземпляр класса пехоты - Копейщик
        public float criticalDamage;
        private String block; //блокировка удара
        public Spearman(int health, int stamina, int hit, String name,
                        float endurance, float danger, float criticalDamage, String block) {
            super(health, stamina, hit, name, endurance, danger);
            this.block=block;
            this.criticalDamage=criticalDamage;
        }
    }
}
