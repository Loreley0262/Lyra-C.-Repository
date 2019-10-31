import java.util.Scanner;

public class rpsButString {
    public static void main(String[] args) {

        //You can find this as "RPS but looped" too.

        Scanner scan = new Scanner(System.in);
        boolean asdf = true;
        boolean fdsa = false;
        int uWins = 0;
        int uLosses = 0;
        int nono = 0;

        while (asdf) {
            System.out.println("Choose rock, paper, or scissors:");
            String yourChoice = scan.next();
            System.out.println("You chose:  " + yourChoice);

            int com = (int)(Math.random()*2 + 1);
            String[] rps = {"rock", "paper", "scissors"};
            String npcChoice = rps[com];

            if (npcChoice.equals(yourChoice)) {
                System.out.println("You tied! How odd... Try again!");
                fdsa = true;
            }

            else if (npcChoice.equals("rock") && yourChoice.equals("paper")) {
                System.out.println("Com chose:  Rock");
                System.out.println("You WIN! YAY!");
                uWins++;
                System.out.println("You have " + uWins +" wins and " + uLosses + " losses.");
                fdsa = true;}
            else if (npcChoice.equals("rock") && yourChoice.equals("scissors")){
                System.out.println("Com chose:  Rock");
                System.out.println("You lose... Try again! Positive vibes are coming your way!");
                uLosses++;
                System.out.println("You have " + uWins +" wins and " + uLosses + " losses.");
                fdsa = true;}

            else if (npcChoice.equals("paper") && yourChoice.equals("scissors")){
                System.out.println("Com chose:  Paper");
                System.out.println("You WIN! YAY!");
                uWins++;
                System.out.println("You have " + uWins +" wins and " + uLosses + " losses.");
                fdsa = true;}
            else if (npcChoice.equals("paper") && yourChoice.equals("rock")){
                System.out.println("Com chose:  Paper");
                System.out.println("You lose... Try again! Positive vibes are coming your way!");
                uLosses++;
                System.out.println("You have " + uWins +" wins and " + uLosses + " losses.");
                fdsa = true;}

            else if (npcChoice.equals("scissors") && yourChoice.equals("rock")){
                System.out.println("Com chose:  Scissors");
                uWins++;
                System.out.println("You have " + uWins +" wins and " + uLosses + " losses.");
                System.out.println("You WIN! YAY!");
                fdsa = true;}
            else if (npcChoice.equals("scissors") && yourChoice.equals("paper")){
                System.out.println("Com chose:  Scissors");
                System.out.println("You lose... Try again! Positive vibes are coming your way!");
                uLosses++;
                System.out.println("You have " + uWins +" wins and " + uLosses + " losses.");
                fdsa = true;}

            else {
                System.out.println("Invalid response. Please try again.");
                asdf = true;
                fdsa = false;
                nono++;
            }

            while (fdsa){
                System.out.println("Would you like to play again? (y/n)");
                String yOrN = scan.next();

                if (yOrN.toLowerCase().equals("y")){
                    asdf = true;
                    fdsa = false; }

                else if (yOrN.toLowerCase().equals("n")){
                    System.out.println("Thank you for playing! \n" +
                            " You have " + uWins +" wins and " + uLosses + " losses.");
                    if (uWins == uLosses){
                        System.out.println("You tied with the computer! Nice job!"); }
                    else if (uWins>uLosses){
                        System.out.println("You beat the computer! Congratulations!"); }
                    else if (uWins<uLosses){
                        System.out.println("You lost against the computer. But DON'T GIVE UP! POSITIVITY!"); }

                    if (nono>0){
                        if (nono>=3){
                            System.out.println("You also input invalid responses " + nono + " times. " +
                                    "\n \n \t \t \t You're not illiterate, so do better next time you dumdum!"); }
                        else {
                            System.out.println("You also input invalid responses " + nono + " times. "); } }
                    else{
                        System.out.println("You input invalid responses " + nono + " times. Nice typing skills!"); }
                    asdf = false;
                    fdsa = false; }
                else{
                    System.out.println("Invalid response. Please try again.");
                    fdsa = true;
                    nono++; }
            }
        }
    }
}

