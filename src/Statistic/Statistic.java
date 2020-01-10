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



/*
to moj zamysł jest taki żeby wszystkie klasy z paczki Statistic dziedziczyły z tej klasy
tylko nie wiem czy nie lepiej zrobic interfejsu z ilością punktów każtej z tych rzeczy
a w tej klasie(można ja wtedy inaczej nazawć) tylko nimi zarządzać to drugie rozwiązanie
pozawala na łatewiejszą modyfikacje kodu i nie wiem więc narazie nie dziedzicze tylko zostawiam tak
*/
}
