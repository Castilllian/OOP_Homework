package Seminar_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<BasicHero> teamOne = new ArrayList<>();
        ArrayList<BasicHero> teamTwo = new ArrayList<>();
        fillList(teamOne, 0);
        fillList(teamTwo, 9);
        System.out.println(Arrays.toString(teamOne.toArray()));
        System.out.println("-----");
        System.out.println(Arrays.toString(teamTwo.toArray()));
        System.out.println("-----");
        for (BasicHero c :
                teamOne) {
            c.step(teamTwo);
        }
        System.out.println("_____");
        for (BasicHero c :
                teamTwo) {
            c.step(teamOne);
        }
    }


    public static void fillList(ArrayList<BasicHero> list, int xPosition) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(0, 7);
            switch (cnt) {
                case 0: {
                    list.add(new Crossbowman("crossbowman", xPosition, i));
                    break;
                }
                case 1: {
                    list.add(new Monk("monk", xPosition, i));
                    break;
                }
                case 2: {
                    list.add(new Peasant("peasant", xPosition, i));
                    break;
                }
                case 3: {
                    list.add(new Robber("robber", xPosition, i));
                    break;
                }
                case 4: {
                    list.add(new Sniper("sniper", xPosition, i));
                    break;
                }
                case 5: {
                    list.add(new Spearman("spearman", xPosition, i));
                    break;
                }
                default: {
                    list.add(new Witch("witch", xPosition, i));
                    break;
                }
            }
        }
    }
}


