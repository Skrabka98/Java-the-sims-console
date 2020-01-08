package Shop;


import Shop.Interfaces.ItemsInterfaces;

abstract public class Items implements ItemsInterfaces {
    private int numberOfPoints=1;
    private double price=1;


    public Items(int numberOfPoints, double price)
    {
        this.numberOfPoints=numberOfPoints;
        this.price=price;
    }


    public abstract void productDescription();

}
