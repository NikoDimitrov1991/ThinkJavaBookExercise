package Chapter5;

public class ConditionalStatements3 {

//    Draw a stack diagram that shows the state of the program in
//    Section 5.8 after main invokes nLines with the parameter n == 4, just before
//    the last invocation of nLines returns.

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }
}