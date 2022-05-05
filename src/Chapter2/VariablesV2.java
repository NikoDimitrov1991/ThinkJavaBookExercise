package Chapter2;

public class VariablesV2 {

//    The point of this exercise is to (1) use some of the arithmetic
//    operators, and (2) start thinking about compound entities (like time of day)
//        that are represented with multiple values.
//        1. Create a new program called Time.java. From now on, we won't remind
//        you to start with a small, working program, but you should.
//        2. Following the example program in Section 2.4, create variables named
//        hour, minute, and second. Assign values that are roughly the current
//        time. Use a 24-hour clock so that at 2pm the value of hour is 14.
//        3. Make the program calculate and display the number of seconds since
//        midnight.
//        4. Calculate and display the number of seconds remaining in the day.
//        5. Calculate and display the percentage of the day that has passed. You
//        might run into problems when computing percentages with integers, so
//        consider using
//        oating-point.
//        6. Change the values of hour, minute, and second to re
//        ect the current
//        time. Then write code to compute the elapsed time since you started
//        working on this exercise.

    public static void main(String[] args) {
//

        int hour = 9;
        int minute = 41;
        int seconds = 39;
//Seconds since midnight
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 3600 + minute * 60 + seconds + " sec");
        //Remaining seconds of the day
        System.out.println("Remaining seconds of the day");
        System.out.println(86400 - (hour * 3600 + minute * 60 + seconds));

        // Percentage of the day remaining
        System.out.print("Percent of the day that has passed: ");
        System.out.println((hour * 3600 + minute * 60 + seconds) * 100 / 86400);

        int newHour = 10;
        int newMins = 36;
        int newSecs = 11;

        int timePassed = (newHour * 3600 + newMins * 60 + newSecs) - (hour * 3600 + minute * 60 + seconds);
        System.out.println("Elapsed time");
        System.out.println(timePassed + " seconds");
    }
}
