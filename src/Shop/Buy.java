package Shop;

import Game.Player;
import Shop.Food.Supermarket;
import Shop.Medicament.Pharmacy;

import java.io.IOException;
import java.util.Scanner;

public class Buy {
    private int choseing;
    private Supermarket supermarket;
    private Pharmacy pharmacy;
    private Player player;

    public Buy(){
        this.choseing=choseing;
        this.supermarket = new Supermarket();
        this.pharmacy = new Pharmacy();


    }

    public void buying() throws IOException {
        System.out.println("1.Biedra\n2.Apteka\n3.Powrót");
        Scanner sc=new Scanner(System.in);
        this.choseing=sc.nextInt();
        switch (choseing){
            case 1:{
                supermarket.choseProduct();
                buying();
                break;
            }
            case 2:{
               pharmacy.choseProduct();
               buying();
               break;
            }
            case 3:
            {
               player = new Player();
               player.menuPlayer();
            }
            default:{
                System.out.println("Błędny przycisk!");
            }
        }
    }



}
