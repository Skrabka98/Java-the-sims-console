package Shop;

import Shop.Food.Supermarket;
import Shop.Medicament.Pharmacy;

import java.util.Scanner;

public class Buy {
    private int chose;
    Supermarket supermarket;
    Pharmacy pharmacy;

    public Buy(){
        this.chose=chose;
    }

    public void buying(){
        System.out.println("1.Biedra\n2.Apteka");
        Scanner sc=new Scanner(System.in);
        this.chose=sc.nextInt();
        switch (chose){
            case 1:{
                supermarket.choseProduct();
                break;
            }
            case 2:{
               pharmacy.choseProduct();
            }
        }
    }



}
