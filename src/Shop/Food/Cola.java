package Shop.Food;


import Shop.Items;

public class Cola extends Items  {

    public Cola (int numberOfPoints,double price){
        super( numberOfPoints, price);
    }

    public int setNumberOfPoints(){
        return 10;
    }

    public double setPrice(){
        return 5.50;
    }
    @Override
    public void productDescription() {
        System.out.println();
    }

}
