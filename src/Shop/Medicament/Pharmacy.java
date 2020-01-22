package Shop.Medicament;
import Game.Play;
import Statistic.SeeStatistic;


import java.util.Scanner;

public class Pharmacy {
    private int chose;
    private Play play;
    private Apap apap;
    private Bandage bandage;
    private SeeStatistic seeStatistic;

    public Pharmacy(Play play) {
        this.chose = 0;
        this.play = play;
        this.apap = new Apap();
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
                if (this.play.money.getMoney() >= this.apap.setPrice()) {
                    this.play.money.shopping(this.apap.setPrice());
                    this.play.hp.addPoint(this.apap.setNumberOfPoints());

                    System.out.println("Uleczyłeś/aś się");
                }
                break;

            }
            case 2: {
                if (this.play.money.getMoney() >= this.bandage.setPrice()) {
                    this.play.hp.addPoint(bandage.setNumberOfPoints());
                    this.play.money.shopping(bandage.setPrice());
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
