import Game.Bath;
import Game.Money;
import Game.Time;
import Statistic.Hp;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.io.*;
import java.util.Scanner;

public class Save {
    private Hungry hungry;
    private Hp hp;
    private Stench stench;
    private Tired tired;
    private Time time;
    private Money money;

    private Save(){
        this.hungry = new Hungry();
        this.hp = new Hp();
        this.money= new Money();
        this.stench = new Stench();
        this.time = new Time();
        this.tired = new Tired();
    }





            Scanner scanner = new Scanner(System.in);
            public void write() {

                try {
                    PrintStream printStream = new PrintStream("save.txt");
                    String tekst;

                    while (scanner.hasNext() && !(tekst = scanner.next()).equals("stop")) {
                        printStream.println(tekst);
                    }
                    printStream.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }



}
