import java.util.Scanner;

public class Player2 {

    int guessPlayerNum2;


    void guessPlayerNumberTwo(){
        boolean flag = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player 2 please guess the number between 1 to 10");
            guessPlayerNum2 = scanner.nextInt();
            if(guessPlayerNum2 >=1 && guessPlayerNum2 <=10){
                System.out.println(" Player 2 entered correct number");
                flag=false;
                numberTwo();
            }
            else {
                System.out.println(" Player 2 entered invalid number");
            }

        }while (flag);
    }

    int numberTwo(){
        return guessPlayerNum2;
    }
}
