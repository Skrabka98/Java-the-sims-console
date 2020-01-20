package Game;

import Statistic.Hp;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.util.Random;

public class Work {
  public final int fullTimeWork=8;
  public final int halfTimeWork=4;
  private final double salaryW=120;
  private Time time;
  private Money money;
  private Tired tired;
  private Stench stench;
  private Hungry hungry;
  private Random rand;
  private Hp hp;
  private int accidentAtWork;
  private Play play;

  public Work (Play play){
    this.play = play;
    this.time = play.time;
    this.money= play.money;
    this.tired = play.tired;
    this.stench = play.stench;
    this.hungry = play.hungry;
    this.rand = new Random();
    this.hp = play.hp;
    this.accidentAtWork = accidentAtWork;
  }

  public Work() {

  }

  public void workingFullTime(){
    this.time.addTime(fullTimeWork);
    this.money.salary(salaryW);
    this.tired.loosOfPoints(60);
    this.stench.loosOfPoints(fullTimeWork);
    this.hungry.loosOfPoints(fullTimeWork);
    this.hp.loosOfPoints(randomPoint());
    System.out.println(time.getTime());
  }
  public void xxx(){
    System.out.println(time.getTime());
  }
  public void workingHalfTime(){
    this.time.addTime(halfTimeWork);
    this.money.salary((salaryW/2));
    this.tired.loosOfPoints(30);
    this.stench.loosOfPoints(halfTimeWork);
    this.hungry.loosOfPoints(halfTimeWork);
    this.hp.loosOfPoints(randomPoint());
  }

  public int randomPoint(){
    this.accidentAtWork= this.rand.nextInt(11)+1;
    return this.accidentAtWork;
  }


  public void workingHours(int choiceHoursWork){
    if(choiceHoursWork == 4){
      workingHalfTime();
        System.out.println("Idziesz do parcy na 4h");
    }else if (choiceHoursWork == 8){
      workingFullTime();
        System.out.println("Idziesz do pracy na 8h");
    }else{
      System.out.println("Możesz iść do pracy tylko na cztery lub osiem godzin");
    }
  }



}
