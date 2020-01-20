package Statistic;

import Game.Money;
import Game.Play;
import Game.Time;

public class SeeStatistic {
    private Hp hp;
    private Hungry hungry;
    private Stench stench;
    private Tired tired;
    private Money money;
    private Time time;
    private Play play;

    public SeeStatistic(Play play){
        this.play = play;
        this.hp = play.hp;
        this.hungry = play.hungry;
        this.stench = play.stench;
        this.tired = play.tired;
        this.money = play.money;
        this.time = play.time;
    }

    public SeeStatistic() {

    }


    public void see(){
       System.out.println("Time: "+time.getTime()+"\tMoney: "+money.getMoney());
       System.out.println("Hp: "+hp.getNumberOfPoint()+"  Hungry: "+hungry.getNumberOfPoint()+"  Stench: "+stench.getNumberOfPoint()+"  Tired: "+tired.getNumberOfPoint());
    }
}
