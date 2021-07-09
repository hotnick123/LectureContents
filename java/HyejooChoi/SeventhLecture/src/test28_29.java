import java.util.Scanner;

public class test28_29 {
    public static void main(String[] args) {
//        아래와 같은 형태의 숫자들이 있다.
//        1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, ...
//        n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!

        System.out.println("28. 배열 문제");

        Scanner scan = new Scanner(System.in);
        System.out.print("n 값 입력 : ");

        int num = scan.nextInt();
        int res = 0;

        if (num <= 0) {
            System.out.println("값 없음");
        } else {
            int first = 1;
            for (int i = 1; i < num; i++) {
                first *= 2;
                res = first;
            }
            System.out.println("결과는 = " + res);
        }





    }
}
