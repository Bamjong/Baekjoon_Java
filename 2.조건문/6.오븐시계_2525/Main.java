import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int oventime = sc.nextInt();

        time(hour, minute, oventime);

        sc.close();
    }

    public static void time(int hour, int minute, int oventime) {
        minute += oventime;
        while (minute >= 60) {
            minute -= 60;
            hour += 1;
        }
     
        if (hour >= 24) {
            hour -= 24;
        }

        System.out.printf("%d %d",hour,minute);
        
    }
}