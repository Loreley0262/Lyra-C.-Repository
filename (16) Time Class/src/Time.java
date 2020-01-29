public class Time {

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    private int hour;
    private int minute;
    private int second;



    Time(int hour, int minute, int second){    //School constructor creates new schools, each with a name, district, and id number.
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

}
