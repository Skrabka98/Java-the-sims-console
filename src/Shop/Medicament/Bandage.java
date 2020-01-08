package Shop.Medicament;


import Shop.Items;

public class Bandage extends Items  {

    public Bandage (int numberOfPoints,double price){
        super( numberOfPoints, price);
    }

    public int setNumberOfPoints(){
        return 40;
    }
    public double setPrice(){
        return 50;
    }

    @Override
    public void productDescription() {
        System.out.println();
    }
}


