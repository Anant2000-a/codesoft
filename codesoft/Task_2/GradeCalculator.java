package Task_2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of subjects
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();

        // Initialize variables
        int[] marks = new int[subjects];
        int total = 0;

        // Input: Marks for each subject
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }

        // Calculate total marks, average percentage, and grade
        double average = (double) total / subjects;
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");

        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "F";
        }

        // Output: Display results
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}

    
}
