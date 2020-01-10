package Game;

import Statistic.Hp;
import Statistic.Stench;
import Statistic.Tired;

import java.util.Random;

public class Work {
  private final int fullTimeWork=8;
  private final int halfTimeWork=4;
  private final double salaryW=120;
  private Time time;
  private Money money;
  private Tired tired;
  private Stench stench;
  private Random rand;
  private Hp hp;
  private int accidentAtWork;

  public Work (){

    this.time = new Time();
    this.money= new Money();
    this.tired = new Tired();
    this.stench = new Stench();
    this.rand = new Random();
    this.hp = new Hp();
    this.accidentAtWork = accidentAtWork;
  }

  public void workingFullTime(){
    this.time.addTime(fullTimeWork);
    this.money.salary(salaryW);
    this.tired.loosOfPoints(fullTimeWork);
    this.stench.loosOfPoints(fullTimeWork);
    this.hp.loosOfPoints(randomPoint());
  }
  public void workingHalfTime(){
    this.time.addTime(halfTimeWork);
    this.money.salary((salaryW/2));
    this.tired.loosOfPoints(halfTimeWork);
    this.stench.loosOfPoints(halfTimeWork);
    this.hp.loosOfPoints(randomPoint());
  }

  public int randomPoint(){
    this.accidentAtWork= this.rand.nextInt(11)+1;
    return this.accidentAtWork;
  }



}
