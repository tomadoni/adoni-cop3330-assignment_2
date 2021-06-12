package ex32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int difficulty = 0;
        int randomNum = 0;
        int guess = 0;
        int guessNum = 0;
        String playAgain = "y";
        System.out.println("Let's play Guess the Number!");
        System.out.println("Enter the difficulty level (1, 2, or 3):");
        difficulty = kb.nextInt();
        if (difficulty == 1) {
            randomNum = (int) (Math.random() * 10) + 1;
        } else if (difficulty == 2) {
            randomNum = (int) (Math.random() * 100) + 1;
        } else {
            randomNum = (int) (Math.random() * 1000) + 1;
        }
        System.out.println("I have my number what's your guess?");
        while (playAgain.equals("y") || playAgain.equals("Y")) {
            while (guess != randomNum) {
                if (kb.hasNextInt()) {
                    guess = kb.nextInt();
                    if (guess < randomNum) {
                        System.out.println("Too low. Guess again:");
                        guessNum++;
                    } else if (guess > randomNum) {
                        System.out.println("Too high. Guess again:");
                        guessNum++;
                    }
                }
            }
            System.out.println("You got it in " + guessNum + " guesses!");
            System.out.println("Do you wish to play again? (Y or N)");
            playAgain = kb.nextLine();
        }
    }
}
