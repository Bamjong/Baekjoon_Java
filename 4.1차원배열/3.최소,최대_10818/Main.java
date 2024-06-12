import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //초기화
        int range = sc.nextInt();
        int a = 0;

        int max = -1000001;
        int min = 1000001;

        //시작

        for(int i=0; i<range; i++){
            a = sc.nextInt();

            if(a > max){
                max = a;
            }

            if(a < min){
                min = a;
            }
        }
        
        System.out.print(min + " " + max);
        
    }
}