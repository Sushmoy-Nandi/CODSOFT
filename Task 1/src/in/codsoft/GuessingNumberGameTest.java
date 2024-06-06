package in.codsoft;

import java.util.Scanner;

public class GuessingNumberGameTest extends GuessingNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalRounds = 0;
        int totalWins = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            totalRounds++;
            int targetNumber = 91;
            int attempted = 0;
            boolean roundWin = false;

            System.out.println("Round " + totalRounds + ": Guess the number between " + start + " and " + end);

            while (attempted < attempMax) {
                attempted++;
                System.out.print("Attempt " + attempted + ": Enter your guess: ");
                int userGuess = input.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    totalWins++;
                    roundWin = true;
                    break;
                }
                else if (userGuess < targetNumber) {
                    System.out.println("Your guess is too low.");
                }
                else {
                    System.out.println("Your guess is too high.");
                }
            }

            if (!roundWin) {
                System.out.println("Sorry, you've used all attempts. The number was: " + targetNumber);
            }

            System.out.print("Do you want to play another round? (yes/no): ");
            playAgain = input.next().equalsIgnoreCase("yes");

        }

        System.out.println("Game Over!");
        System.out.println("Total Rounds Played: " + totalRounds);
        System.out.println("Total Rounds Won: " + totalWins);
        System.out.println("Thank you for playing!");

    }
}
