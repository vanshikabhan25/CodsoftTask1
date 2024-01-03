package CodsoftTask1;

import java.util.*;
import java.util.Random;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int MIN_RANGE = 1;
        int MAX_RANGE = 100;
        int Max_Chances = 10;
        int round = 1;
        int Result = 0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome To The Number Game!!!");

        while (true) {
            System.out.println("Round: " +round);
            int Guess_No = rand.nextInt(MAX_RANGE - MIN_RANGE + 1) + MIN_RANGE;
            int Chances = 0;

            System.out.println("I'm thinking Of Selecting a Number Between " + MIN_RANGE + " and " + MAX_RANGE + ".");

            while (Chances < Max_Chances) {
                System.out.print("Enter your guess number: ");
                int Guessed_No = sc.nextInt();
                Chances++;

                if (Guessed_No == Guess_No) {
                    System.out.println("Congratulations! Your guess is correct.");
                    Result += Max_Chances - Chances + 1;
                    break;
                } else if (Guessed_No < Guess_No) {
                    System.out.println("The Number Is Too low. Try To Guess The Number Again.");
                } else {
                    System.out.println("The Number Is Too high. Try To Guess The Number Again.");
                }
                if (Chances == Max_Chances){
                    System.out.println("You Have Reached The Maximum Number Of Chances. The Correct Number Was: " + Guess_No);
                }

            }
            System.out.println("Your Current Score Is: " + Result);

            System.out.print("Do you want to play another round? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Game Over. Thanks for playing! Your Final Score Is: " +Result);
                break;
            }
            round++;
        }

        sc.close();
    }

}
