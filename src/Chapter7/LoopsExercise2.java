package Chapter7;

public class LoopsExercise2 {

//    Let's say you are given a number, a, and you want to find
//    its square root. One way to do that is to start with a rough guess about the
//    answer, x0, and then improve the guess using this formula: x1 = (x0 + a=x0)=2
//    Write a method called squareRoot that takes a double and returns an ap-
//    proximation of the square root of the parameter, using this technique. You
//    should not use Math.sqrt.As your initial guess, you should use a=2. Your method should iterate until
//     it gets two consecutive estimates that differ by less than 0.0001. You can use Math.abs to calculate the absolute value of the difference.

    public static double sqRoot(double a) {
        double oldValue = a / 2;
        double newValue = a / 2;
        double interval = 0;
        do {
            oldValue = newValue;
            newValue = (oldValue + a / oldValue) / 2;
            interval = Math.abs(newValue - oldValue);
            System.out.println(interval);
        } while (interval > 0.001);
        return newValue;
    }

    public static void main(String[] args) {
        sqRoot(20);
        System.out.println(" ");
        sqRoot(10);
    }
}
