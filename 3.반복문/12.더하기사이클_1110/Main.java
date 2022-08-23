import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int first = sc.nextInt();
        int tens,units,add,result;
        int i = 0;

        int first1 = first;
        
        tens = first / 10;
        units = first - (tens * 10);
        add = tens + units;
        


        (units * 10) + add;

        System.out.println(tens +  " "  + units + " " + add);
        
    }
}