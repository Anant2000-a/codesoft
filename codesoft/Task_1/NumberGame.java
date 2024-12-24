import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1, upperBound = 100, attempts = 5;
        int randomNumber = lowerBound + (int)(Math.random() * (upperBound - lowerBound + 1));
        int guess;

        System.out.println("Guess the number between " + lowerBound + " and " + upperBound);
        System.out.println("You have " + attempts + " attempts.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            if (i == attempts - 1) {
                System.out.println("Sorry, you've used all attempts. The number was " + randomNumber);
            }
        }
        scanner.close();
    }
}
