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


}
