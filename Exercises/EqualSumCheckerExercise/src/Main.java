public class Main {
    public static void main(String[] args) {
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println(EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println(EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}

class EqualSumChecker {
    // write code here

    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam) {
        return (firstParam + secondParam) == thirdParam;
    }
}