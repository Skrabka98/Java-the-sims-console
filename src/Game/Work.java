package Game;

import Statistic.Hp;
import Statistic.Hungry;
import Statistic.Stench;
import Statistic.Tired;

import java.util.Random;

public class Work {
    private final int fullTimeWork = 8;
    private final int halfTimeWork = 4;
    private final double salaryW = 120;
    private final double bonus = 30;
    private Time time;
    private Money money;
    private Tired tired;
    private Stench stench;
    private Hungry hungry;
    private Random rand;
    private Hp hp;
    private int accidentAtWork;
    private Play play;


    public Work(Play play) {
        this.play = play;
        this.rand = new Random();
        this.accidentAtWork = 0;
    }


    public void workingFullTime() {
        this.play.time.addTime(fullTimeWork);
        this.play.money.salary(salaryW + bonus);
        this.play.tired.loosOfPoints(40);
        this.play.stench.loosOfPoints(40);
        this.play.hungry.loosOfPoints(40);
        this.play.hp.loosOfPoints(randomPoint());
    }

    public void workingHalfTime() {
        this.play.time.addTime(halfTimeWork);
        this.play.money.salary((salaryW / 2));
        this.play.tired.loosOfPoints(20);
        this.play.stench.loosOfPoints(20);
        this.play.hungry.loosOfPoints(20);
        this.play.hp.loosOfPoints(randomPoint());
    }

    public int randomPoint() {
        this.accidentAtWork = this.rand.nextInt(11) + 1;
        return this.accidentAtWork;
//        return  new Random().nextInt(11)+1;
    }


    public void workingHours(int choiceHoursWork) {
        if (((choiceHoursWork * 5) < this.play.tired.getNumberOfPoint()) && ((choiceHoursWork * 5) < this.play.hungry.getNumberOfPoint()) && ((choiceHoursWork * 5) < this.play.stench.getNumberOfPoint())) {
            if ((choiceHoursWork == 4)) {
                workingHalfTime();
                System.out.println("Idziesz do parcy na 4h");
            } else if (choiceHoursWork == 8) {
                workingFullTime();
                System.out.println("Idziesz do pracy na 8h");
            } else {
                System.out.println("Możesz iść do pracy tylko na cztery lub osiem godzin");
            }
        } else System.out.println("Musisz być najedzony, umyty i wypoczęty!");


    }

}
