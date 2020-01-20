package Game;

import Interfaces.SetNumberOfPoints;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.util.Scanner;

public class Sleep implements SetNumberOfPoints {

    private Scanner scanner;
    private int numberOfSleep;
    private Play play;
    private Tired tired;
    private Stench stench;
    private Hungry hungry;
    private Time time;


    public Sleep (Play play){
     this.scanner=new Scanner(System.in);
     this.numberOfSleep= numberOfSleep;
     this.play = play;
     this.tired = play.tired;
     this.stench = play.stench;
     this.hungry = play.hungry;
     this.time = play.time;
    }


    public  int setNumberOfPoints(){
        return 10;
    } // iość punktów o jaką jest zwiększany sen na godzinę



    public void sleeping(int sleepHour){
        this.tired.addPoint(sleepHour*setNumberOfPoints());
        this.stench.loosOfPoints(sleepHour*setNumberOfPoints());
        this.hungry.loosOfPoints(sleepHour*setNumberOfPoints());
        this.time.addTime(sleepHour);
    }

}
