import java.util.Scanner;

public class test29 {
    public static void main(String[] args) {

        System.out.println("1, 3, 9, 27, 81, 243, 729, 2187, ...");

        Scanner scan = new Scanner(System.in);

        System.out.print("몇 번째 항을 구할까? : ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("잘못된 값입니다.");
        } else if (num < 2){
            System.out.println("찾는 값은 1입니다.");
        } else {
            int numArr[] = new int[num];

            numArr[0] = 1;


            for (int i = 1; i < numArr.length; i++) {
                numArr[i] = numArr[i - 1] * 3;
            }

            System.out.printf("%d 번째 항은 = %d\n", num, numArr[num - 1]);
        }



//        //아래와 같은 형태의 숫자들이 있다.
//        //1, 3, 9, 27, 81, 243, 729, 2187, ...
//        //n을 입력해서 n번째 값을 구하도록 프로그래밍 해보자!
//        System.out.println("29. 배열 문제");
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("n 값 입력 : ");
//
//        int num = scan.nextInt();
//        int res = 0;
//
//        if (num <= 0) {
//            System.out.println("값 없음");
//        } else {
//            int first = 1;
//            for (int i = 1; i < num; i++) {
//                first *= 3;
//                res = first;
//            }
//            System.out.println("결과는 = " + res);
//        }


    }
}
