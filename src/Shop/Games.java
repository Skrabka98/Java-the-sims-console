package Shop;

import Game.Money;
import Game.Play;

import java.util.ArrayList;

public class Games {
    private Money money;
    private Play play;
    ArrayList<String> gamesList;

    public Games(Play play){
        this.money = play.money;
        this.gamesList= new ArrayList<String>();
    }

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
