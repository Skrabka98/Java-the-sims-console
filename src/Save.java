import Game.Bath;
import Game.Money;
import Game.Time;
import Statistic.Hp;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.io.*;

public class Save {
    //private Hungry hungry;
    private Hp hp;
    private Stench stench;
    private Tired tired;
    private Time time;
    private Money money;

    public Save(){
        //this.hungry = new Hungry();
        this.hp = new Hp();
        this.money= new Money();
        this.stench = new Stench();
        this.time = new Time();
        this.tired = new Tired();
    }



}
