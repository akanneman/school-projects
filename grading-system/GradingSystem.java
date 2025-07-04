/**
 * Author: Adrian Kanneman, [Your Class Name]
 * Program: GradingSystem
 * Description: This program takes student scores and assigns letter grades.
 * It uses a loop to allow entering grades for multiple students.
 */

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String again;

        do {
            System.out.print("Enter the student's score: ");
            int score = keyboard.nextInt();
            keyboard.nextLine(); // Clear the newline

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

