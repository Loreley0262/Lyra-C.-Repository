public class testTest {
    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        //checks before running, might not run
        //don't know # of iterations
        while (x < 2) {
            System.out.println(x);
            x++;
        }

        //does it first, then decides to run
        do{
            System.out.println("HELLO");
            y++;
        } while (y < 10);

        //i is iteration
        //used to search for index positions
        //knows how many iterations
        //wait for special conditions, then break
        String hi = "hello there";
        for (int i = 0; i< hi.length(); i++){
            System.out.println(i);
            String as = hi.substring(i, i++);
            System.out.println(as);
        }


    }
}
