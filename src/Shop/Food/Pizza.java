package Shop.Food;

import Shop.Items;

public class Pizza extends Items {

    public Pizza (int numberOfPoints,double price){
        super( numberOfPoints, price);
    }

    @Override
    public void ProduktDescription() {
        System.out.println();
    }
}


