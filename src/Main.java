import Game.*;
import Shop.Buy;
import Shop.Food.Supermarket;
import Shop.Games;
import Statistic.Hungry;
import Statistic.SeeStatistic;
import Statistic.Stench;
import Statistic.Tired;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
 //Player player = new Player();
    //player.menuPlayer();
        Play play = new Play();
        Work work = new Work();
        SeeStatistic seeStatistic = new SeeStatistic();
        work.workingFullTime();
        work.xxx();
        System.out.println(play.time.getTime());
        seeStatistic.see();









    }
}
