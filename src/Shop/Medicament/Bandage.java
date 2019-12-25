package Shop.Medicament;

import Shop.Items;

public class Bandage extends Items {

    public Bandage (int numberOfPoints,double price){
        super( numberOfPoints, price);
    }

    @Override
    public void ProduktDescription() {
        System.out.println();
    }
}


