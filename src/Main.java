import Game.*;
import Shop.Buy;
import Shop.Food.Supermarket;
import Shop.Games;
import Shop.Medicament.Pharmacy;
import Statistic.Hungry;
import Statistic.SeeStatistic;
import Statistic.Stench;
import Statistic.Tired;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) throws IOException {
        Play play = new Play();
        Bath bath = new Bath(play);
        Work work = new Work(play);
        Sleep sleep = new Sleep(play);
        SeeStatistic seeStatistic = new SeeStatistic(play);
        Supermarket supermarket = new Supermarket(play);
        Pharmacy pharmacy = new Pharmacy(play);
        Buy buy = new Buy(play);
        Games games = new Games(play);

        Player player = new Player(work, sleep, bath, seeStatistic, buy,games);
        player.menuPlayer();












    }
}
