package Game;


import Shop.Buy;


import java.util.Scanner;

public class Player  {

    private int whatDoYouDo;
    private int choiceHoursWork;
    private int sleepHouer;
    private Scanner scan;
    private Work work;
    private Sleep sleep ;
    private Bath bath;
    private Buy buy;

    public Player(){
        this.whatDoYouDo= whatDoYouDo;
        this.choiceHoursWork = choiceHoursWork;
        this.scan = new Scanner(System.in);
        this.work = new Work();
        this.sleepHouer = sleepHouer;
        this.sleep = new Sleep();
        this.bath = new Bath();
        this.buy = new Buy();
    }

    public void menuPlayer()  {
        System.out.println("1.Praca\n2.Sen\n3.Kąpiel\n4.Sklep\n5.jeszcze nie wiem");
        this.whatDoYouDo = scan.nextInt();
        switch(this.whatDoYouDo){
            case 1 :{

                System.out.println(" Możesz iść do pracy na \n4 godziny\n8 godzin");
                this.choiceHoursWork = scan.nextInt();
                this.work.workingHours(this.choiceHoursWork);
                menuPlayer();
                break;
            }
            case 2 :{

                System.out.println("Na ile idzesz spać?");
                this.sleepHouer = scan.nextInt();
                this.sleep.sleeping(this.sleepHouer);
                menuPlayer();
                break;
            }
            case 3 :{

                bath.batch();
                menuPlayer();
                break;
            }
            case 4 :{

               this.buy.buying();
               menuPlayer();
               break;
            }

        }
    }
}
