package Shop;

import Game.Money;
import Game.Play;
import Game.Time;

import java.util.ArrayList;
import java.util.Scanner;

public class Games {
    private Money money;
    private Play play;
    private ArrayList<String> gamesList;
    private Scanner scanner;
    private int choose;
    private Time time;

    public Games(Play play) {
        this.money = play.money;
        this.choose = choose;
        this.gamesList = new ArrayList<String>();
        this.scanner = new Scanner(System.in);
        this.time = play.time;
    }

    public void buingGames() {

        for (String p : this.gamesList) {
            System.out.println("Kupione gry:");
            System.out.println(p);
        }

        System.out.println("1. theSims(200)\n2. theWither(400)\n3. Star Wars(40 000)");
        choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                if ((this.money.getMoney() >= 200) && (this.gamesList.contains("theSims") == false)) {
                    theSims();
                } else if (this.gamesList.contains("theSims") == true) {
                    System.out.println("Już kupiłeś tą grę");
                } else {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy!");
                }

                break;
            }
            case 2: {
                if ((this.money.getMoney() >= 400)&&(this.gamesList.contains("theWither") == false)) {
                    theWitcher();
                }else if (this.gamesList.contains("theWitcher") == true) {
                    System.out.println("Już kupiłeś tą grę");
                } else {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy!");
                }
                break;
            }
            case 3: {
                if ((this.money.getMoney() >= 40000)&&(this.gamesList.contains("Star Wars") == false)) {
                    starWars();
                }else if (this.gamesList.contains("Star Wars") == true) {
                    System.out.println("Już kupiłeś tą grę");
                } else {
                    System.out.println("Nie masz wystarczającej ilości pieniędzy!");
                }
                break;
            }
        }
    }


    private void theSims() {


        this.money.shopping(200);
        this.gamesList.add("theSims");
        System.out.println("Kupiłeś The Sims");


    }

    private void theWitcher() {

            this.money.shopping(400);
            this.gamesList.add("theWither");
        System.out.println("Kupiłeś The Witcher");

    }

    private void starWars() {
            this.money.shopping(40000);
            this.gamesList.add("Star Wars");
        System.out.println("Kupiłeś Star Wars");

    }
    public void winner(){
        if(this.gamesList.size()==3){
            System.out.println("Utrzymałeś nerda przy życiu i udało Ci sie kupić wszystkie gry na Steamie\n"+
                    "Zajęło Ci to "+time.getDay()+" dni\n"+
                    "Teraz już nie dasz rady odciągnąć Nerda od komputera, więc umrze z wycieńczenia!!!\n"+
                    "Gratuluje, mam nadzeję że jesteś z siebie dumny!!!\n");
            System.exit(0);

        }
    }



}
