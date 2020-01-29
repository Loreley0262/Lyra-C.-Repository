import java.util.Scanner;

public class Time {
    Scanner scan = new Scanner(System.in);

    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){    //School constructor creates new schools, each with a name, district, and id number.
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
        System.out.println("input hour (24hr clock)");
        this.hour = scan.nextInt();
        System.out.println("input minute");
        this.minute = scan.nextInt();
        System.out.println("input second");
        this.second = scan.nextInt();

        if (this.second<0){
            this.second = 0;
        }
        if (this.second>59){
            this.second = 0;
            this.minute++;
        }
        if (this.minute<0){
            this.minute = 0;
        }
        if (this.minute>59){
            this.minute = 0;
            this.hour++;
        }
        if (this.hour<0){
            this.hour = 0;
        }
        if (this.hour>23){
            this.hour = 0;
        }
    }

    public String toString(){           //toString method prints the name and subject taught by the teacher
        return getHour()+":"+getMinute()+":"+getSecond();
    }
}
