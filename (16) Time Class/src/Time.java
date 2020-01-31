import java.util.Scanner;

public class Time {
    Scanner scan = new Scanner(System.in);

    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) {    //Time constructor creates a clock.
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

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

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {           //toString method prints the time
        if (this.second < 0) {
            this.second = 59;
            this.minute--;
        }
        if (this.second > 59) {
            this.second = 0;
            this.minute++;
        }
        if (this.minute < 0) {
            this.minute = 59;
            this.hour--;
        }
        if (this.minute > 59) {
            this.minute = 0;
            this.hour++;
        }
        if (this.hour < 0) {
            this.hour = 0;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        if (this.hour > 24) {
            this.hour = 1;
        }
        return getHour() + ":" + getMinute() + ":" + getSecond();
    }

    public void nextSecond() {
        this.second++;
        System.out.println(this.toString());
    }

    public void previousSecond() {
        this.second--;
        System.out.println(this.toString());
    }
}
