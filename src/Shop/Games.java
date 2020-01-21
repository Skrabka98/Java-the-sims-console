package Shop;

import Game.Money;
import Game.Play;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Games {
    private Money money;
    private Play play;
    private ArrayList<String> gamesList;
    private Scanner scanner;
    private int choose;

    public Games(Play play) {
        this.money = play.money;
        this.choose = choose;
        this.gamesList = new ArrayList<String>();
        this.scanner = new Scanner(System.in);
    }

    public void buingGames() {

        for (String p : this.gamesList) {
            System.out.println("Kupione gry:");
            System.out.println(p);
        }
        System.out.println("1. theSims\n 2. theWither");
        choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                theSims();
                if (this.money.getMoney() < 200) {
                    this.gamesList.remove("theSims");
                }
                break;
            }
            case 2: {
                theWitcher();
                if (this.money.getMoney() < 400) {
                    this.gamesList.remove("theWither");
                }
                break;
            }
        }
    }


    public void theSims() {

        if (this.gamesList.contains("theSims") == false) {
            this.money.shopping(200);
            this.gamesList.add("theSims");

        } else System.out.println("Już kupiłeś tą grę!");
    }

    public void theWitcher() {
        if (this.gamesList.contains("theWither") == false) {
            this.money.shopping(400);
            this.gamesList.add("theWither");
        } else System.out.println("Już kupiłeś tą grę!");
    }


}
