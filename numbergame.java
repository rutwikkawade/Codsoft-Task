import java.util.Random;
import java.util.Scanner;

public class numbergame {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int maxAttempts = 10;

        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess the number between " + minRange + " and " + maxRange);

        boolean playAgain = true;

        while (playAgain) 
        {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int attempts = 0;
            boolean guessedCorrectly = false;

            while (attempts < maxAttempts && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                sc.nextLine(); 

                if (userGuess < minRange || userGuess > maxRange) 
                {
                    System.out.println("Please enter a valid guess within the specified range.");
                } 
                else 
                {
                    attempts++;

                    if (userGuess == targetNumber) 
                    {
                        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                        guessedCorrectly = true;
                        score++;
                    } else if (userGuess < targetNumber) 
                    {
                        System.out.println("Too low. Try again.");
                    } else 
                    {
                        System.out.println("Too high. Try again.");
                    }
                }
            }

            if (!guessedCorrectly) 
            {
                System.out.println("Sorry! You've reached the maximum number of attempts. The correct number was " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = sc.nextLine().toLowerCase();

            if (!playAgainResponse.equals("yes"))
            {
                playAgain = false;
            }
        }

        System.out.println("Game Over. Your total score is: " + score);
        sc.close();
    }
}
