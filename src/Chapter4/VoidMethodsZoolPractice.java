package Chapter4;

public class VoidMethodsZoolPractice {

//    The point of this exercise is to practice reading code and to
//    make sure that you understand the
//    ow of execution through a program with
//    multiple methods.
//            1. What is the output of the following program? Be precise about where
//    there are spaces and where there are newlines.
//    Hint: Start by describing in words what ping and baffle do when they
//    are invoked.
//            2. Draw a stack diagram that shows the state of the program the First time
//    ping is invoked.
//3. What happens if you invoke baffle(); at the end of the ping method?

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}