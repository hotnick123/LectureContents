// Q: 생성자는 무조건 main()에서만 호출이 가능한가요 ?
// A: 어디서나 가능합니다.

class Students1 {
    String name;
    int score;

    public Students1 (String name) {
        score = (int)(Math.random() * 40 + 61);
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
}

class School1 {
    final int MAX = 3;
    final String[] names = {"아녀엉", "안녀엉", "안뇨옹"};
    Students1[] arr;

    public School1 () {
        arr = new Students1[MAX];

        for (int i = 0; i < MAX; i++) {
            arr[i] = new Students1(names[i]);
        }
    }
    public void printStudentsInfo () {
        for (int i = 0; i < MAX; i++) {
            System.out.printf("학생 이름은 %s, 점수는 %d 입니다.\n",
                    arr[i].getName(), arr[i].getScore());
        }
    }
}

public class review_ConstructorCall {
    public static void main(String[] args) {
        School1 school1 = new School1();

        school1.printStudentsInfo();
    }
}