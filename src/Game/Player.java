package Game;

import java.util.Scanner;

public class Player {

    private int whatDoYouDo;
    private int choiceHoursWork;
    private Scanner scan;
    private Work work;

    public Player(){
        this.whatDoYouDo= whatDoYouDo;
        this.choiceHoursWork = choiceHoursWork;
        this.scan = new Scanner(System.in);
        this.work = new Work();
    }

    public void menuPlayer(){
        System.out.println("1.Praca\n2.Sen\n3.Kompiel\n4.Sklep\n5.");
        switch(this.whatDoYouDo){
            case 1 :{

                this.work.workingFullTime();

            }
        }
    }
}
