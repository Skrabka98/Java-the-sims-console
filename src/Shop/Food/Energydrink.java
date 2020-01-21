package Shop.Food;

import Shop.Items;

public class Energydrink extends Items {

    public Energydrink(int numberOfPoints, double price) {
        super(numberOfPoints, price);
    }

    public Energydrink() {
        super(0, 0);
    }

    public int setNumberOfPoints() {
        return 10;
    }

    public double setPrice() {
        return 5.50;
    }

    @Override
    public String productDescription() {
        String description = "4.Redbull: \tKoszt: " + setPrice() + "\tEnergia: " + setNumberOfPoints();
        return description;
    }
}

