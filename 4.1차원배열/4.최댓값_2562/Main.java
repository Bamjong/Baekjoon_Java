import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int queue = 1;

        //넣은 배열에서 앞에부터 비교하는 연산과정
        for(int i = 0; i < 9; i++){
            int a = sc.nextInt();

            if(a > max){
                max = a;
                queue = i+1;
            }
        }
        
        System.out.println(max);
        System.out.println(queue);
    }
}