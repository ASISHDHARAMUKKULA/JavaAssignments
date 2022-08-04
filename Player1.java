import java.util.Scanner;

public class Player1 {

    int guessPlayerNum1;


    void  guessPlayerNumberOne() {
        boolean flag = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player 1 please guess the number between 1 to 10");
            guessPlayerNum1 = scanner.nextInt();
            if(guessPlayerNum1 >=1 && guessPlayerNum1 <=10){
                System.out.println(" Player 1 entered correct number");
                flag=false;
                numberOne();
            }
            else {
                System.out.println(" Player 1 entered invalid number");
            }

        }while (flag);
    }




    int numberOne(){
        return guessPlayerNum1;
    }
}
