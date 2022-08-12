import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number_length = sc.nextInt();
        int result = 0;

        for (int i = 0; i < number_length; i++) {
            result = plus(sc.nextInt(), sc.nextInt());
            System.out.println("Case #"+(i+1)+": "+ result);
        }

        sc.close();
        
    }
    public static int plus(int a, int b) {
        int c = a + b;

        return c;
    }
}





// 5
// 1 1
// 2 3
// 3 4
// 9 8
// 5 2

// Case #1: 2
// Case #2: 5
// Case #3: 7
// Case #4: 17
// Case #5: 7

