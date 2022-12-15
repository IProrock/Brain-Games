package hexlet.code;

public class Utils {
    public static int getRandomNum(int min, int max) {
        return  (int) (Math.round(Math.random() * (max - min) + min));
    }
}
