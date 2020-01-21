package Game;

import Interfaces.SetNumberOfPoints;

public class Bath implements SetNumberOfPoints {

    private Time time;
    private Play play;
    private Money money;

    public Bath(Play play) {
        this.play = play;
        this.time = play.time;
        this.money = play.money;
    }


    public int setNumberOfPoints() {
        return 100;
    }

    public void batch() {
        play.stench.addPoint(setNumberOfPoints());
        time.addTime(2);
    }


}
