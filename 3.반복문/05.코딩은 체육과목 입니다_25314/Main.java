import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 4 - 1; 

        for(int i = a; i >= 0; i--) { 
            System.out.print("long ");
        }
        if(num % 4 <= 3) {
            System.out.print("int ");
        }
    }
}
