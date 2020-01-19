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
            return numberOfPoint=maxPoint;
        }else {
            return this.numberOfPoint;
        }

    }

    public int loosOfPoints(int numberOfPoint){
        this.numberOfPoint-= numberOfPoint;
        if(this.numberOfPoint<= minPoint){
            return numberOfPoint=minPoint;
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
