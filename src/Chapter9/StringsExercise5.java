package Chapter9;

public class StringsExercise5 {
//    A word is said to be "abecedarian" if the letters in the word
//    appear in alphabetical order. For example, the following are all six-letter
//    English abecedarian words:
//    abdest, acknow, acorsy, adempt, adipsy, agnosy, best, behint, be-
//    know, bijoux, biopsy, cestuy, chintz, de
//            ux, dehors, dehort, deinos,
//            diluvy, dimpsy
//    Write a method called isAbecedarian that takes a String and returns a
//    boolean indicating whether the word is abecedarian. Your method can be
//    iterative or recursive.

    public static boolean isAbecedarian(String str){
        String converted = str.toUpperCase();
        for (int i = 0;i<converted.length() - 1;i++){
            char c = converted.charAt(i);
            if (c >= 65 && c <= 90){
                if (c > converted.charAt(i+1)){
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}
