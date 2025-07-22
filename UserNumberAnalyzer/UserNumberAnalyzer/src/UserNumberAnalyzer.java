import java.util.ArrayList;
import java.util.Scanner;

public class UserNumberAnalyzer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        boolean keepGoing = true;

        while (keepGoing) {
            System.out.print("Please enter a number: ");
            int userNumber = userInput.nextInt();
            numbers.add(userNumber);
            System.out.print("Do you want to keep going? (y/n): ");
            keepGoing = userInput.next().equals("y");
        }

        System.out.println("You entered the following numbers:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        double average = (double) sum / numbers.size();
        System.out.println("The average of the numbers is: " + average);

        int min = numbers.get(0);
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
