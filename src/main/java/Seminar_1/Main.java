package Seminar_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Interface_BH crossbowman = new Crossbowman("Crossbowman");
        BasicHero monk = new Monk("Monk");
        BasicHero peasant = new Peasant("Peasant");
        BasicHero robber = new Robber("Robber");
        BasicHero sniper = new Sniper("Sniper");
        BasicHero spearman = new Spearman("Spearman");
        BasicHero witch = new Witch("Witch");
        crossbowman.getInfo();

        ArrayList<BasicHero> teamOne = new ArrayList<>();
        ArrayList<BasicHero> teamTwo = new ArrayList<>();
        fillList(teamOne);
        fillList(teamTwo);
        for (BasicHero c:
                teamOne) {
            System.out.println(c.getInfo());
        }
        for (BasicHero c:
                teamTwo) {
            System.out.println(c.getInfo());
        }
    }

    public static void fillList (ArrayList <BasicHero> list) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(0, 7);
            switch (cnt) {
                case 0: {
                    list.add(new Crossbowman("crossbowman"));
                    break;
                }
                case 1: {
                    list.add(new Monk("monk"));
                    break;
                }
                case 2: {
                    list.add(new Peasant("peasant"));
                    break;
                }
                case 3: {
                    list.add(new Robber("robber"));
                    break;
                }
                case 4: {
                    list.add(new Sniper("sniper"));
                    break;
                }
                case 5: {
                    list.add(new Spearman("spearman"));
                    break;
                }
                default: {
                    list.add(new Witch("witch"));
                    break;
                }
            }
        }
    }
}


