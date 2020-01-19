package Game;

import NieMamPojęciaJakToWykorzystać.WindowsApps;
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
    private WindowsApps windowsApps ;
    private SeeStatistic seeStatistic;




    public Player(){
        this.whatDoYouDo= whatDoYouDo;
        this.choiceHoursWork = choiceHoursWork;
        this.scan = new Scanner(System.in);
        this.work = new Work();
        this.sleepHouer = sleepHouer;
        this.sleep = new Sleep();
        this.bath = new Bath();
        this.buy = new Buy();
        this.windowsApps = new WindowsApps();
        this.seeStatistic = new SeeStatistic();

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
        }
        scan.close();
    }

}
