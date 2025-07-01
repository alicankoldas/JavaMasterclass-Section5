
public class Main {
    public static void main(String[] args) {
        PositiveNegativeZero.checkNumber(-1);
        PositiveNegativeZero.checkNumber(0);
        PositiveNegativeZero.checkNumber(1);
    }
}

class PositiveNegativeZero {
    // write code here
    public static void checkNumber(int number) {
        String value = "zero";
        if(number > 0) {
            value = "positive";
        } else if(number < 0) {
            value = "negative";
        }
        System.out.println(value);
    }
}