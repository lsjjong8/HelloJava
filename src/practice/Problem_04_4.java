package practice;

public class Problem_04_4 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                // 4x + 5y = 60
                if(4 * x + 5* y == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}