package Shop;

import Game.Money;
import Game.Play;
import Game.Time;

import java.util.ArrayList;
import java.util.Scanner;

public class Games {
     private Play play;
    private ArrayList<String> gamesList;
    private Scanner scanner;
    private int choose;

    public Games(Play play) {
        this.choose=0;
        this.play = play;
        this.gamesList = new ArrayList<String>();
        this.scanner = new Scanner(System.in);
    }

    public void buingGames() {

        for (String p : this.gamesList) {
            System.out.println("Kupione gry:");
            System.out.println(p);
        }

        System.out.println("1. theSims(200)\n2. theWither(400)\n3. Star Wars(40 000)");
        this.choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                if ((this.play.money.getMoney() >= 200) && (!this.gamesList.contains("theSims"))) {
                    theSims();
                } else if (this.gamesList.contains("theSims")) {
                    System.out.println("Już kupiłeś tą grę");
                } else {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy!");
                }
                break;
            }
            case 2: {
                if ((this.play.money.getMoney() >= 400) && (!this.gamesList.contains("theWither"))) {
                    theWitcher();
                } else if (this.gamesList.contains("theWitcher")) {
                    System.out.println("Już kupiłeś tą grę");
                } else {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy!");
                }
                break;
            }
            case 3: {
                if ((this.play.money.getMoney() >= 40000) && (!this.gamesList.contains("Star Wars"))) {
                    starWars();
                } else if (this.gamesList.contains("Star Wars")) {
                    System.out.println("Już kupiłeś tą grę");
                } else {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy!");
                }
                break;
            }
        }
    }


    private void theSims() {
        this.play.money.shopping(200);
        this.gamesList.add("theSims");
        System.out.println("Kupiłeś The Sims");
    }

    private void theWitcher() {

        this.play.money.shopping(400);
        this.gamesList.add("theWither");
        System.out.println("Kupiłeś The Witcher");

    }

    private void starWars() {
        this.play.money.shopping(40000);
        this.gamesList.add("Star Wars");
        System.out.println("Kupiłeś Star Wars");

    }

    public void winner() {
        if (this.gamesList.size() == 3) {
            System.out.println("Utrzymałeś nerda przy życiu i udało Ci sie kupić wszystkie gry na Steamie\n" +
                    "Zajęło Ci to " + this.play.time.getDay() + " dni\n" +
                    "Teraz już nie dasz rady odciągnąć Nerda od komputera, więc umrze z wycieńczenia!!!\n" +
                    "Gratuluje, mam nadzeję że jesteś z siebie dumny!!!\n");
            System.exit(0);
        }
    }


}
