package Game;

import Interfaces.SetNumberOfPoints;

public class Bath implements SetNumberOfPoints {

    private Time time;

    public Bath(){
        this.time = new Time();
    }

    public int setNumberOfPoints(){
        return 100;
    }

    public void batch(){
        setNumberOfPoints();
        time.addTime(2);
    }



}
