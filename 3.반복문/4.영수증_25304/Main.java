import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int receipt_length = sc.nextInt();
        int receipt_result = 0;
        int[] arr = new int[receipt_length];

        for (int i = 0; i < receipt_length; i++) {
            
            arr[i] = receipt(sc.nextInt(), sc.nextInt());
            
        }

        for (int j = 0; j < arr.length; j++) {
            receipt_result += arr[j];
        }

        if (total == receipt_result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        sc.close();
    }

    public static int receipt(int a, int b) {

       int result = a * b;
    
       return result;
    }
}
