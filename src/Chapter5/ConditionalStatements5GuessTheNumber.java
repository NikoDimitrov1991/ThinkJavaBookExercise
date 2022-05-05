package Chapter5;

import java.util.Scanner;
import java.util.Random;

public class ConditionalStatements5GuessTheNumber {

//    Now that we have conditional statements, we can get back to
//    the \Guess My Number" game from Exercise 3.4.
//    You should already have a program that chooses a random number, prompts
//    the user to guess it, and displays the dierence between the guess and the
//    chosen number.
//    Adding a small amount of code at a time, and testing as you go, modify the
//    program so it tells the user whether the guess is too high or too low, and then
//    prompts the user for another guess.
//    The program should continue until the user gets it right.

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {

        Random random = new Random();
        int answer = random.nextInt(100) + 1;
        guess(answer);
    }

    private static void guess(int answer) {
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        int input = sc.nextInt();

        if (input == answer) {
            System.out.println(input + " is correct!");
        } else {
            System.out.println(input + " is too " + (input > answer ? "high" : "low"));
            System.out.println("Try again\n");
            guess(answer);
        }
    }
}
