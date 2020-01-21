package Shop.Food;


import Shop.Items;

public class Pizza extends Items {

    public Pizza(int numberOfPoints, double price) {
        super(numberOfPoints, price);
    }

    public Pizza() {
        super(0, 0);
    }

    public int setNumberOfPoints() {
        return 20;
    }

    public double setPrice() {
        return 17.50;
    }

    @Override
    public void productDescription() {
        System.out.println();
    }
}


