package Shop;

import Shop.Food.Supermarket;
import Shop.Medicament.Pharmacy;

import java.util.Scanner;

public class Buy {
    private int choseing;
    Supermarket supermarket;
    Pharmacy pharmacy;

    public Buy(){
        this.choseing=choseing;
        this.supermarket = new Supermarket();
        this.pharmacy = new Pharmacy();
    }

    public void buying(){
        System.out.println("1.Biedra\n2.Apteka");
        Scanner sc=new Scanner(System.in);
        this.choseing=sc.nextInt();
        switch (choseing){
            case 1:{
                supermarket.choseProduct();
                break;
            }
            case 2:{
               pharmacy.choseProduct();
            }
            case 3:
            {
                //wyjscie ze sklepu do menu
            }
            default:{
                System.out.println("Błędny przycisk!");
            }
        }
    }



}
