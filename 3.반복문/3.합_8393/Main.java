import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int value = sc.nextInt();
        int result = 0;

        for (int i = 0; i <= value; i++) {
            result += i;
        }

        System.out.println(result);

        sc.close();
    }
}
