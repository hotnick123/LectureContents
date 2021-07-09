class Person {
    int age;
    String name;

    int getAge() {
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
}
// new Person()을 통해 만든 공간은
// 위의 커스텀 데이터타입에 해당하는 정보들을 저장할 수 있는 공간을 생성한 것이다.

public class ClassTest {
    public static void main(String[] args) {
        // 클래스는 사용자가 직접 만들 수 있는 데이터타입
        // 변수를 만드는것과 동일하게 클래스를 사용해서 변수를 만들자
        // 변수 이름 person으로 Person 형태의 텅 빈 공간이 만들어진다(만들어지는 위치는 Heap)
        Person person =  new Person();

        // new를 통해 공간을 만드는 방법
        // new 데이터타입
        // 데이터타입이 배열이라면 대괄호를 열고 몇개를 만들지 적음
        // 데이터타입이 클래스라면 소괄호를 열고 닫은 후 필요하다면 인자를 설정

        // '.' 은 공간 내부에 접근하겠다는 뜻을 내포한다.
        // person 변수가 가지고 있는 공간중 age에 21을 저장한다.
        person.age = 21;
        // person 변수가 가지고 있는 공간중 name에 "홍길동"을 저장한다.
        person.name = "홍길동";

        System.out.println("이 사람은 몇 살 ? " + person.age);
        System.out.println("이름은 ? " + person.name);

        person.setAge(33);
        person.setName("홍길동");

        System.out.printf("%s님의 나이는 %d입니다.\n", person.getName(), person.getAge());
    }
}
