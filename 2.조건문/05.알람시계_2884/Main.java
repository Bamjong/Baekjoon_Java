import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        time(sc.nextInt(), sc.nextInt());

        sc.close();
    }

    public static void time(int a, int b){
        int hour = a;
        int minute = (b - 45);
        if (minute < 0){
            hour = a - 1;
            minute += 60;
            if (hour < 0) {
                hour += 24;
            }
        }
        System.out.println(hour + " " + minute);

    }
}
