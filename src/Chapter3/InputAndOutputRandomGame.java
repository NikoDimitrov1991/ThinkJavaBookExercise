package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class InputAndOutputRandomGame {

//    The goal of this exercise is to program "Guess My Number" game.

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int chosenNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please add a number from 1 to 100:");
        chosenNumber = sc.nextInt();
        if (chosenNumber >= 1 && chosenNumber <= 100) {
            System.out.println("Your guess is:");
            System.out.println(chosenNumber);
            System.out.println("My number is: " + randomNumber + ". You`re off by   " + (chosenNumber - randomNumber));
        } else {
            System.out.println("The number you added is out of the criteria!");
        }
    }
}