package Shop;

import Game.Money;
import Interfaces.IsBought;

import java.util.Scanner;

public class Games {
    private Money money;

    public Games(){
        this.money = new Money();
    }
    public boolean isBought(){return false;}


    public void theSims(){
        if(isBought()==false){
            this.money.shopping(200);
             isBought();
        }
        else System.out.println("Już kupiłeś tą grę!");
    }
    public void theWitcher(){
        if(isBought()==false){
            this.money.shopping(400);
            isBought();
        }
        else System.out.println("Już kupiłeś tą grę!");
    }



}
