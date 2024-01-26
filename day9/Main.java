import java.util.Random;
import java.util.Scanner;

class GuessGame {
    private int targetNumber;
    private boolean isGameWon;

    public GuessGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        isGameWon = false;
    }

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess Number Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (!isGameWon) {
            int userGuess = scanner.nextInt();
            if (checkGuess(userGuess)) {
                System.out.println("Congratulations! You guessed the correct number.");
                isGameWon = true;
            } else {
                System.out.println("Try again. Guess a number:");
            }
        }

        scanner.close();
    }

    private boolean checkGuess(int guess) {
        if (guess == targetNumber) {
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Too low! Try a higher number.");
        } else {
            System.out.println("Too high! Try a lower number.");
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        GuessGame guessGame = new GuessGame();
        guessGame.playGame();
    }
}
