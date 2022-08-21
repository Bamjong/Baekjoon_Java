이번 문제에서 총 두번틀렸는데

첫번째는 while문 안에 sc.close(); 를 적어버려
런타임 에러 (IllegalState) 가 떠버렸고

두번째는 while조건을 true로 적어버려
런타임 에러 (NoSuchElement) 가 떠버렸다.

sc.hasNextInt를 왜 적어야하는지 알게된 글이다
[출처](https://cordingdiary.tistory.com/45)

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;
        
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }

    }
}
```

