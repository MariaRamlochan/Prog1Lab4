/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;
/**
 * Program the prompts the user for their email address and check if it 
 * is a valid email or not.
 * Beyond the Textbook Question 2.
 *
 * @author Maria Ramlochan
 */
public class ValidEmailAddress {
    /**
	* This is my main method.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        System.out.println("\n**** EMAIL VALIDATOR 2 ****");
         //Variables
        int a=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your email address: ");
        String email = sc.nextLine();
        email = email + " ";
        /*For testing purposes: araujot@vanier.college/ 
        araujot@vaniercollege.qc.ca/araujot&vanier.college/ araujot@vanier. */

        for (int i=0; i<email.length(); i++) {
            //Checking each character from the input
            char e = email.charAt(i);
            //System.out.println("Char at " + i);
            if (e == '@' || e == '.') {
            	if (Character.isLetter(email.charAt(i+1))) {
                	a += 1;
                } else if (email.charAt(i+1) == '@' || email.charAt(i+1)== '.'
                        || email.charAt(i+1)==' ') {
                	a = 1;
                } 
            }
        }
        if (a > 1) {
        	System.out.println("This is a valid email");
        } else {
        	System.out.println("This is NOT a valid email");
        }
    }
}