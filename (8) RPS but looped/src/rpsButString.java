import java.util.Scanner;

    public class rpsButString {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            boolean asdf = true;
            int uWins = 0;
            int uLosses = 0;

            while (asdf) {
                System.out.println("Choose rock, paper, or scissors: Input x to exit");
                String yourChoice = scan.next();
                if (yourChoice.equals("x")) {
                    System.out.println("Thank you for playing! \n" +
                            " You have " + uWins + " wins and " + uLosses + " losses.");
                    System.out.println("----------------------------------------------------------------------");
                    break;
                }
                System.out.println("You chose:  " + yourChoice);

                int com = (int) (Math.random() * 2 + 1);
                String[] rps = {"rock", "paper", "scissors"};
                String npcChoice = rps[com];


                if (npcChoice.equals(yourChoice)) {
                    System.out.println("You tied! How odd... Try again!");
                } else if (npcChoice.equals("rock") && yourChoice.equals("paper")) {
                    System.out.println("Com chose:  Rock");
                    System.out.println("You WIN! YAY!");
                    uWins++;
                    System.out.println("You have " + uWins + " wins and " + uLosses + " losses.");
                } else if (npcChoice.equals("rock") && yourChoice.equals("scissors")) {
                    System.out.println("Com chose:  Rock");
                    System.out.println("You lose... Try again! Positive vibes are coming your way!");
                    uLosses++;
                    System.out.println("You have " + uWins + " wins and " + uLosses + " losses.");
                } else if (npcChoice.equals("paper") && yourChoice.equals("scissors")) {
                    System.out.println("Com chose:  Paper");
                    System.out.println("You WIN! YAY!");
                    uWins++;
                    System.out.println("You have " + uWins + " wins and " + uLosses + " losses.");
                } else if (npcChoice.equals("paper") && yourChoice.equals("rock")) {
                    System.out.println("Com chose:  Paper");
                    System.out.println("You lose... Try again! Positive vibes are coming your way!");
                    uLosses++;
                    System.out.println("You have " + uWins + " wins and " + uLosses + " losses.");
                } else if (npcChoice.equals("scissors") && yourChoice.equals("rock")) {
                    System.out.println("Com chose:  Scissors");
                    uWins++;
                    System.out.println("You have " + uWins + " wins and " + uLosses + " losses.");
                    System.out.println("You WIN! YAY!");
                } else if (npcChoice.equals("scissors") && yourChoice.equals("paper")) {
                    System.out.println("Com chose:  Scissors");
                    System.out.println("You lose... Try again! Positive vibes are coming your way!");
                    uLosses++;
                    System.out.println("You have " + uWins + " wins and " + uLosses + " losses.");
                } else {
                    System.out.println("Invalid response. Please try again.");
                    asdf = true;
                }
                System.out.println("----------------------------------------------------------------------");

            }
        }
    }

