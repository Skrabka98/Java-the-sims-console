package Shop;


abstract public class Items {
    private int numberOfPoints;
    private double price;


    public Items(int numberOfPoints, double price)
    {
        this.numberOfPoints=numberOfPoints;
        this.price=price;
    }

    public abstract void ProduktDescription();

    private String getName() {
        return getClass().getSimpleName();
    }


}
