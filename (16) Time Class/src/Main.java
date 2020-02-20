public class Main {
    public static void main(String[] args) {
        Time clock = new Time(23, 59, 59);  //made a Time object called "clock"
        clock.setTime(0,0,0);
        System.out.println(clock);
        clock.nextSecond();
        clock.previousSecond();
        clock.setHour(79);
        System.out.println(clock);
    }
}
