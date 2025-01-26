import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
  public static void main(String[] args) {
    // Create an instance of Random for generating random numbers
    Random random = new Random();
    // Generate a random number between 1 and 100
    int targetNumber = random.nextInt(100) + 1;

    // Create a Scanner for user input
    Scanner scanner = new Scanner(System.in);

    int guess; // Variable to store the user's guess
    int attempts = 0; // Counter for the number of attempts
    boolean correctGuess = false;

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

    // Game loop
    while (!correctGuess) {
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();
      attempts++; // Increment the attempt counter

      // Check the user's guess
      if (guess == targetNumber) {
        correctGuess = true;
        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
      } else if (guess < targetNumber) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }

    // Close the scanner
    scanner.close();
  }
}