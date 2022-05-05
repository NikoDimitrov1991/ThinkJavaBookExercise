package Chapter3;

import java.util.Scanner;

public class InputAndOutputConvertTemp {

//    Write a program that converts a temperature from Celsius to
//    Fahrenheit. It should (1) prompt the user for input, (2) read a double value
//    from the keyboard, (3) calculate the result, and (4) format the output to one
//    decimal place. For example, it should display "24.0 C = 75.2 F".

    public static void main(String[] args) {
        double celsius;
        double farenheight;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please add temperature at Celsius C:");
        celsius = sc.nextDouble();
        System.out.println("The temperature if F is: ");
        farenheight = celsius * 9 / 5 + 32;
        System.out.println(farenheight);
    }
}
