package MyJavaProjects;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Random rd = new Random();
        int score = 0;
        int rounds = 0;
        while (true){
            int numToGuess = rd.nextInt(100) +1;
            int numOftry = 0;
            int maxTries = 10;
            while (true){
                System.out.println("Guess a number between 1 to 100 that i have choosen:-->> ");
                int guess = sc.nextInt();
                numOftry++;
                if (guess == numToGuess){
                    System.out.println("Congrats you got the number ");
                    score ++ ;
                    break;
                } else if (guess<numToGuess) {
                    System.out.println("Your guessed number  is too less try another one ");

                } else if (guess>numToGuess) {
                    System.out.println("Your guessed number is too high Try new number ");
                }
                if (numOftry == maxTries){
                    System.out.println("You lossed The number was " +numToGuess);
                    break;
                }
            }
            rounds++ ;
            System.out.println("Do you want to play again? (yes / no )");
            String PlayAgain = sc.next();
            if (!PlayAgain.equals("yes")){
                break;
            }
        }
        System.out.println("Your Score is " +score+ " out of " + rounds);
    }

}
