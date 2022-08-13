import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
            for (int e = star; e > 0; e--) {
                System.out.print(" ");
                
            }
            for (int j = -1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
}
