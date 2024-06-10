import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //초기화
        int first;
        int second;
        int count = 0;
        int[] Array;

        //시작
        first = sc.nextInt(); //첫번째 값 입력
        Array = new int[first]; 

        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt(); //두번째 값 입력
        }

        second = sc.nextInt(); //세번째 값 입력

        for (int i = 0; i < Array.length; i++) {
            if(Array[i] == second){
                count++;
            }
        }

        System.out.println(count);
    }
}
