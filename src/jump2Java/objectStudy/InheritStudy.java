package jump2Java.objectStudy;
//상속
//extends : 클래스 상속 받는 키워드
//자식 클래스 : 부모클래스의 기능 + 좀 더 많은 기능 추가
//IS-A 관계 : 자식클래스는 부모클래스를 상속했다. 즉 자식클래스는 부모클래스의 하위 개념이다. 즉 자식은 부모이다.(핫도그는 음식이다.)
//      부모클래스 객체명 = new 자식클래스 //자식 is a 부모(핫도그 is a 푸드) 성립
//      부모클래스 객체를 자료형으로 사용 할 경우 자식클래스에서만 사용하는 메서드는 사용 불가
//      반대로 작성 시 컴파일 오류가 발생한다. 자식 클래스의 자료형으로 사용 불가
//모든 클래스는 Object 클래스를 자동으로 상속받는다. 하지만 굳이 코드에서 extends Object를 하지 않는다.
//      Object 객체명 = new 자식클래스 가능
//오버라이딩(Overriding) : 부모 클래스의 메소드를 입출력의 동일한 형태의 메소드로 자식 클래스에서 재구현해서 자식클래스의 오버라이딩 된 메소드가 더 높은 우선순위를 갖게 한다. 메소드 덮어쓰기
//오버로딩(Overloading) : 입력항목의 자료형이나, 갯수가 다를 경우 동일한 이름을 가진 메소드를 생성 하는 것.
//자바는 다중상속을 지원하지 않는다. 다중 상속시 같은 이름을 가진 메소드가 있을 시 호출 할 때 애매한 부분이 생기기 때문이다.
class Food{
    Integer num; //객체변수, 멤버변수, 인스턴스변수, 속성

    void setNum(Integer num) {
        this.num = num;
    }

}

//Is-A 상속(Hotdog - Food)
class Hotdog extends Food{ //class 자식클래스명 extends 부모클래스명
    void hungry(){
        System.out.println("Im hungry..  please hotdog..." + this.num);
    }
}

//메소드 오버라이딩
class JumboHotdog extends Hotdog{ //오버라이딩 안한 경우
}
class CheeseHotdog extends Hotdog{//오버라이딩
    void hungry(){
        System.out.println("Im hungry..  please CheeseHotdog..." + this.num);
    }

    //메소드 오버로딩
    void hungry(int geasu){
        System.out.println("I want CheeseHotdog  "  + geasu);
    }
}

public class InheritStudy {
    public static void main(String[] args){
        Hotdog hotdog = new Hotdog();
        hotdog.setNum(2);
            //부모클래스의 메서드를 자식클래스 객체에서도 사용 가능
        System.out.println(hotdog.num); //2 출력
        hotdog.hungry(); // Im hungry..  please hotdog...2 출력

        //IS-A 관계
        Food hotdog2 = new Hotdog(); //Hotdog is Food //핫도그로 만든 객체는 음식 자료형이다.
        //Hotdog jumbohotdog = new Food(); //Food is Hotdog(A-IS)는 컴파일 오류
        hotdog2.setNum(5);
        System.out.println(hotdog2.num); //5 출력
        //jumbohotdog.hungry(); //IS-A관계에서 자식클래스에서 사용하는 메서드는 사용 불가

        //hungry 메소드 오버라이딩 안한 경우
        JumboHotdog jh = new JumboHotdog();
        jh.setNum(5); //조상클래스의 메서드
        jh.hungry(); //Im hungry..  please hotdog...5 출력 => 부모클래스의 메소드

        //hungry 메소드 오버라이딩 한 경우
        CheeseHotdog ch = new CheeseHotdog();
        ch.setNum(10);
        ch.hungry(); //Im hungry..  please CheeseHotdog...10 출력 => 자식클래스에서 오버라이딩 한 메소드
        ch.hungry(5); //I want CheeseHotdog  5 출력  => 오버로딩 한 메소드

    }

}
