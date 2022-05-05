package Chapter4;

public class VoidMethods1 {

//    The purpose of this exercise is to take code from a previous
//    exercise and encapsulate it in a method that takes parameters. You should
//    start with a working solution to Exercise 2.2.
//            1. Write a method called printAmerican that takes the day, date, month
//    and year as parameters and that displays them in American format.
//2. Test your method by invoking it from main and passing appropriate
//    arguments. The output should look something like this (except that the
//    date might be different):
//    Saturday, July 22, 2015
//            3. Once you have debugged printAmerican, write another method called
//    printEuropean that displays the date in European format.

    public static void printAmerican(int day, String date, String month, int year) {
        System.out.println(date + ", " + month + " " + day + ", " + year);
    }

    public static void printEuropean(int day, String date, String month, int year) {
        System.out.println(date + " " + day + " " + month + " " + year);
    }

    public static void main(String[] args) {
        printAmerican(4, "Monday", "July", 1991);
        System.out.println();
        printEuropean(2, "Tuesday", "July", 2022);
    }
}