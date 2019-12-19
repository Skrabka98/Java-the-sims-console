package Shop.Food;

 abstract public class Food {
    private String name;
    private int numberOfPoints;

    Food(String name, int numberOfPoints){
        this.name=name;
        this.numberOfPoints=numberOfPoints;
    }

    abstract public void addPointsOfLive();


}
