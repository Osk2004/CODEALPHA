import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store the grades
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter the number of students:");
        int numberOfStudents = scanner.nextInt();

        // Input the grades from the user
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter grade for student " + (i + 1) + ":");
            int grade = scanner.nextInt();
            grades.add(grade);
        }

        // Compute the average, highest, and lowest scores
        if (grades.size() > 0) {
            double average = calculateAverage(grades);
            int highest = findHighest(grades);
            int lowest = findLowest(grades);

            // Print the results
            System.out.println("Average grade: " + average);
            System.out.println("Highest grade: " + highest);
            System.out.println("Lowest grade: " + lowest);
        } else {
            System.out.println("No grades entered.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the average of the grades
    private static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    // Method to find the highest grade
    private static int findHighest(ArrayList<Integer> grades) {
        int highest = grades.get(0);
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    private static int findLowest(ArrayList<Integer> grades) {
        int lowest = grades.get(0);
        for (int grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
