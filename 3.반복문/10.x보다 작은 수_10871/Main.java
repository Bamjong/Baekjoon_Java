import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr_length = sc.nextInt();
        int under_number = sc.nextInt();

        int[] arr = new int[arr_length];

        for (int i = 0; i < arr_length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr_length; i++) {
            if (arr[i] >= under_number) {
            }
        }
       
        for (int i = 0; i < arr_length; i++) {
            if (arr[i] < under_number) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
