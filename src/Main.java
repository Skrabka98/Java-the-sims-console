import Game.*;
import Shop.Buy;
import Shop.Games;
import Statistic.*;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Play play = new Play();
        Bath bath = new Bath(play);
        Work work = new Work(play);
        Sleep sleep = new Sleep(play);
        SeeStatistic seeStatistic = new SeeStatistic(play);
        Buy buy = new Buy(play);
        Games games = new Games(play);
        Player player = new Player(work, sleep, bath, seeStatistic, buy, games, play);
        System.out.println("Witaj w symulatorze Nerda!\nAby przejść grę musisz wykupić wszystkie gry na Steamie.\nNie daj Nerdowi umrzeć!\nPowodzenia!\n");
        do{
            try {
                player.menuPlayer();
            } catch (InputMismatchException e) {
                System.out.println("Wybierz odpowiedni numer!");
            }
        }while(true);
    }
}
