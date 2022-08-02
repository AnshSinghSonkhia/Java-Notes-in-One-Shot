import java.util.Scanner;

public class GuessTheRandomNumber {
    public static void MiniProject(){
        // Building a Mini Project
        /*
                     The User will guess a pre decided random number. Either he will guess it correctly, or could enter -1 one to stop the game.

         */

        Scanner sc3 = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);         // Since, random function generates a number between 0.01 to 0.99. therefore multiplied by 100
        int userNumber = 0;                              // initialising userNumber Variable

        do {
            System.out.println("Guess My Number: ");
            userNumber = sc3.nextInt();

            if(userNumber == myNumber) {
                System.out.println("WOOHOO  ..  CORRECT GUESS!!!");
                break;
            }
            else if(userNumber > myNumber) {
                System.out.println("your number is too large");
            }
            else {
                System.out.println("your number is too small");
            }
        } while(userNumber >= 0);

        System.out.print("My Number was:   ");
        System.out.println(myNumber);



    }
}
