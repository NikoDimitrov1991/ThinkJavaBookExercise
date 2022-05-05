package Chapter7;

public class LoopsExercise3PowerUpdate {

//    In Exercise 6.9 we wrote a recursive version of power, which
//    takes a double x and an integer n and returns xn. Now write an iterative
//    method to perform the same calculation.

    public static double powerAlternative(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(powerAlternative(4, 2));
    }
}
