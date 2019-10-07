import java.util.Scanner;

public class tester {
    public static void main(String[] args) {

        Scanner player = new Scanner(System.in);

        int com = (int)(Math.random()*2 + 1);

        String[] rps = {"rock", "paper", "scissors"};

        String npcChoice = rps[com];
        System.out.println(npcChoice);


            System.out.println("Choose rock, paper, or scissors");
            String yourChoice = player.next();
            System.out.println("You chose:  " + yourChoice);

            if (npcChoice.equals(yourChoice))
                System.out.println("TIE");

            else if (npcChoice.equals("rock") && yourChoice.equals("paper")) {
                System.out.println("it is rock");
                System.out.println("you win"); }
            else if (npcChoice.equals("rock") && yourChoice.equals("scissors")){
                System.out.println("it is rock");
                System.out.println("You lose"); }

            else if (npcChoice.equals("paper") && yourChoice.equals("scissors")){
                System.out.println("it is paper");
                System.out.println("you win"); }
            else if (npcChoice.equals("paper") && yourChoice.equals("rock")){
                System.out.println("it is paper");
                System.out.println("you lose"); }

            else if (npcChoice.equals("scissors") && yourChoice.equals("paper")){
                System.out.println("it is scissors");
                System.out.println("you lose"); }
            else if (npcChoice.equals("scissors") && yourChoice.equals("rock")){
                System.out.println("it is scissors");
                System.out.println("you win"); }

            else {
                System.out.println("eerroorrsssss");
            }





//
//        //rock!!!
//        if (com == rock) {
//            System.out.println("The computer chose:  rock");
//
//            if (yourChoice.equals("rock")){
//                System.out.println("TIE");
//            }
//
//            else if (yourChoice.equals("paper")){
//                System.out.println("YOU WIN");
//            }
//            else if (yourChoice.equals("scissors")){
//                System.out.println("YOU LOSE");
//            }
//
//            else {
//                System.out.println("Invalid response. Please try again.");
//            }
//
//        }
//
//        if (com == paper) {
//            System.out.println("The computer chose:  paper");
//
//            if (yourChoice.equals("rock")){
//                System.out.println("YOU LOSE");
//            }
//
//            else if (yourChoice.equals("paper")){
//                System.out.println("TIE");
//            }
//            else if (yourChoice.equals("scissors")){
//                System.out.println("YOU WIN ");
//            }
//
//            else {
//                System.out.println("Invalid response. Please try again");
//            }
//
//        }
//
//        if (com == scissors) {
//            System.out.println("The computer chose:  scissors");
//
//            if (yourChoice.equals("rock")){
//                System.out.println("YOU WIN");
//            }
//
//            else if (yourChoice.equals("paper")){
//                System.out.println("YOU LOSE");
//            }
//            else if (yourChoice.equals("scissors")){
//                System.out.println("TIE ");
//            }
//
//            else {
//                System.out.println("Invalid response. Please try again");
//            }



        }
}

