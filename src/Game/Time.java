package Game;

public class Time {
    public int hour = 14;//czemu 6?
    private int day = 0;
    public int time; //do czego to?

    public Time() {
        this.hour = hour;
        this.day = day;
    }

    public int timeOfDay() { //sprawdza czy dzień czy noc
        if ((this.hour >= 6) && (this.hour < 23))
            return 1;
        else {
            return 0;
        }
    }

    private void setDay() {
        if (this.hour >= 24) {
            this.hour = this.hour - 24;
            this.day++;
        }
    }

    public void addTime(int time) {
        hour += time;
        setDay();
    }


    public int getTime() {
        return hour;
    }
}
