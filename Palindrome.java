/*
 * Program that promts the user for a sentence, aword or a numbers and
 * checks if it is a palindrome.
 * Beyond the Textbook Question 1
 */
package lab4;
import java.util.*;
/**
 *
 * @author maria
 */
public class Palindrome {
    
    public static void main(String[] args) {
        System.out.println("\n**** PALINDROME READER ****");
        //Variables
        String backwards = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a word or a sentence: ");
        String sentence = sc.nextLine();
        //Removing the the spaces, apostrophes and commas
        sentence = sentence.replaceAll("\\W", "").toLowerCase();
        //System.out.println("" + sentence);
        
        //Making i equal to the length and getting it backwards
        for (int i=sentence.length()-1; i>=0; i--) {
            backwards += sentence.charAt(i);
            //System.out.println("" + backwards);
        }
        if (backwards.equals(sentence)) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}