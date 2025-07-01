public class Main {
    public static void main(String[] args) {
        System.out.println(DecimalComparator
                .areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DecimalComparator
                .areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator
                .areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DecimalComparator
                .areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}

class DecimalComparator {
    // write code here
    public static boolean areEqualByThreeDecimalPlaces(double firstValue, double secondValue){
        int firstConvertedValue = (int)(firstValue * 1000d);
        int secondConvertedValue = (int)(secondValue * 1000d);
        return firstConvertedValue == secondConvertedValue;
    }
}