package Chapter8;

public class ArrayExcersise6 {

//    Write a method named areFactors that takes an integer n
//    and an array of integers, and that returns true if the numbers in the array
//    are all factors of n (which is to say that n is divisible by all of them).

    public static boolean areFactors(int n, int[] factors) {
        for (int factor : factors) {
            if (n % factor != 0)
                return false;
        }
        return true;
    }
}
