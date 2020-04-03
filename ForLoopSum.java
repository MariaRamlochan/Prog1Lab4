/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
/**
 * Program that uses a for loop to output the sum of all integers from 10 to 20.
 * Textbook Question 46.
 *
 * @author Maria Ramlochan
 */
public class ForLoopSum {
    /**
	* This is my main method.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // Variables
        int sum = 0, num = 20;
        
        for (int counter=10; counter<= num; counter++) {
            sum += counter;
            System.out.println("The sum of each integer from ten to twenty is: "
                      + sum);            
        }
         System.out.println("Final answer of 10+11+12+13...19+20: " + sum); 
    }
}