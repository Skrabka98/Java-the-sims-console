package Shop.Medicament;

import Game.Money;
import Statistic.Hp;

import java.util.Scanner;

public class Pharmacy {
    public int chose;
    Apap apap;
    Bandage bandage;
    Hp hp;
    Money money;

    public Pharmacy(){
        this.chose=1;
    }

    public void choseProduct(){
        System.out.println("1.apap \n2.bandage");
        Scanner sc=new Scanner(System.in);
        this.chose=sc.nextInt();
        switch (chose){
            case 1 :
            {
                hp.addPoint(apap.setNumberOfPoints());
                money.shopping(apap.setPrice());
                System.out.println("Mnam mniam");
                break;
            }
            case 2:
            {
                hp.addPoint(bandage.setNumberOfPoints());
                money.shopping(bandage.setPrice());
                System.out.println("Mlask mlask");
                break;
            }
        }
    }
}
