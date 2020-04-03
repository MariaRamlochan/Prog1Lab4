/*
 * Program that generates a random number between 0 and 100 and asks the user
 * to guess it with a maximum of 10 trials.
 * Beyond the Textbook Question 3.
 */
package lab4;
import java.util.*;
/**
 *
 * @author maria
 */
public class GuessingGame {
    
    public static void main(String[] args) {
        System.out.println("\n**** THE GUESSING GAME ****");
        //Variables
        int guessNum, tries = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        //Generating a random number
        int randomNum = random.nextInt(100);
        //System.out.println(randomNum);
        System.out.println("Guess the random number from 1 to 100");
        guessNum = sc.nextInt(); //Initialed once... Loop will be 9 times
        
        //Guessed number isn't equal to random: repeat the loop 9(-1) times
        while (guessNum != randomNum && tries <= 8) {
            System.out.printf("Please try again: ");
            guessNum = sc.nextInt();
            tries++;
            
            if (guessNum == randomNum) {
                System.out.println("You have guessed the correct number! " +
                        randomNum);
            } else if (tries == 9) {
                System.out.println("Sorry your 10 tries are up, please restart "
                        + "to play again!");
            }
        }
    }
}