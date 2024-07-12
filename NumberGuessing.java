import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        boolean tryAgain = true;

        while (tryAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("Generated a number between 1 and 100. Try to guess it!");

            while (!correctGuess) {
                System.out.print("Enter your guess: ");
                int guess = s.nextInt();
                attempts++;

                if (guess < numberToGuess) {
                    System.out.println("Too low!");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high!");
                } else {
                    System.out.println(
                            "Congrats! You've guessed the correct number in " + attempts + " attempts!");
                    correctGuess = true;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            tryAgain = s.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
        s.close();
    }
}
