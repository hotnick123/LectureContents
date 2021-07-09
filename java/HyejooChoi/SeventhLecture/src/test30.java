import java.util.Scanner;

class Student {
    String major;
    String name;
    int age;
}

public class test30 {
    public static void main(String[] args) {
        //Person은 사람 Student는 학생이다.
        //앞서 풀어봤던 예제인 Person을 참고하여 Student 클래스를 만들어보자!
        System.out.println("30. 클래스 문제");

        Student stu = new Student();

        Scanner scan = new Scanner(System.in);
        System.out.print("전공을 입력하세요: ");
        stu.major = scan.nextLine();

        System.out.print("이름을 입력하세요: ");
        stu.name = scan.nextLine();

        System.out.print("나이를 입력하세요: ");
        stu.age = scan.nextInt();

        // %s의 경우에는 printf에서 문자열을 출력하는데 사용한다.
        System.out.printf("이름: %s, 전공: %s, 나이: %d\n", stu.name, stu.major, stu.age);
    }
}
