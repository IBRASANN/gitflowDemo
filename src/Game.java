import java.util.Scanner;

public class Game {
    private int secretNumber;
    private int maxAttempts;
    private int attempts;
    private Scanner scanner;

    public Game(int maxAttempts) {
        this.maxAttempts = maxAttempts;
        this.attempts = 0;
        this.scanner = new Scanner(System.in);
        secretNumber = (int) (Math.random() * 100) + 1; // Generate random number between 1 and 100
    }

    public void play() {
        System.out.println("I've selected a random number between 1 and 100.");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low!");
            } else if (guess > secretNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed it in " + attempts + " attempts.");
                return;
            }
        }

        System.out.println("Sorry, you ran out of attempts. The secret number was: " + secretNumber);
    }


}
