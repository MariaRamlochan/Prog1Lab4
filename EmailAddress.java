/*
 * Program that prompts the user to enter an email address and checks for one @
 * sysbol and print out that it is valid.
 * Textbook Question 62.
 */
package lab4;
import java.util.*;

/**
 *
 * @author maria
 */
public class EmailAddress {
    
    public static void main(String[] args) {
        System.out.println("\n**** EMAIL VALIDATOR ****");
        //Variables
        int a=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();
        //For testing purposes: mariaramlochan@hotmail.com

        for (int i=0; i<email.length(); i++) {
            //Checking each character from the input
            char emailReader = email.charAt(i);
            //System.out.println("Char at " + i +" index at " + emailReader);
            if (emailReader == '@') {
                a += 1;
            } 
        }
        
        if (a==1) {
            System.out.println("This is a valid email");  
        } else {
                System.out.println("This is not a valid email");
        }
    }
}