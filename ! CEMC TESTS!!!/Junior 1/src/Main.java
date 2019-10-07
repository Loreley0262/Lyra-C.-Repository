import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] nums = new int[4];
        nums[0] = scan.nextInt();
        nums[1] = scan.nextInt();
        nums[2] = scan.nextInt();
        nums[3] = scan.nextInt();

        if((nums[0] == 8 || nums[0] == 9) && (nums[3] == 8 || nums[3] == 9) && (nums[1] == nums[2])) {
            System.out.println("ignore");
        }

        else{
            System.out.println("answer");
        }
    }
}
