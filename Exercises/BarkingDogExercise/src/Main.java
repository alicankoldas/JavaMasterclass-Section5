public class Main {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));
    }
}

class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if((hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        }
        return false;
    }
}