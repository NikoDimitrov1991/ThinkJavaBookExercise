package Chapter5;

public class ConditionalStatements4 {

//    Fermat's Last Theorem says that there are no integers a, b,
//    and c such that an + bn = cn, except when n < 2.
//    Write a method named checkFermat that takes four integers as parameters {
//        a, b, c and n { and checks to see if Fermat's theorem holds. If n is greater
//            than 2 and an + bn = cn, the program should display "Holy smokes, Fermat
//            was wrong!" Otherwise, the program should display "No, that doesn't work."

    public static void checkFermat(int a, int b, int c, int n) {
        if ((n > 2) && (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))) {
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn’t work.");
        }
    }

    public static void main(String[] args) {
        checkFermat(1, 5, 6, 3);
    }
}
