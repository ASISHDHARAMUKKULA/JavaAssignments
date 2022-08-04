import java.util.Scanner;

public class Player3 {

    int guessPlayerNum3;


    void guessPlayerNumberThree() {

        boolean flag = true;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player 3 please guess the number between 1 to 10");
            guessPlayerNum3 = scanner.nextInt();
            if(guessPlayerNum3 >=1 && guessPlayerNum3 <=10){
                System.out.println(" Player 3 entered correct number");
                flag=false;
                numberThree();
            }
            else {
                System.out.println(" Player 3 entered invalid number");
            }

        }while (flag);



    }

    int numberThree(){
        return guessPlayerNum3;
    }
}
