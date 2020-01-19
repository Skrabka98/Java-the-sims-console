package Statistic;

abstract public class Statistic {

    private final int maxPoint = 100 ;
    private final int minPoint = 0;
    private int numberOfPoint ;

    Statistic( int numberOfPoint){
        this.numberOfPoint = maxPoint;
    }



    public int addPoint (int numberOfPoint) {
        this.numberOfPoint += numberOfPoint;
        if(this.numberOfPoint>= maxPoint){
            return maxPoint;
        }else {
            return this.numberOfPoint;
        }

    }
    public int showPoints(){
        return this.numberOfPoint;
    }

    public int loosOfPoints(double numberOfPoint){
        this.numberOfPoint-= numberOfPoint;
        if(this.numberOfPoint<= minPoint){
            return minPoint;
        }else {
            return this.numberOfPoint;
        }
    }

    public void setNumberOfPoint(int numberOfPoint) {
        this.numberOfPoint = numberOfPoint;
    }

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

}
