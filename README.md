
## Number Guessing Game 🎯

This is a simple Java-based console game where the player has to guess a randomly generated number between 1 and 100 within a limited number of trials.

---

### How to Play
1. The program will randomly generate a number between **1** and **100**.
2. You have **10 attempts** to guess the correct number.
3. After each guess, the program will provide feedback:
   - **Too low**: The guessed number is smaller than the target.
   - **Too high**: The guessed number is larger than the target.
4. If you guess the number within the allowed attempts, you'll win! 🎉
5. If you exhaust all attempts, the correct number will be revealed. 😔

---

### Code Overview

- **Random Number Generation**:
  A random number between 1 and 100 is generated using the formula:

  ```java
  int n = 1 + (int) (100 * Math.random());
  ```

- **User Input**:
  The program takes guesses from the user using a `Scanner` object:

  ```java
  Scanner sc = new Scanner(System.in);
  int guess = sc.nextInt();
  ```

- **Game Logic**:
  The game provides feedback (`Too high`, `Too low`, or `Congratulations!`) based on the guessed number.
  
---

### Sample Output

```
****************************************************************
    || Welcome to the Ultimate Number Guessing Challenge ||     
****************************************************************
I've chosen a number between 1 and 100. 
Can you guess it in just 10 attempts?

Guess the number: 50
Too high! Try again.

Guess the number: 25
Too low! Try again.

Guess the number: 38

****************************************************************
                        Congratulations!
****************************************************************
Bravo! You found the number in just 3 attempts. Well played!
****************************************************************
```

### Features

- **Randomized Gameplay**: Each game generates a new random number.
- **Feedback System**: Guides the user with hints (`Too high` or `Too low`).
- **Victory Check**: Informs the user if they win or lose after exhausting attempts.

---

Feel free to contribute to this project by submitting pull requests or reporting issues! 🚀  
