import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] chess_basic = {1,1,2,2,2,8};

        int[] put_in = new int[6];
        int count = put_in.length;

        for (int i = 0; i < count; i++) {
            put_in[i] = sc.nextInt();
        }

        for (int e = 0; e < count; e++) {
            System.out.print(chess_basic[e] - put_in[e] + " ");
        }

        sc.close();
    }
}
