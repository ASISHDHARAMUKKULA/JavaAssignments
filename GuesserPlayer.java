import java.util.Scanner;

public class GuesserPlayer {

    int guessNum;

    public void guessingNumber(){
        boolean flag = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Guesser please guess the number between 1 to 10");
            guessNum = scanner.nextInt();
            if(guessNum >=1 && guessNum <=10){
                System.out.println(" Guesser entered correct number");
                flag=false;
                numberGuess();
            }
            else {
                System.out.println(" Guesser entered invalid number");
            }

        }while (flag);

    }

    int numberGuess(){
        return guessNum;
    }
}
