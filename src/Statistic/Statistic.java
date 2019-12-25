package Statistic;

public class Statistic {

    private final int maxPoint = 100;
    private int numberOfPoint = maxPoint;

    public Statistic(){
        this.numberOfPoint=numberOfPoint;
    }

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

    public void AddingPoint (double numberOfPoint) {
        this.numberOfPoint += numberOfPoint;
    }

    public void LoosOfPoints(double numberOfPoint){
        this.numberOfPoint-= numberOfPoint;
    }

/*
to moj zamysł jest taki żeby wszystkie klasy z paczki Statistic dziedziczyły z tej klasy
tylko nie wiem czy nie lepiej zrobic interfejsu z ilością punktów każtej z tych rzeczy
a w tej klasie(można ja wtedy inaczej nazawć) tylko nimi zarządzać to drugie rozwiązanie
pozawala na łatewiejszą modyfikacje kodu i nie wiem więc narazie nie dziedzicze tylko zostawiam tak
*/
}
