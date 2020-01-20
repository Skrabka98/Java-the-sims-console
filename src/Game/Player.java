package Game;


import Shop.Buy;
import Statistic.*;

import javax.imageio.IIOException;
import java.io.IOException;
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
    private SeeStatistic seeStatistic;
    private Play play;




    public Player(Work work, Sleep sleep, Bath bath, SeeStatistic seeStatistic, Buy buy){
        this.whatDoYouDo= whatDoYouDo;
        this.choiceHoursWork = choiceHoursWork;
        this.scan = new Scanner(System.in);
        this.work = work;
        this.sleepHouer = sleepHouer;
        this.sleep = sleep;
        this.bath = bath;
        this.buy = buy;
        this.seeStatistic = seeStatistic;

    }

    public void menuPlayer() throws IOException {
        System.out.println("1.Praca\n2.Sen\n3.Kąpiel\n4.Sklep\n5.Wyjście z gry");
        this.whatDoYouDo = scan.nextInt();
        switch(this.whatDoYouDo){
            case 1 :{
                this.seeStatistic.see();

                System.out.println("możesz iść do pracy na \n4 godziny\n8 godzin");
                this.choiceHoursWork = scan.nextInt();
                this.work.workingHours(this.choiceHoursWork);
                menuPlayer();

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
              System.exit(0);
            }
            default:{
                System.out.println("Idiota!");
            menuPlayer();
            break;}
        }
        scan.close();
    }

}
