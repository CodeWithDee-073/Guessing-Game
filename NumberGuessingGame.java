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

// // Java program for the above approach
// import java.util.Scanner;

// public class GFG {

// // Function that implements the
// // number guessing game
// public static void guessingNumberGame() {
// // Scanner Class
// Scanner sc = new Scanner(System.in);

// // Generate the numbers
// int number = 1 + (int) (100
// * Math.random());

// // Given K trials
// int K = 5;

// int i, guess;

// System.out.println(
// "A number is chosen"
// + " between 1 to 100."
// + "Guess the number"
// + " within 5 trials.");

// // Iterate over K Trials
// for (i = 0; i < K; i++) {

// System.out.println(
// "Guess the number:");

// // Take input for guessing
// guess = sc.nextInt();

// // If the number is guessed
// if (number == guess) {
// System.out.println(
// "Congratulations!"
// + " You guessed the number.");
// break;
// } else if (number > guess
// && i != K - 1) {
// System.out.println(
// "The number is "
// + "greater than " + guess);
// } else if (number < guess
// && i != K - 1) {
// System.out.println(
// "The number is"
// + " less than " + guess);
// }
// }

// if (i == K) {
// System.out.println(
// "You have exhausted"
// + " K trials.");

// System.out.println(
// "The number was " + number);
// }
// }

// // Driver Code
// public static void main(String arg[]) {

// // Function Call
// guessingNumberGame();
// }
// }
