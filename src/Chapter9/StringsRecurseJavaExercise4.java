package Chapter9;

public class StringsRecurseJavaExercise4 {
//    Create a program called Recurse.java and type in the fol-
//    lowing methods:
//    /**
//     * Returns the first character of the given String.
//     */
//    public static char first(String s) {
//        return s.charAt(0);
//    }
//    /**
//     * Returns all but the first letter of the given String.
//     */
//    public static String rest(String s) {
//        return s.substring(1);
//    }
    /**
     * Returns all but the first and last letter of the String.
     */
//    public static String middle(String s) {
//        return s.substring(1, s.length() - 1);
//    }
//    /**
//     * Returns the length of the given String.
//     */
//    public static int length(String s) {
//        return s.length();
//    }
//1. Write some code in main that tests each of these methods. Make sure
//    they work, and you understand what they do.
//            2. Using these methods, and without using any other String methods,
//    write a method called printString that takes a string as a parameter
//    and that displays the letters of the string, one on each line. It should be
//    a void method.
//            3. Again using only these methods, write a method called printBackward
//    that does the same thing as printString but that displays the string
//    backward (again, one character per line).
//            4. Now write a method called reverseString that takes a string as a pa-
//    rameter and that returns a new string as a return value. The new string
//    should contain the same letters as the parameter, but in reverse order.
//            String backwards = reverseString("coffee");
//System.out.println(backwards);
//    The output of this example code should be:
//    eeffoc
//5. A palindrome is a word that reads the same both forward and backward,
//    like \otto" and \palindromeemordnilap". Here's one way to test whether
//    a string is a palindrome:
//    A single letter is a palindrome, a two-letter word is a palin-
//    drome if the letters are the same, and any other word is a
//    palindrome if the rst letter is the same as the last and the
//    middle is a palindrome.
//    Write a recursive method named isPalindrome that takes a String and
//    returns a boolean indicating whether the word is a palindrome.


        public static void main(String args[]) {
            System.out.println(isPalindrome("otto"));
        }

        public static void printString(String str){
            if (length(str) != 0){
                System.out.println(first(str));
                printString(rest(str));
            }
        }

        public static void printBackward(String str){
            if (length(str) != 0){
                printBackward(rest(str));
                System.out.println(first(str));
            }
        }

        public static String reverseString(String str){
            if (length(str) != 0){
                return reverseString(rest(str)) + first(str);
            }
            return "";
        }

        public static boolean isPalindrome(String str){
            int length = length(str);
            if (length == 1){
                return true;
            }
            else if (length == 2){
                return first(str) == first(rest(str));
            }
            else {
                return first(str) == first(reverseString(rest(str))) && isPalindrome(middle(str));
            }
        }
        public static char first(String s){
            return s.charAt(0);
        }

        public static String rest(String s) {
            return s.substring(1);
        }


        public static String middle(String s) {
            return s.substring(1, s.length() - 1);
        }


        public static int length(String s) {
            return s.length();
        }
    }

