import java.util.Scanner;

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
        } else {
            return 0;
        }

    }
}