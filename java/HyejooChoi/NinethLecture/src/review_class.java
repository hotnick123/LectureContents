class Node {
    private int x;
    private int y;

    // Node라는 class를 만들고 x,y라는 인트형 정수변수를 만들었다면 private형태로 만들어줘야함
    // 자바의 객체지향 프로그램은 보안을 굉장히 중요시 함. 외부에서 함부로 값을 바꿀 수 없게 하기 위함
    // x,y의 값을 가져오기 위해 따로 함수를 만들어서 외부에서 접근할 수 있도록 public int getX();를 만들어 줌


    // x의 값을 가져오는 함수
   public int getX() {
        // 자신이 가지고 있는 x를 반환함
        return x;
    }

    // x의 값을 넣어주는 함수, x의 값을 설정하기 위해 사용
    public void setX(int x) {
        // 자신이 가지고 있는 고유의 x라는 속성의 값을 바꿔줄 때 this.x = x;
        // x라는 변수를 지금 들어오는(int x) 매개변수 x로 바꿔주겠다. setX : x의 값을 세팅해주겠다~라고 이해
        // 매개변수(int x)로 넘어온 값을 this.x에 넣어줌으로서 세팅해주겠다.
        // 결론 : 변수의 값을 바꾸는 함수 setter
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 생성자 : 객체를 만들어줄때 자동으로 값을 넣어주는(초기화)해주는 함수.
    // class와 동일한 이름을 가져야 함
    // Node라는 하나의 intance변수를 만들어주는 동시에 x,y의 값을 초기화해줌
    public Node(int x, int y) {
       this.x = x;
       this.y = y;
    }

    // getCenter : 다른 노드를 매개변수로 받음. 다른 node와
//    public Node getCenter(Node other) {
//
//    }

}

public class review_class {
    public static void main(String[] args) {
        System.out.println("class");
        // class : 객체 지향 프로그래밍에 있어 가장 기본이 되는 것
        // class를 이용하여 현실 세계의 특정한 물건을 지칭할 수 있음. 대표적 : Node클래스
        // car라는 class가 있다. car의 속력,색상,이름 등의 성질이 있을 것이다
        // 어떠한 실세계의 사물에 대해서 어떠한 성질들을 묶어서 그러한 특성들을 정의해 놓은 것을 class라고 한다
        // 클래스를 정의한 후 어떠한 데이터를 변수로 만들어서 사용할수 있도록 하는게 intance
        // intance를 만든다 -> class에서 만들어진 실제로 사용할 수 있는 단위. 예) new Car();

        // 객체 : 실세계의 사물
    }
}
