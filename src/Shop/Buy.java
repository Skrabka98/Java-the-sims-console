package Shop;

import Game.Play;
import Shop.Food.Supermarket;
import Shop.Medicament.Pharmacy;
import java.util.Scanner;

public class Buy {
    private int choseing;
    private Supermarket supermarket;
    private Pharmacy pharmacy;


    public Buy(Play play) {
        this.choseing = 0;
        this.supermarket = new Supermarket(play);
        this.pharmacy = new Pharmacy(play);

    }

    public void buying() {
        System.out.println("1.Biedronka\n2.Apteka\n3.Powrót");
        Scanner sc = new Scanner(System.in);
        this.choseing = sc.nextInt();
        switch (choseing) {
            case 1: {
                supermarket.choseProduct();
                buying();
                break;
            }
            case 2: {
                pharmacy.choseProduct();
                buying();
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
