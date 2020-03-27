/*
 * Program that promts the users for any number of 10 grades from 0 to 100.
 * Ouputs the minimum, maximum and average grade.
 * Textboob Question 61.
 */
package lab4;
import java.util.*;
/**
 *
 * @author maria
 */
public class ExamGrades {
    
    public static void main(String[] args) {
        System.out.println("\n**** GRADE CALCULATOR ****");
        //Variables
        int grade, sum=0, min=100, max=0;
        double avg;
        Scanner sc = new Scanner(System.in);
        
        //Initiating a variable i 
        for (int i=0; i<10; i++) {
            System.out.printf("Enter grade number %d: ", i + 1);
            grade = sc.nextInt();
            /*For testing puposes: 65, 66, 67, 68, 69, 70, 71, 72, 73, 80*/
            
            if (grade > 0 && grade < 100) {
                //Getting the minimum, maximum and average grade
                if (grade < min) {
                min = grade;
                } 
                if (grade > max) {
                max = grade; 
                } 
                for (int j=0; j<1; j++) {
                sum += grade; 
                    System.out.println("the sum is: " + sum);
                }
            } else {
                System.out.println("You have entered a value less than 0 or"
                        + " greather than 100");
            }
            
        } 
        avg = (sum/10);
        System.out.println("");
        System.out.println("The lowest grade is: " + min);
        System.out.println("The highest grade is: " + max);
        System.out.println("The average grade is: " + avg);
    }
}