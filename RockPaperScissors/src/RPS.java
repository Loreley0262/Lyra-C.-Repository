import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);



        int rock = 1;
        int paper = 2;
        int scissors = 3;

        System.out.println("Choose rock, paper, or scissors");
        String yourChoice = player.next();
        System.out.println("You chose:  " + yourChoice);

        int com = (int)(Math.random()*3 + 1);


        //rock!!!
        if (com == rock) {
            System.out.println("The computer chose:  rock");

            if (yourChoice.equals("rock")){
                System.out.println("TIE");
            }

            else if (yourChoice.equals("paper")){
                System.out.println("YOU WIN");
            }
            else if (yourChoice.equals("scissors")){
                System.out.println("YOU LOSE");
            }

            else {
                System.out.println("Invalid response. Please try again.");
            }

        }

        if (com == paper) {
            System.out.println("The computer chose:  paper");

            if (yourChoice.equals("rock")){
                System.out.println("YOU LOSE");
            }

            else if (yourChoice.equals("paper")){
                System.out.println("TIE");
            }
            else if (yourChoice.equals("scissors")){
                System.out.println("YOU WIN ");
            }

            else {
                System.out.println("Invalid response. Please try again");
            }

        }

        if (com == scissors) {
                System.out.println("The computer chose:  scissors");

            if (yourChoice.equals("rock")){
                System.out.println("YOU WIN");
                }

            else if (yourChoice.equals("paper")){
                System.out.println("YOU LOSE");
                }
            else if (yourChoice.equals("scissors")){
                System.out.println("TIE ");
                }

            else {
                System.out.println("Invalid response. Please try again");
                }

            }

        }
    }
