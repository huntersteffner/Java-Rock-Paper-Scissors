import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        int computerGuess =  computerPicks();
    String wantToPlay = scan.nextLine();

    if(wantToPlay.equals("yes")) {
        System.out.println("\nGreat! Let's play then.");
    } else {
        System.out.println("\nMaybe some other time then!");
        System.exit(0);
    }

    int playerNum = 0;
    System.out.println("\nRock, paper, scissors. Shoot!");
    String playerGuess = scan.nextLine();


    if(playerGuess.equals("rock")) {
        playerNum = 0;
    } else if( playerGuess.equals("paper")) {
        playerNum = 1;
    } else if( playerGuess.equals("scissors")) {
        playerNum =2;
    } else {
        System.out.println("Invalid entry");
        System.exit(0);
    }

    String theWinner = checkWin(playerNum, computerGuess);

    System.out.println("\n" + theWinner);




    
              

        scan.close();
    }

    public static int computerPicks() {
        double computerChoice = Math.random() *6;
        computerChoice += 1;
        return (int)computerChoice;
    }


    public static String checkWin(int playerChoice, int computerChoice) {
        String result = "";
        if( playerChoice == computerChoice ) {
            result = "Tie";
        } else if ((playerChoice == 0 && computerChoice == 2) || (playerChoice == 1 && computerChoice == 0) || (playerChoice == 2 && computerChoice == 1)) {
            result = "You win!";
        } else {
            result = "You lose!";
        }

        return result;
    }


    

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        return result;
      }
 

}
