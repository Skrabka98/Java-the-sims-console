package Game;

import Interfaces.SetNumberOfPoints;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.util.Scanner;

public class Sleep implements SetNumberOfPoints {

    private Scanner scanner;
    private int numberOfSleep;
    private  Tired tired;
    private Stench stench;
    private Hungry hungry;
    private Time time;

    public Sleep (){
     this.scanner=new Scanner(System.in);
     this.numberOfSleep= numberOfSleep;
     this.tired = new Tired();
     this.stench = new Stench();
     this.hungry = new Hungry();
     this.time = new Time();
    }

    public  int setNumberOfPoints(){
        return 5;
    } // iość punktów o jaką jest zwiększany sen na godzinę

  /*  public void sleepRequst(){
        System.out.println("Ile godzin snu?");
        this.numberOfSleep= scanner.nextInt();
        sleeping(numberOfSleep);
        scanner.close();
    }*/

    public void sleeping(int sleepHour){
        this.tired.addPoint(sleepHour);
        this.stench.loosOfPoints(sleepHour);
        this.hungry.loosOfPoints(sleepHour);
        this.time.addTime(sleepHour);
    }

}
