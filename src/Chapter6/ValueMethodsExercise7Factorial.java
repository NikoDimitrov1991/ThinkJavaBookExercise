package Chapter6;

public class ValueMethodsExercise7Factorial {

//    Write a recursive method named oddSum that takes a positive
//    odd integer n and returns the sum of odd integers from 1 to n. Start with
//    a base case, and use temporary variables to debug your solution. You might
//    nd it helpful to print the value of n each time oddSum is invoked.

    /**
     * @param n positive odd integer
     * @return sum of odd integers form 1 to n
     */

    public static int oddSum(int n) {
        return ((n == 1) ? (1) : (n * oddSum(n - 2)));
    }

}
