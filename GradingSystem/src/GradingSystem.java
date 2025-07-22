/**
 * Author: Adrian Kanneman, CISC-190
 * Simple grading system – Chapter 4 assignment
 */
import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;
        do {
            System.out.print("Enter the student's score: ");
            int score = keyboard.nextInt();
            keyboard.nextLine();
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade: " + grade);
            System.out.print("Enter grades for another student? (yes/no): ");
            again = keyboard.nextLine().trim();
        } while (again.equalsIgnoreCase("yes"));
        keyboard.close();
    }
}
