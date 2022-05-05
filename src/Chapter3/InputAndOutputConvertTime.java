package Chapter3;

import java.util.Scanner;

public class InputAndOutputConvertTime {

//    Write a program that converts a total number of seconds to
//    hours, minutes, and seconds. It should (1) prompt the user for input, (2) read
//    an integer from the keyboard, (3) calculate the result, and (4) use printf to
//    display the output. For example, "5000 seconds = 1 hours, 23 minutes,
//    and 20 seconds".

    public static void main(String[] args) {
        int time;
        Scanner sc = new Scanner(System.in);
        System.out.println("Write seconds for converting:");
        time = sc.nextInt();
        int sec = time % 60;
        int hour = time / 60;
        int min = hour % 60;
        hour = hour / 60;
        System.out.println("The result is   " + hour + " hours " + min + " minutes  " + sec + " seconds");
    }
}
