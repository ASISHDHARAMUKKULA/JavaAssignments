import java.util.Scanner;

public class FinaleGame {

    boolean flag = true,status =true;

    int guesserNumber,playerOneNumber, playerTwoNumber;


    public int guesserNumber() {
        do {
            System.out.println("Guesser Please enter the number between 1 to 5");
            Scanner scanner = new Scanner(System.in);
            guesserNumber=scanner.nextInt();
            if (guesserNumber >= 1 && guesserNumber <= 5) {
                System.out.println("Guesser entered Correct number ");
                flag=false;

            } else
                System.out.println("Guesser Please enter number between 1 to 5 ");
        }while (flag);

        return guesserNumber;

    }


    public int playerNumberOne(){
        do{
            System.out.println("Player 1 Please enter the number between 1 to 5");
            Scanner scanner = new Scanner(System.in);
            playerOneNumber=scanner.nextInt();
            if (playerOneNumber >= 1 && playerOneNumber <= 5) {
                System.out.println("player 1 entered Correct number");
                flag=false;

            } else
                System.out.println("Player 1 Please enter number between 1 to 5");
        }while (flag);

        return playerOneNumber;
        }

    public int playerNumberTwo(){
        do{
            System.out.println("Player 2 Pls enter the number between 1 to 5");
            Scanner scanner = new Scanner(System.in);
            playerTwoNumber=scanner.nextInt();
            if (playerTwoNumber >= 1 && playerTwoNumber <= 5) {
                System.out.println("Player 2 entered Correct number");
                status=false;

            } else
                System.out.println("Player 2 please enter the number between 1 to 5");
        }while (status);

        return playerTwoNumber;
    }


    public void compare(){

        if(guesserNumber==playerOneNumber && guesserNumber==playerTwoNumber){
                System.out.println("Player 1 and Player 2 guessed same number  so won the game");

            }
            else if(guesserNumber==playerOneNumber){
                System.out.println("player 1 won the Game");

            }
            else if(guesserNumber==playerTwoNumber){
                System.out.println("Player 2 won the Game");

            }
        }

    }




