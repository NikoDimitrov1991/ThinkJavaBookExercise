package Chapter2;

public class VariablesV1 {

//    The point of this exercise is (1) to use string concatenation
//    to display values with different types (int and String), and (2) to practice
//    developing programs gradually by adding a few statements at a time.
//1. Create a new program named Date.java. Copy or type in something
//    like the hello world program and make sure you can compile and run it.
//            2. Following the example in Section 2.4, write a program that creates vari-
//    ables named day, date, month, and year. The variable day will contain
//    the day of the week (like Friday), and date will contain the day of the
//    month (like the 13th). What type is each variable? Assign values to
//    those variables that represent today's date.
//            3. Display (print out) the value of each variable on a line by itself. This is an
//    intermediate step that is useful for checking that everything is working
//    so far. Compile and run your program before moving on.
//            4. Modify the program so that it displays the date in standard American
//    format, for example: Thursday, July 16, 2015.
//            5. Modify the program so it also displays the date in European format. The
//    nal output should be:
//    American format:
//    Thursday, July 16, 2015
//    European format:
//    Thursday 16 July 2015

    public static void main(String[] args) {
        int day;
        String date;
        String month;
        int year;

        day = 13;
        date = "Friday";
        month = "July";
        year = 1993;

        System.out.println("American Standard:");
        System.out.println(date + ", " + month + " " + day + ", " + year);
        System.out.println(" ");
        System.out.println("European Standard:");
        System.out.println(date + " " + day + " " + month + " " + year);
    }
}
