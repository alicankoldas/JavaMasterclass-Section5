public class Main {
    public static void main(String[] args) {
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
        System.out.println(PlayingCat.isCatPlaying(false, 35));
    }
}

class PlayingCat {
    // write code here
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(temperature >= 25){
            return summer ? temperature <= 45 : temperature <= 35;
        }
        return false;
    }
}