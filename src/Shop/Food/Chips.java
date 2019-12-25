package Shop.Food;

import Shop.Items;

public class Chips extends Items {

    public Chips(int numberOfPoints,double price){
        super( numberOfPoints, price);
    }

    @Override
    public void ProduktDescription() {
        System.out.println();
    }
}
