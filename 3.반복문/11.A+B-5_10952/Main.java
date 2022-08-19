import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int first = sc.nextInt();
            int second = sc.nextInt();
            int result = add(first,second);
            if (first == 0 && second == 0) {
                break;
            } else {
                System.out.println(result);
            }
              
        }
        
    }

    public static int add(int a, int b){
        int c = a+b;

        return c;
    }
}