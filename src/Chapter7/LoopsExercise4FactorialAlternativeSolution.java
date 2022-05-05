package Chapter7;

public class LoopsExercise4FactorialAlternativeSolution {

    // Section 6.7 presents a recursive method that computes the factorial function. Write an iterative version of factorial.

    public static int factorialAlternative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println((factorialAlternative(4)));
    }
}
