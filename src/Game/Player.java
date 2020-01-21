package Game;


import Shop.Buy;
import Shop.Games;
import Statistic.*;

import javax.imageio.IIOException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

    private int whatDoYouDo;
    private int choiceHoursWork;
    private int sleepHouer;
    private Scanner scan;
    private Work work;
    private Sleep sleep ;
    private Bath bath;
    private Buy buy;
    private Games games;
    private SeeStatistic seeStatistic;
    private Play play;




    public Player(Work work, Sleep sleep, Bath bath, SeeStatistic seeStatistic, Buy buy,Games games){
        this.whatDoYouDo= whatDoYouDo;
        this.choiceHoursWork = choiceHoursWork;

        this.work = work;
        this.sleepHouer = sleepHouer;
        this.sleep = sleep;
        this.bath = bath;
        this.buy = buy;
        this.games = games;
        this.seeStatistic = seeStatistic;

    }

    public void menuPlayer() throws IOException {
        do{
        try{
        System.out.println("1.Praca\n2.Sen\n3.Kąpiel\n4.Sklep\n5.Wyjście z gry");
        scan = new Scanner(System.in);
        this.whatDoYouDo = scan.nextInt();
        switch(this.whatDoYouDo){
            case 1 :{
                this.seeStatistic.see();
                System.out.println("możesz iść do pracy na \n4 godziny\n8 godzin");
                this.choiceHoursWork = scan.nextInt();
                this.work.workingHours(this.choiceHoursWork);
                menuPlayer();
                break;

            }
            case 2 :{
                this.seeStatistic.see();
                System.out.println("Na ile idzesz spać?");
                this.sleepHouer = scan.nextInt();
                this.sleep.sleeping(this.sleepHouer);
                menuPlayer();
            }
            case 3 :{
                this.seeStatistic.see();
                bath.batch();
                menuPlayer();
                break;
            }
            case 4 :{
                this.seeStatistic.see();
               this.buy.buying();
               menuPlayer();
               break;
            }
            case 5: {
                this.seeStatistic.see();
              this.games.buingGames();
                menuPlayer();
              break;
            }
            default:{
                System.out.println("Idiota!");
            menuPlayer();
            break;}
        }
        scan.close();
    }catch (InputMismatchException e){
            System.out.println("Błędna liczba!");}
    }while(true);}


}
