import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //초기화
        int[] first = new int[2];
        int[] second;

        //시작
        for(int i = 0; i < first.length; i++){
            first[i] = sc.nextInt();
        }
        
        second = new int[first[0]];

        for(int i = 0; i < second.length; i++){
            second[i] = sc.nextInt();
        }

        for(int i = 0; i < second.length; i++){
            if(second[i] < first[1]){
                System.out.print(second[i] + " ");
            }
        }
    }
}
