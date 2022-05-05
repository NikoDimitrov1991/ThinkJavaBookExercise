package Chapter8;

public class ArraysExercise1 {

//    The goal of this exercise is to practice encapsulation with some
//    of the examples in this chapter.
//              1. Starting with the code in Section 8.6, write a method called powArray
//              that takes a double array, a, and returns a new array that contains the
//              elements of a squared. Generalize it to take a second argument and raise
//              the elements of a to the given power.
//              2. Starting with the code in Section 8.10, write a method called histogram
//    that takes an int array of scores from 0 to (but not including) 100, and
//    returns a histogram of 100 counters. Generalize it to take the number of
//    counters as an argument.

    public static double[] powArray(double[] array, double power) {
        double[] accumulator = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            accumulator[i] = Math.pow(array[i], power);
        }
        return accumulator;
    }

    public static int[] histogram(int[] array, int count) {
        int[] counter = new int[count];
        for (int element : array) {
            counter[element]++;
        }
        return counter;
    }

}


