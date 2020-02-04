public class Main {
    public static void main(String[] args) {
        Time clock = new Time(23, 59, 59);  //made a Time object called "clock"
        System.out.println(clock.getHour());
        clock.setTime(70,59,59);
        System.out.println(clock);
        clock.nextSecond();
        clock.previousSecond();
    }
}
