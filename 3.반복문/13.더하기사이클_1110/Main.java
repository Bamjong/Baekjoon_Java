import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0; //카운트
        int receive = sc.nextInt();
        int receive_first = receive;

        while (true) {
            receive = ((receive % 10) * 10) + (((receive / 10) + (receive % 10)) % 10);  // 2 + ((2+6)%10)
            count++;
            if (receive_first == receive) {
                break;
            }
        }
        System.out.println(count);
        sc.close();
    }

}