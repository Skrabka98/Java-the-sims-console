package Shop;

import Game.Money;
import Interfaces.IsBought;

import java.util.ArrayList;
import java.util.Scanner;

public class Games {
    private Money money;
    ArrayList<String> gamesList;

    public Games(){
        this.money = new Money();
        this.gamesList= new ArrayList<String>();
    }
    public boolean isBought(){return false;}

    public void buingGames(){
        for(String p: gamesList){
            System.out.println("Kupione gry:");
            System.out.println(p);
        }

    }



    public void theSims(){
        if(this.gamesList.contains("theSims")==false) {
            this.money.shopping(200);
            this.gamesList.add("theSims");

        }else System.out.println("Już kupiłeś tą grę!");
    }
    public void theWitcher(){
        if(this.gamesList.contains("theWither")==false){
            this.money.shopping(400);
            this.gamesList.add("theWither");
        }
        else System.out.println("Już kupiłeś tą grę!");
    }



}
