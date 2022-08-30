import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        leapyear(sc.nextInt());

        sc.close();
    }
    
    static void leapyear (int a){
        if ((a % 4) == 0 && (a % 100) != 0) {
            System.out.println("1");
        } else if ((a % 4) == 0 && (a % 400) == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
