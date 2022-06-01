package Chapter11;

public class ClassesDate {
    public static void main(String args[]){
        ClassesDate birthday = new ClassesDate();
        System.out.println(birthday.year+" "+birthday.month+" "+birthday.day);
    }
    public int year;
    public int month;
    public int day;
    public ClassesDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public ClassesDate(){
        this(2001,4,17);
    }
}

