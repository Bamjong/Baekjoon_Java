import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            quadrant(sc.nextInt(), sc.nextInt());

            sc.close();

        }
        
        static void quadrant(int a, int b){
            if ((a > 0 && a <= 1000) && ((b > 0 && b <= 1000))) {
                System.out.println("1");
            } else if ((a >= -1000 && a < 0) && (b > 0 && b <= 1000)) {
                System.out.println("2");
            } else if ((a >= -1000 && a < 0) && (b >= -1000 && b < 0)) {
                System.out.println("3");
            } else if((a > 0 && a <= 1000) && (b >= -1000 && b < 0)) {
                System.out.println("4");
            }
        }
}
