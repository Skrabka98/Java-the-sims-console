package Game;

public class Time {
    private int hour=6;
    private int day=0;
    private int time;
    public Time(){
        this.hour=hour;
        this.day=day;
    }
    private boolean timeOfDay(){ //sprawdze czy dzień czy noc
        if((time>6)&&(time<23))
            return 1;
        else{
            return 0;
        }
    }
    private void setDay(){
        if(hour>=24){
            hour=hour-24;
            day++;
        }
    }
    public void addTime(time){
        hour+=time;
    }

}
