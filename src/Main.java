import Game.Money;
import Game.Player;
import Game.Time;
import Game.Work;
import Shop.Buy;
import Shop.Food.Supermarket;
import Shop.Games;
import Statistic.Hungry;
import Statistic.Tired;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Player kup=new Player();
        Money money= new Money();
        Supermarket supermarket = new Supermarket();
        Tired tired = new Tired();
        Time time = new Time();
        Work work = new Work();
        work.workingFullTime();
        tired.loosOfPoints(50);
        System.out.println(time.getTime());
        System.out.println(tired.getNumberOfPoint());




    }
}
