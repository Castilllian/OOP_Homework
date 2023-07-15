package Seminar_1;
import Seminar_1.Units.*;
import Seminar_1.View.View;
import java.util.*;

public class Main {
    public static ArrayList<BasicHero> team1 = new ArrayList<>();
    public static ArrayList<BasicHero> team2 = new ArrayList<>();
    public static ArrayList<BasicHero> allTeam = new ArrayList<>();

    public static void main(String[] args) {
        fillGreenList(team1, 1);
        fillBlueList(team2, 10);
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        allTeam.sort(new Comparator<BasicHero>() {
            @Override
            public int compare(BasicHero character, BasicHero t1) {
                if (character.getInitiative() > t1.getInitiative()) return -1;
                if (character.getInitiative() < t1.getInitiative()) return 1;
                return 0;
            }});
        Scanner scanner = new Scanner(System.in);
        while (isAtLeastOneAlive(team1) && isAtLeastOneAlive(team2)){
            View.view();
            for (BasicHero c : allTeam) {
                if (team1.contains(c)) {
                    c.step(team2, team1);
                } else {
                    c.step(team1, team2);
                }
            }
            scanner.nextLine();
        }
        View.view();
    }

        public static boolean isAtLeastOneAlive (ArrayList <BasicHero> team) {
            for (BasicHero c : team) {
                if (!c.isDead()) return true;
            }
            return false;
        }

        public static void fillGreenList(ArrayList<BasicHero> list, int startRow) {
            Names[] names = Names.values();
            for (int i = 1; i <= 10; i++) {
                int cnt = new Random().nextInt(4);
                Names name = names[new Random().nextInt(names.length)];
                switch (cnt) {
                    case 0: {
                        list.add(new Crossbowman(name, startRow, i));
                        break;
                    }
                    case 1: {
                        list.add(new Monk(name, startRow, i));
                        break;
                    }
                    case 2: {
                        list.add(new Peasant(name, startRow, i));
                        break;
                    }
                    case 3: {
                        list.add(new Robber(name, startRow, i));
                        break;
                    }
                    case 4: {
                        list.add(new Sniper(name, startRow, i));
                        break;
                    }
                    case 5: {
                        list.add(new Spearman(name, startRow, i));
                        break;
                    }
                    default: {
                        list.add(new Witch(name, startRow, i));
                        break;
                    }
                }
            }
        }
        public static void fillBlueList(ArrayList<BasicHero> list, int startRow){
            Names[] names = Names.values();
            for (int i = 1; i <= 10; i++) {
                int cnt = new Random().nextInt(4);
                Names name = names[new Random().nextInt(names.length)];
                switch (cnt) {
                    case 0: {
                        list.add(new Crossbowman(name, startRow, i));
                        break;
                    }
                    case 1: {
                        list.add(new Monk(name, startRow, i));
                        break;
                    }
                    case 2: {
                        list.add(new Peasant(name, startRow, i));
                        break;
                    }
                    case 3: {
                        list.add(new Robber(name, startRow, i));
                        break;
                    }
                    case 4: {
                        list.add(new Sniper(name, startRow, i));
                        break;
                    }
                    case 5: {
                        list.add(new Spearman(name, startRow, i));
                        break;
                    }
                    default: {
                        list.add(new Witch(name, startRow, i));
                        break;
                    }
                }
            }
        }
    }