import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_length = sc.nextInt();
        int result = 0;

        for (int i = 0; i < number_length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            result = plus(a,b);
            System.out.println("Case #"+(i+1)+": "+ a + " + " + b + " = " + result);
        }

        sc.close();
        
    }
    public static int plus(int a, int b) {
        int c = a + b;

        return c;
    }
}

//Case #1: 1 + 1 = 2