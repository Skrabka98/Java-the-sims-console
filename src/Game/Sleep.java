package Game;

import Interfaces.SetNumberOfPoints;

public class Sleep implements SetNumberOfPoints {

    private final int maxSleepHour = 16;
    private Play play;
    final private int value = 5;//ilość głodu i smrodu na godzine


    public Sleep(Play play) {
        this.play = play;
    }


    public int setNumberOfPoints() {
        return 10;
    } // iość punktów o jaką jest zwiększany sen na godzinę


    public void sleeping(int sleepHour) {
        if(sleepHour<=maxSleepHour){
            this.play.tired.addPoint(sleepHour * setNumberOfPoints());
            this.play.stench.loosOfPoints(sleepHour * value);
            this.play.hungry.loosOfPoints(sleepHour * value);
            this.play.time.addTime(sleepHour);}
        else{
            System.out.println("Możesz spać tylko "+maxSleepHour+" godzin!");
        }
    }

}
