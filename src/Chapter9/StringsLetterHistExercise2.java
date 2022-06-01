package Chapter9;

public class StringsLetterHistExercise2 {

//    Write a method called letterHist that takes a string as a
//    parameter and returns a histogram of the letters in the string. The zeroth
//    element of the histogram should contain the number of a's in the string (upper-
//    and lowercase); the 25th element should contain the number of z's. Your
//    solution should only traverse the string once.

    public static int[] letterHist(String str) {
        char[] characters = str.toUpperCase().toCharArray();
        int[] result = new int[27];
        for (char letter : characters) {
            if (letter >= 65 && letter <= 90) {
                result[letter - 65] += 1;
            } else if (letter != 32) {
                result[27] += 1;
            }
        }
        return result;
    }
}

