import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        int N=0;
        Scanner sc = new Scanner(System.in);
       
        while( ((N<1)||(N>100)) ){
            N = sc.nextInt();
        }
        for(int i=N; i>=1; i--){
            for(int j=1; j<=N+1-i; j++){
                System.out.print("★");
            }
            System.out.println();
        }
       
        sc.close();
    }
}