package Game;

import Interfaces.SetNumberOfPoints;

public class Bath implements SetNumberOfPoints {

    private Time time;
    private Play play;

    public Bath(){
        this.play = new Play();
        this.time = play.time;
    }

    public int setNumberOfPoints(){
        return 100;
    }

    public void batch(){
        setNumberOfPoints();
        time.addTime(2);
    }



}
