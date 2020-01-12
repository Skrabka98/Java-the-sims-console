package Game;

import Interfaces.SetNumberOfPoints;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.util.Scanner;

public class Sleep implements SetNumberOfPoints {

    private Scanner scanner;
    private int numberOfSleep;
    Tired tired;
    Stench stench;
    Hungry hungry;

    public Sleep (){
     this.scanner=new Scanner(System.in);
     this.numberOfSleep= numberOfSleep;
     this.tired = new Tired();
     this.stench = new Stench();
     this.hungry = new Hungry();
    }

    public  int setNumberOfPoints(){
        return 5;
    }

    public void sleepRequst(){
        System.out.println("Ile godzin snu?");
        this.numberOfSleep= scanner.nextInt();
        sleeping(numberOfSleep);
    }

    public void sleeping(int sleepHour){
        this.tired.addPoint(sleepHour*setNumberOfPoints());
        this.stench.loosOfPoints(sleepHour*2);
        this.hungry.loosOfPoints(sleepHour*setNumberOfPoints());

    }

}
