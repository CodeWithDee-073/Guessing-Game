import java.util.Scanner;

public class NumberGuessingGame {

  public static void GuessGame() {
    Scanner sc = new Scanner(System.in);

    int n = 1 + (int) (100 * Math.random()); // Generate a random number between 1 and 100
    int i, K = 10; // Number lops & trial

    System.out.println("\n------------------|| Welcome to the Number Guessing Game! ||------------------");
    System.out.println("I'm thinking of a number between 1 and 100. Can you guess it within " + K + " trials?");

    // Loop over K Trials
    for (i = 0; i < K; i++) {
      System.out.print("Guess the number: ");
      int guess = sc.nextInt();

      // Check the user's guess
      if (n == guess) {
        System.out.println("\nCongratulations! You guessed the number in " + (i + 1) + " tries.");
        break;
      } else if (n > guess) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
    // Check if it's the last trial
    if (i == K) {
      System.out.println("\nYou have exhausted all " + K + " trials.\nThe correct number was: " + n);
    }
    sc.close();
  }

  public static void main(String[] args) {
    GuessGame();
  }
}