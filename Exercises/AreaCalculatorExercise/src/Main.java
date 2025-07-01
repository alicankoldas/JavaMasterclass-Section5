public class Main {
    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0));
        System.out.println(AreaCalculator.area(-1));
        System.out.println(AreaCalculator.area(5.0, 4.0));
        System.out.println(AreaCalculator.area(-1.0, 4.0));
    }
}

class AreaCalculator {
    // write code here
    public static double area(double radius) {
        if(radius < 0){
            return -1;
        }
        return Math.PI * radius * radius;
    }

    public static double area(double x, double y) {
        if(x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }
}