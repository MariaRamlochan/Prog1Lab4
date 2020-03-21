/*
 * Program that uses a for loop to output the sum of all integers from 10 to 20.
 * Textbook Question 46.
 */
package lab4;
/**
 *
 * @author maria
 */
public class forLoopSum {

    /**
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