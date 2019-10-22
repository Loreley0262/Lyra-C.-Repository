import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        //Program 6 Modular Factoring (enter 2 nums, find all factor of 7 in between the nums)

        Scanner scan = new Scanner(System.in);

        int[] nums = new int[2];


        System.out.println("Input 2 numbers. This program will find all of the factors in between those numbers.");

        do {
            System.out.println("Enter the lower number:");
            nums[0] = scan.nextInt();

            System.out.println("Enter the higher number:");
            nums[1] = scan.nextInt();

            if (nums[0]>nums[1]){
                System.out.println("You entered your numbers in the wrong order! Please try again.");
            }
        } while (nums[0]>nums[1]);


        int hoia = 0;
        int i = 0;
        for (i=0; i<=nums[1]; i++){

            if (i%7==0 && i!=0 && i>=nums[0]){
                System.out.println(i+ " is divisible by 7.");
                hoia++;
            }
            }

            if (i>=nums[1]){
                if (hoia == 1){
                    System.out.println("There is " + hoia + " factor of 7 between " + nums[0] + " and " + nums[1] + ".");
                }

                else {
                    System.out.println("There are " + hoia + " factors of 7 between " + nums[0] + " and " + nums[1] + ".");

                }
            }
    }
}
