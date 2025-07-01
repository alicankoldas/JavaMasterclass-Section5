public class Main {
    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
}

class MinutesToYearsDaysCalculator {
    // write code here
    public static void printYearsAndDays(long minutes){
        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long day = minutes / (24 * 60);
        long year = 0;
        if(day > 0){
            year = day / 365;
            day = day % 365;
        }
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}