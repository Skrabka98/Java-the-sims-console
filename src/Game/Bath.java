package Game;

import Interfaces.SetNumberOfPoints;

public class Bath implements SetNumberOfPoints {

    private Play play;

    public Bath(Play play) {
        this.play = play;
    }


    public int setNumberOfPoints() {
        return 100;
    }

    public void batch() {
        this.play.stench.addPoint(setNumberOfPoints());
        this.play.time.addTime(2);
    }


}
