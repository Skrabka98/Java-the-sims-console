package Shop;


import Interfaces.SetNumberOfPoints;
import Interfaces.SetPrice;

abstract public class Items implements SetNumberOfPoints, SetPrice {
    private int numberOfPoints = 0;
    private double price = 0;


    public Items(int numberOfPoints, double price) {
        this.numberOfPoints = numberOfPoints;
        this.price = price;
    }


    public abstract String productDescription();

}
