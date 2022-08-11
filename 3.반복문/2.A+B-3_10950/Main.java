import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        int first,second;

        for (int i = 0; i < count; i++) {
            first = sc.nextInt();
            second = sc.nextInt();
            System.out.println(first + second);
        }
        
        sc.close();
    }
}
