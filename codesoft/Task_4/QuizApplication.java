package Task_4;

import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France? \n1. Berlin \n2. Paris \n3. Madrid \n4. Rome",
            "Which planet is known as the Red Planet? \n1. Earth \n2. Mars \n3. Venus \n4. Jupiter",
            "What is the largest ocean on Earth? \n1. Atlantic \n2. Indian \n3. Pacific \n4. Arctic"
        };

        int[] answers = {2, 2, 3};
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            long startTime = System.currentTimeMillis();
            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();
            long endTime = System.currentTimeMillis();

            if (endTime - startTime > 10000) {
                System.out.println("Time's up!");
                continue;
            }

            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect.");
            }
        }

        System.out.println("Final Score: " + score + "/" + questions.length);
        scanner.close();
    }
}

