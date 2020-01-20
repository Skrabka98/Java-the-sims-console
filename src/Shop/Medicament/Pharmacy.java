package Shop.Medicament;

import Game.Money;
import Game.Play;
import Shop.Buy;
import Statistic.Hp;

import java.io.IOException;
import java.util.Scanner;

public class Pharmacy {
    private int chose;
    private Play play;
    private Apap apap ;
    private Bandage bandage;
    private Hp hp;
    private Money money;

    public Pharmacy(Play play){
        this.chose=1;
        this.play = play;
        this.apap = new Apap();
        this.hp = play.hp;
        this.money = play.money;
        this.bandage= new Bandage();

    }

    public Pharmacy() {

    }

    public void choseProduct() throws IOException {
        System.out.println("1.apap \n2.bandage");
        Scanner sc=new Scanner(System.in);
        this.chose=sc.nextInt();
        switch (chose){
            case 1 :
            {
                this.hp.addPoint(this.apap.setNumberOfPoints());
                this.money.shopping(this.apap.setPrice());
                System.out.println("Dynamite!");
                Buy buy = new Buy();
                buy.buying();

            }
            case 2:
            {
                hp.addPoint(bandage.setNumberOfPoints());
                money.shopping(bandage.setPrice());
                System.out.println("Ałaaa");
                Buy buy = new Buy();
                buy.buying();

            }
            case 3:
            {
                Buy buy = new Buy();
                buy.buying();
            }
            default:{
                System.out.println("Błędny przycisk!");
            }
        }
    }
}
