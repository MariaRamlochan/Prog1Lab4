/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
import java.util.*;
/**
 * Program that prompts the user for an ID and verify if the user has enter
 * exacly 2 digits in their ID. Output if the ID is valid or not.
 * Textbook Question 63.
 *
 * @author Maria Ramlochan
 */
public class IdReader {
    /**
	* This is my main method.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        System.out.println("\n**** ID READER ****");
        //Variables
        int a=0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your ID with exacly 2 digits within: ");
        String id = sc.nextLine();
        //For testing purposes: maria19, maria10101
        
        for (int i=0; i<id.length(); i++) {
            /*Using the Character class to call isDigit() method to get the 
            number of digits in char*/
            boolean idReader = Character.isDigit(id.charAt(i));
            //System.out.println("Char at " + i + " index at " + idReader);
            if (idReader) {
                a += 1;
            }
        }

        if (a==2) {
            System.out.println("This ID is VALID");
        } else {
            System.out.println("This is NOT a VALID ID");
        }
    }
    
}
