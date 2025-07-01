public class Main {
    public static void main(String[] args) {

        System.out.println(SpeedConverter.toMilesPerHour(1.5));
        System.out.println(SpeedConverter.toMilesPerHour(10.25));
        System.out.println(SpeedConverter.toMilesPerHour(-5.6));
        System.out.println(SpeedConverter.toMilesPerHour(25.42));
        System.out.println(SpeedConverter.toMilesPerHour(75.114));

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}

class SpeedConverter {
    // write code here

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion (double kilometersPerHour) {
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long mileValue = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h = " + mileValue + " mi/h");
        }
    }
}