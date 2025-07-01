public class Main {
    public static void main(String[] args) {
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(2000));
    }
}

class LeapYear {
    // write code here
    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) {
            return false;
        }
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}