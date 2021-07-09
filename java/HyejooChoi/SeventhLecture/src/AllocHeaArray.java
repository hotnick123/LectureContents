import java.util.Scanner;

public class AllocHeaArray {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("학급에 학생이 몇 명 있습니까?");

        int studentNum = scan.nextInt();

        // 동적할당 되는 데이터를 관리하는 메모리 - Heap
        // new 로 만든 데이터는 전부 Heap에서 관리하게 됨
        // 기존에 우리가 stack에 배열을 만들 경우엔 항상 제약사항이 발생했었다. : 개수가 고정됨(할당된 값으로)

        // Heap 방식의 할당에서는 공간을 필요한만큼 할당할 수 있어서 유연한 접근이 가능
        // 근데 여기에도 제약사항이 있음 : stack보다 느림

        // new를 통해 공간을 만드는 방법
        // new 데이터타입
        // 데이터타입이 배열이라면 대괄호를 열고 몇개를 만들지 적음
        // 데이터타입이 클래스라면 소괄호를 열고 필요하다면 인자를 설정

        // Heap 공간에 int형 배열을 studentNum 개수만큼 만들겠습니다
        // 그리고 studentArr는 Heap에 생성된 공간을 제어하게 된다.
        // [0], [1], ... [3] 등의 인덱스가 Heap에 있는 공간을 바라보게 된다는 뜻인데
        // 복잡하게 생각하기 싫다면 기존 배열 제어하는 방식과 동일하되
        // 메모리 생성시에만 아래와 같은 방식을 사용한다고 보면 되겠다.
        int studentArr[] = new int[studentNum];

        // 비교 대상
        int arr[] = { 1, 2, 3, 4, 5 };

        for (int i = 0; i < studentNum; i++) {
            // studentNum 만큼 생성되니 해당 학생숫자에 맞게 80 ~ 100점의 점수를 가지도록 만듬
            studentArr[i] = (int)(Math.random() * 21) + 80;
            System.out.printf("studentArr[%d] = %d\n", i, studentArr[i]);
        }
    }
}
