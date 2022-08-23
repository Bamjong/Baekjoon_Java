import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        
        add(sc.nextInt(), sc.nextInt());
        add(0,0);

        sc.close();
        
    }

    public static void add(int a, int b){

        int c = a + b;

        if (c != 0){
            System.out.println(c);
        } else{
        }

    }
}