/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;
/**
 * Program that generates a random number between 0 and 100 and asks the user
 * to guess it with a maximum of 10 trials.
 * Beyond the Textbook Question 3.
 *
 * @author Maria Ramlochan
 */
public class GuessingGame {
    /**
    * This is my main method.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        System.out.println("\n**** THE GUESSING GAME ****");
        //Variables
        int guessNum = 0, a = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        //Generating a random number
        do {
            int tries = 0;
            int randomNum = random.nextInt(100)+ 1;
            //System.out.println(randomNum);
            System.out.println("\nGuess 10 random number from 1 to 100");
        
            //Guessed number isn't equal to random: repeat the loop
            while (guessNum != randomNum && tries <= 9) {
                System.out.printf("Enter a number: ");
                guessNum = sc.nextInt();
                tries++;

                 if (guessNum == randomNum) {
                    System.out.println("\nYou have guessed the correct number! " 
                            + randomNum);
                    System.out.println("\nWould you like to play again? Y/N");
                } else if (tries == 10) {
                    System.out.println("\nSorry your 10 tries are up!");
                    System.out.println("\nWould you like to play again? Y/N");
                }
            }
            
            String choice = sc.next().toLowerCase();
            if (choice.contains("y")) {
                a = 1;
            } else if (choice.contains("n")) {
                a = 0;
                System.out.println("\nThank you for playing! Goodbye!");
                }
        } while (a == 1); 
    }    
} 
