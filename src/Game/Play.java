package Game;

import Statistic.Hp;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

public class Play {
    public Time time;
    public Hp hp;
    public Hungry hungry;
    public Stench stench;
    public Tired tired;
    public Money money;

    public Play() {
        this.time = new Time();
        this.hp = new Hp();
        this.hungry = new Hungry();
        this.stench = new Stench();
        this.tired = new Tired();
        this.money = new Money();
    }
}
