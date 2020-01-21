package Game;

public class Time {
    private int hour = 6;//startowy czas
    private int day = 1;

    public Time() {
        this.hour = hour;
        this.day = day;
    }

    public boolean timeOfDay() { //sprawdza czy dzień czy noc
        if ((this.hour >= 6) && (this.hour < 23))
            return true;
        else {
            return false;
        }
    }

    private void setDay() {
        if (this.hour >= 24) {
            this.day+=this.hour / 24;
            this.hour = this.hour % 24;

        }
    }

    public void addTime(int time) {
        this.hour += time;
        setDay();
    }


    public int getTime() {
        return this.hour;
    }

    public int getDay() {
        return this.day;
    }
}
