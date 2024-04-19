import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("Number Guessing Game!");
        boolean guessed = false;
        int attempts = 0;
        while (!guessed) {
            System.out.print("Enter your guess (between " + minRange + " and " + maxRange + "): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) {
                guessed = true;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println("Congratulations! You've guessed the correct number " + targetNumber + " in " + attempts + " attempts.");
        scanner.close();
    }
}
