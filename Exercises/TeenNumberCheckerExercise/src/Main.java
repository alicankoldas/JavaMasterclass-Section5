public class Main {
    public static void main(String[] args) {
        System.out.println(TeenNumberChecker.hasTeen(9, 99, 19));
        System.out.println(TeenNumberChecker.hasTeen(23, 15, 42));
        System.out.println(TeenNumberChecker.hasTeen(22, 23, 34));

        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));
    }
}

class TeenNumberChecker {
    // write code here
    public static boolean hasTeen(int paramOne, int paramTwo, int paramThree) {
        if(paramOne >= 13 && paramOne <= 19){
            return true;
        }
        if(paramTwo >= 13 && paramTwo <= 19){
            return true;
        }
        if(paramThree >= 13 && paramThree <= 19){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int param) {
        return (param >= 13 && param <= 19);
    }
}