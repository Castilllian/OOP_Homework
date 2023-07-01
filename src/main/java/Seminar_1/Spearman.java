package Seminar_1;

public class Spearman extends Soldiers {  // Экземпляр класса пехоты - Копейщик
    public Spearman(int health, int stamina, int hit, String name,
                    float endurance, float danger, int armor) {
        super(health, stamina, hit, name, armor);
    }

    public Spearman(String name){
        super(name);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Spearman";
    }
}
