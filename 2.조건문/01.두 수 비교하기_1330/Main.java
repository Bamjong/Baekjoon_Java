import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        compare(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    static void compare(int a, int b){
        if (a>b) {
            System.out.println(">");
        } else if (a==b) {
            System.out.println("==");
        } else {
            System.out.println("<");
        }
    }
}
