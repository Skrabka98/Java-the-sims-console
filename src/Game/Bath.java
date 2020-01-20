package Game;

import Interfaces.SetNumberOfPoints;

public class Bath implements SetNumberOfPoints {

    private Time time;
    private Play play;

    public Bath(Play play){
        this.play = play;
        this.time = play.time;
    }

    public Bath() {

    }

    public int setNumberOfPoints(){
        return 100;
    }

    public void batch(){
        setNumberOfPoints();
        time.addTime(2);
    }



}
