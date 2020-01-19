package Statistic;

import Game.Money;
import Game.Time;

public class SeeStatistic {
    private Hp hp;
    private Hungry hungry;
    private Stench stench;
    private Tired tired;
    private Money money;
    private Time time;

    public SeeStatistic(){
        this.hp = new Hp();
        this.hungry = new Hungry();
        this.stench = new Stench();
        this.tired = new Tired();
        this.money = new Money();
        this.time = new Time();
    }


   public void see(){
       System.out.println("Time: "+time.getTime()+"\tMoney: "+money.getMoney());
       System.out.println("Hp: "+hp.getNumberOfPoint()+"  Hungry: "+hungry.getNumberOfPoint()+"  Stench: "+stench.getNumberOfPoint()+"  Tired: "+tired.getNumberOfPoint());
    }
}
