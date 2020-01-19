package Shop.Medicament;

import Game.Money;
import Shop.Buy;
import Statistic.Hp;

import java.io.IOException;
import java.util.Scanner;

public class Pharmacy {
    public int chose;
    Apap apap ;
    Bandage bandage;
    Hp hp;
    Money money;

    public Pharmacy(){
        this.chose=1;
        this.apap = new Apap();
        this.hp = new Hp();
        this.money = new Money();
        this.bandage= new Bandage();

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
