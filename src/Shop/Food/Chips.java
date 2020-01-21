package Shop.Food;


import Shop.Items;

public class Chips extends Items {

    public Chips(int numberOfPoints, double price) {
        super(numberOfPoints, price);
    }

    public Chips() {
        super(0, 0);
    }

    public int setNumberOfPoints() {
        return 20;
    }

    public double setPrice() {
        return 7.50;
    }

    @Override
    public String productDescription() {
        String description = "1.Chips:\tKoszt: " + setPrice() + "\tNajedzenie: " + setNumberOfPoints();
        return description;
    }
}
