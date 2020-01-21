package Shop.Medicament;

import Game.Money;
import Game.Play;
import Statistic.Hp;
import Statistic.SeeStatistic;

import java.io.IOException;
import java.util.Scanner;

public class Pharmacy {
    private int chose;
    private Play play;
    private Apap apap;
    private Bandage bandage;
    private Hp hp;
    private Money money;
    private SeeStatistic seeStatistic;

    public Pharmacy(Play play) {
        this.chose = 1;
        this.play = play;
        this.apap = new Apap();
        this.hp = play.hp;
        this.money = play.money;
        this.bandage = new Bandage();
        this.seeStatistic = new SeeStatistic(play);

    }


    public void choseProduct(){
        this.seeStatistic.see();
        System.out.println(this.apap.productDescription()+"\n"+this.bandage.productDescription()+"\n3. Wyjście");
        Scanner sc = new Scanner(System.in);
        this.chose = sc.nextInt();

        switch (chose) {
            case 1: {
                if (this.money.getMoney() >= this.apap.setPrice()) {
                    this.money.shopping(this.apap.setPrice());
                    this.hp.addPoint(this.apap.setNumberOfPoints());

                    System.out.println("Uleczyłeś/aś się");
                }
                break;

            }
            case 2: {
                if (this.money.getMoney() >= this.bandage.setPrice()) {
                    hp.addPoint(bandage.setNumberOfPoints());
                    money.shopping(bandage.setPrice());
                    System.out.println("Uleczyłeś/aś się");
                }
                break;

            }
            case 3: {
                break;
            }
            default: {
                System.out.println("Błędny przycisk!");
            }
        }
    }
}
