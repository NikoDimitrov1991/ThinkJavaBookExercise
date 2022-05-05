package Chapter8;

public class ArrayExcersise4 {

//    Write a method called indexOfMax that takes an array of
//    integers and returns the index of the largest element.

    public static int indexOfMax(int[] num) {
        int index = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > num[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfMaxForLoop(int[] numbers) {
        int index = 0;
        int i = 0;
        for (int number : numbers) {
            if (numbers[i] > numbers[index]) {
                index = i;
            }
            i++;
        }
        return index;
    }
}
