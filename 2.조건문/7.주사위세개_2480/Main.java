import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result = dice(sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println(result);
        sc.close();
    }

    public static int dice(int a, int b, int c) {
        int result;
        
        if (a == b && b == c && a == c) {
            result = 10000 + (a * 1000);

            return result;
        } 

        if ((a == b && b != c) || (b == c && c != a) || ( c == a && a != b)) {
            if (a == b) {
                result = 1000 + (a * 100);

                return result;
            }
            if (b == c) {
                result = 1000 + (b * 100);

                return result;
            }
            if (c == a) {
                result = 1000 + (c * 100);

                return result;
            }
        }
        
        if (a != b && b != c && c != a) {
            int max = Math.max(a, b);
            max = Math.max(max, c);
            result = max * 100;

            return result;
        }
        return 0;
    }
}