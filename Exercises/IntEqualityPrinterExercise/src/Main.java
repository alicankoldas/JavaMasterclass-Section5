public class Main {
    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1, 1,1);
        IntEqualityPrinter.printEqual(1, 1,2);
        IntEqualityPrinter.printEqual(-1, -1,-1);
        IntEqualityPrinter.printEqual(1, 2,3);
    }
}

class IntEqualityPrinter {
    // write code here
    public static void printEqual(int x, int y, int z){
        if(x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
        } else if(x == y && y == z){
            System.out.println("All numbers are equal");
        } else if(x != y && x != z && y != z){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}