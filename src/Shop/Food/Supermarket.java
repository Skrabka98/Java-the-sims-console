
package Shop.Food;

import Game.Money;
import Game.Play;
import Statistic.Hungry;
import Statistic.SeeStatistic;
import Statistic.Tired;

import java.util.Scanner;


public class Supermarket {
    private int chose;
    private Chips chips;
    private Cola cola;
    private Energydrink energydrink;
    private Money money;
    private Hungry hungry;
    private Pizza pizza;
    private Play play;
    private Tired tired;
    private SeeStatistic seeStatistic;


    public Supermarket(Play play) {
        this.play = play;
        this.chose = 0;
        this.chips = new Chips();
        this.cola = new Cola();
        this.pizza = new Pizza();
        this.energydrink = new Energydrink();
        this.seeStatistic = new SeeStatistic(play);

    }


    public void choseProduct(){
        this.seeStatistic.see();
        System.out.print(this.chips.productDescription() + "\n" + this.cola.productDescription() + "\n" +
                this.pizza.productDescription() + "\n" + this.energydrink.productDescription() + "\n5.Powrót");
        Scanner sc = new Scanner(System.in);
        this.chose = sc.nextInt();


        switch (chose) {
            case 1: {
                if (this.play.money.getMoney() >= this.chips.setPrice()) {
                    this.play.hungry.addPoint(this.chips.setNumberOfPoints());
                    this.play.money.shopping(this.chips.setPrice());
                    System.out.println("Zjadłeś/aś chrupki");
                }
                choseProduct();
                break;

            }
            case 2: {
                if (this.play.money.getMoney() >= this.cola.setPrice()) {
                    this.play.hungry.addPoint(this.cola.setNumberOfPoints());
                    this.play.money.shopping(this.cola.setPrice());
                    System.out.println("Wypiłeś/aś cole");
                }
                choseProduct();
                break;

            }
            case 3: {

                if (this.money.getMoney() >= this.pizza.setPrice()) {
                    this.hungry.addPoint(this.pizza.setNumberOfPoints());
                    this.money.shopping(this.pizza.setPrice());
                    System.out.println("Zjadłeś/aś pizze");
                }
                choseProduct();
                break;

            }
            case 4: {
                if (this.money.getMoney() >= this.energydrink.setPrice()) {
                    this.tired.addPoint(this.energydrink.setNumberOfPoints());
                    this.money.shopping(this.energydrink.setPrice());
                    System.out.println("Wypiłeś/aś redbulla");
                }
                choseProduct();
                break;
            }
            case 5: {
                break;

            }
            default: {
                System.out.println("Błędny przycisk!");
            }
        }
    }


}
