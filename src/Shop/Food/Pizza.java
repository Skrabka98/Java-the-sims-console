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
        return 40;
    }

    public double setPrice() {
        return 17.50;
    }

    @Override
    public String productDescription() {
        String description = "3.Pizza:\tKoszt: " + setPrice() + "\tNajedzenie: " + setNumberOfPoints();
        return description;
    }
}


