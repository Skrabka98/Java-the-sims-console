package Game;

public class Time {
    private int hour=6;//czemu 6?
    private int day=0;
    private int time; //do czego to?
    public Time(){
        this.hour=hour;
        this.day=day;
    }
    private boolean timeOfDay(){ //sprawdze czy dzień czy noc
        if((this.hour>6)&&(this.hour<23))
            return true;
        else{
            return false;
        }
    }
    private void setDay(){
        if(this.hour>=24){
            this.hour=this.hour-24;
            this.day++;
        }
    }
    public void addTime(int time){
        hour+=time;
        setDay();
        timeOfDay();
    }

}
