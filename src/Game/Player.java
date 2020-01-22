package Game;


import Shop.Buy;
import Shop.Games;
import Statistic.*;

import java.util.Scanner;

public class Player {

    private int whatDoYouDo;
    private int choiceHoursWork;
    private int sleepHouer;
    private Scanner scan;
    private Work work;
    private Sleep sleep;
    private Bath bath;
    private Buy buy;
    private Games games;
    private SeeStatistic seeStatistic;
    private Play play;
    private Hp hp;
    private Time time;


    public Player(Work work, Sleep sleep, Bath bath, SeeStatistic seeStatistic, Buy buy, Games games, Play play) {
        this.whatDoYouDo = whatDoYouDo;
        this.choiceHoursWork = choiceHoursWork;
        this.play = play;
        this.work = work;
        this.sleepHouer = sleepHouer;
        this.sleep = sleep;
        this.bath = bath;
        this.buy = buy;
        this.games = games;
        this.seeStatistic = seeStatistic;

    }

    public void menuPlayer(){

        this.play.hp.die();
        this.games.winner();
        this.seeStatistic.see();
        System.out.println("1.Praca\n2.Sen\n3.Kąpiel\n4.Sklep\n5.Steam\n6.Wyjście z gry");
        scan = new Scanner(System.in);
        this.whatDoYouDo = scan.nextInt();
        switch (this.whatDoYouDo) {
            case 1: {
                this.seeStatistic.see();
                System.out.println("Możesz iść do pracy na\n4 godziny\n8 godzin");
                this.choiceHoursWork = scan.nextInt();
                this.work.workingHours(this.choiceHoursWork);
                menuPlayer();
                break;

            }
            case 2: {
                this.seeStatistic.see();
                System.out.println("Na ile godzin idzesz spać?");
                this.sleepHouer = scan.nextInt();
                this.sleep.sleeping(this.sleepHouer);
                menuPlayer();
            }
            case 3: {
                bath.batch();
                menuPlayer();
                break;
            }
            case 4: {
                if (this.play.time.timeOfDay() == true) {
                    this.seeStatistic.see();
                    this.buy.buying();
                } else {
                    System.out.println("Sklep jest czynny w godzinnach 6-22!");

                }
                menuPlayer();
                break;
            }
            case 5: {
                this.seeStatistic.see();
                this.games.buingGames();
                menuPlayer();
                break;
            }
            case 6: {
                System.exit(0);
            }
            default: {
                System.out.println("Wybierz odpowiedni numer!");
                menuPlayer();
                break;
            }

        }
        scan.close();
    }


}
