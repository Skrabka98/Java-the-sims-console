package Statistic;

abstract public class Statistic {

    private final int maxPoint ;
    private final int minPoint ;
    private int numberOfPoint ;

    public Statistic(int maxPoint, int minPoint, int numberOfPoint){
        this.maxPoint = 100;
        this.minPoint = 0;
        this.numberOfPoint = 20;
    }


    public int addPoint (double numberOfPoint) {
        this.numberOfPoint += numberOfPoint;
        if(this.numberOfPoint>= maxPoint){
            return maxPoint;
        }else {
            return this.numberOfPoint;
        }
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
