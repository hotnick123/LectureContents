class Person1 {
    private String name;
    private int age;
    // 1. Person1이라는 class를 만든다
    // 2. private로 각각의 데이터타입 변수를 만든다.
    //      접근제어자 private 쓰는 이유 : 자바의 객체지향 프로그램은 보안을 굉장히 중요시하기 때문에
    //      외부에서 함부로 값을 바꿀 수 없게 하기 위함


    // 생성자 : 객체를 만들어줄 때 자동으로 값을 넣어주는(초기화) 해주는 함수
    // class와 같은 이름을 가져야 함
    // Person1이라는 하나의 instance 변수를 만들어주는 동시에 name,age 값을 초기화해줌
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /* getter, setter 사용하는 이유
        : private된 변수를 가져오기 위해 따로 함수를 만들어서 외부에서 접근할 수 있게 해준다 */


    // getName : name의 값을 가져오는 함수
    public String getName() {
        // 자신이 가지고 있는 name을 반환
        return name;
    }

    // setName : name의 값을 설정하기 위한 함수
    public void setName() {
        // 자신이 가지고 있는 고유의 name이라는 속성의 값을 바꿔줄 때 this.name=name;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = age;
    }
}

public class review_prob37 {
    public static void main(String[] args) {
        System.out.println("37. ACL 문제 : 기존에 Person 클래스 작성한 내용을 public, " +
                "private을 적용하여 다시 프로그래밍해보자!");

        Person p = new Person("프라이버시", 100);

        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());
        p.setName("홍길동");
        System.out.printf("이름 = %s, 나이 = %d\n", p.getName(), p.getAge());

    }
}
