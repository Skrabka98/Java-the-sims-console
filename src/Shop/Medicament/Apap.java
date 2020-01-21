package Shop.Medicament;


import Shop.Items;

public class Apap extends Items {

    public Apap(int numberOfPoints, double price) {
        super(numberOfPoints, price);
    }

    public Apap() {
        super(0, 0);
    }

    public int setNumberOfPoints() {
        return 10;
    }

    public double setPrice() {
        return 15.99;
    }


    @Override
    public String productDescription() {
        String description = "1.Apap:\tKoszt: " + setPrice() + "\tLeczenie: " + setNumberOfPoints();
        return description;
    }

}
