import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt(); // 초기 총 금액
        int receipt_length = sc.nextInt(); // 영수증 갯수 지정
        int receipt_result = 0; // 영수증 총 더한값 초기화
        int[] arr = new int[receipt_length]; // 영수증 곱한값들 배열로 정리

        //영수증 갯수 지정받은만큼 값&갯수 입력하여 결과값을 배열로 지정해주기
        for (int i = 0; i < receipt_length; i++) {
            arr[i] = receipt(sc.nextInt(), sc.nextInt());
        }

        //배열 지정한것끼리 더해주기
        for (int j = 0; j < arr.length; j++) {
            receipt_result += arr[j];
        }

        //초기 총 금액과 모두 더한것이 맞으면 Yes or No 출력하기
        if (total == receipt_result) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        sc.close();
    }

    //두개 곱해주기
    public static int receipt(int a, int b) {

       int result = a * b;
       return result;
    }
}
