package Chapter6;

public class ValueMethodsExercise2 {

//    Write a method named isDivisible that takes two integers,n and m, and that returns true if n is divisible by m, and false otherwise.

    public static boolean isDividable(int n, int m) {
        if (m != 0 && n % m == 0) {
            System.out.println("The numbers are dividable");
            return true;
        } else
            System.out.println("The numbers are NOT dividable");
        return false;

    }
}

