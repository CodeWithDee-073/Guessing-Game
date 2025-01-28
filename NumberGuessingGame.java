import java.util.Scanner;

public class NumberGuessingGame {

  public static void GuessGame() {
    Scanner sc = new Scanner(System.in);

    int n = 1 + (int) (100 * Math.random()); // Generate a random number between 1 and 100
    int i, T = 10; // Number lops & trial

    System.out.println("\n-----------|| Welcome to the Ultimate Number Guessing Challenge||------------");
    System.out.println("I've chosen a number between 1 and 100. Can you guess it in just " + T + " attempts?");

    // Loop over K Trials
    for (i = 0; i < T; i++) {
      System.out.print("\nGuess the number: ");
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
    if (i == T) {
      System.out
          .println("\n\tGame Over! You ran out of " + T + " tries.\nThe number you were looking for was: " + n + "\n");

    }
    sc.close();
  }

  public static void main(String[] args) {
    GuessGame();
  }
}