public class review_0518 {
    public static void main(String[] args) {
        System.out.println("class, object, instance, method, getter and setter");

        // class : 공통된 특징을 가지고 있는 객체들의 모임, 연관되어 있는 변수와 메서드의 집합
        // 쉽게 객체를 만들기 위한 설계도, 틀이라고 이해할 수 있음

        // object(객체) : 소프트웨어에서 구현할 대상 , 설계도로 구현한 모든 대상
        // 클래스에 선언된 모양 그대로 생성된 실체, 상태(특성,속성)과 행동(동작)으로 이루어져 있음

        // instance : class(설계도)를 바탕으로 소프트웨어에 구현된 구체적인 실체
        // 객체를 소프트웨어에 실체화한 것을 '인스턴스'라고 부름
        // 실체화된 인스턴스는 메모리에 할당, instance는 객체에 포함된다고 볼 수 있음.

        // 클래스타입으로 선언되었을 때 객체라고 부르고,
        // 그 객체가 메모리에 할당되어 실제 사용될 때 인스턴트라고 부름


        // method : c언어의 함수와 동일한 기능
        // public static void main(String[] args) << 흔히 보는 main()도 메소드임
        //메소드를 정의하는 것 = 메소드를 만드는 것


        // 생성자 :
        /*
        ConsTest() {
            System.out.println("안녕 나는 ConsTest() 이라고해!");
        }
        ConsTest(int a) {
            System.out.println("안녕 나는 ConsTest(int a) 이라고해!");

            age = a;
        }
        ConsTest(float f) {
            System.out.println("안녕 나는 ConsTest(float f) 라고해!");
        }
        ConsTest(int a, String n) {
            System.out.println("안녕 나는 ConsTest(int a, String n) 이라고해!");

            name = n;
            age = a;
        }
        */
        // 오버로딩 : 위처럼 이름이 같고 입력이 다른 케이스로 메서드를 사용하는 방식
        // **입력의 개수는 상관없고, 사용되는 입력의 데이터타입을 보고 판단**


        // getter and setter :
        // getter와 setter는 오브젝트 혹은 변수의 값을 가져오거나, 설정해주는 역할을 하는 '메소드'

        // getter :
        // return type은 참조할 멤버변수의 자료형과 일치해야 함
        // 이름 앞에 get을 붙이고 뒤에는 리턴할 멤버변수의 이름 혹은 해당 변수를 직관적으로 표현하는 단어가 와야함
        // 예) int getAge();

        // setter :
        // return type은 void 혹은 값의 설정 결과를 알려줄 수 있는 type이어야 함
        // argument는 수정할 맴버변수와 같은 type이어야 함
        // 이름 앞에 set을 붙이고 뒤에는 수정할 멤버변수의 이름 혹은 해당 변수를 직관적으로 표현하는 단어가 와야함
        // 예) void setAge(int age);

        // getter와 setter는 값을 설정하고 리턴하는 역할, 클래스를 재사용할때 용이함
    }
}
