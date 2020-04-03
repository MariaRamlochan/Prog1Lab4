/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;
/**
 * Program that uses for loop to output the product of all integers from 3 to 7.
 * Textbook Question 47.
 *
 * @author Maria Ramlochan
 */
public class ForLoopProduct {
	/**
	* This is my main method.
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // Variables
        int prod = 1;
        for (int counter = 3; counter <= 7; counter++) {
            prod *= counter;
            System.out.println("The product of each integer from three to"
                    + " seven:" + prod);
        }
        System.out.println("Final answer of 3*4*5*6*7: " + prod);
    } 
}