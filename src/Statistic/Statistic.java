package Statistic;

public class Statistic {

    private final int maxPoint ;
    private final int minPoint ;
    private int numberOfPoint ;

    public Statistic(int maxPoint, int minPoint){
        this.maxPoint = 100;
        this.minPoint = 0;
        this.numberOfPoint = maxPoint;
    }


    public int AddingPoint (double numberOfPoint) {
        this.numberOfPoint += numberOfPoint;
        if(this.numberOfPoint>= maxPoint){
            return maxPoint;
        }else {
            return this.numberOfPoint;
        }
    }

    public int LoosOfPoints(double numberOfPoint){
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
