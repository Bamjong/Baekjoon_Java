import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        
        a = (scanner.nextInt() * scanner.nextInt());
        scanner.close();
        System.out.println(a);
    }
}