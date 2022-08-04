public class UmpirePlayer {

    int guessNumFromGuesser;
    int guessNumFromPlayer1;
    int guessNumFromPlayer2;
    int guessNumFromPlayer3;

    FinaleGame finalGame=new FinaleGame();

    public void guessNumberFromGuesser(){
        GuesserPlayer guesserPlayer=new GuesserPlayer();
        guesserPlayer.guessingNumber();
        guessNumFromGuesser= guesserPlayer.numberGuess();

    }


    public void guessNumberFromPlayers(){
       Player1 player1=new Player1();
       Player2 player2=new Player2();
       Player3 player3=new Player3();

       player1.guessPlayerNumberOne();
       player2.guessPlayerNumberTwo();
       player3.guessPlayerNumberThree();


       guessNumFromPlayer1=player1.numberOne();
       guessNumFromPlayer2=player2.numberTwo();
       guessNumFromPlayer3=player3.numberThree();

    }

    public void compare(){

        if(guessNumFromGuesser==guessNumFromPlayer1) {
            if (guessNumFromGuesser == guessNumFromPlayer2 && guessNumFromGuesser == guessNumFromPlayer3) {
                System.out.println("All three players won the game and tied, so replay the game");
            } else if (guessNumFromGuesser == guessNumFromPlayer2) {
                System.out.println("Player 1 and Player 2 won the game");
                finalGame.guesserNumber();
                finalGame.playerNumberOne();
                finalGame.playerNumberTwo();
                finalGame.compare();;

            } else if (guessNumFromGuesser == guessNumFromPlayer3) {
                System.out.println("Player 1 and Player 3 won the game");
                finalGame.guesserNumber();
                finalGame.playerNumberOne();
                finalGame.playerNumberTwo();
                finalGame.compare();;

            } else {
                System.out.println("Player 1 Won the game");
            }
        }
        else if (guessNumFromGuesser==guessNumFromPlayer2){
            if (guessNumFromGuesser==guessNumFromPlayer3){
                System.out.println("Player 2 and Player 3 won the game");
                finalGame.guesserNumber();
                finalGame.playerNumberOne();
                finalGame.playerNumberTwo();
                finalGame.compare();

            }
            else
                System.out.println("Player 2 won the game");
        }

        else if(guessNumFromGuesser==guessNumFromPlayer3){
            System.out.println("Player 3 won the game");
        }

        else {
            System.out.println("No player won Retry!!!");
        }
    }



}
