package jump2Java.objectStudy;
//인터페이스
//필요성 : 부모클래스(adult)에서 상속 받은 자식클래스들이 늘어 날수록 점원 클래스의 메소드 send가 추가되어야 한다.
//작성법 : interface 부모클래스{} / 단독 파일로 저장하는 것이 일반적인 방법.
//구현방법 : class 자식클래스 extends 부모클래스 implements 인터페이스명
//IS-A관계 : 클래스 is a 인터페이스(할머니는 어른이다.)
//객체가 한개 이상의 자료형 타입을 갖게 되는 특성 : 다형성(폴리모피즘)
//인테페이스를 구현한 클래스를 작성 하면 클래스가 추가 될 때마다 메소를 추가 할 필요가없다(어른이 추가되더라도 점원은 send메소드를 추가 할 필요 없다.)
//인터페이스 안에 메소드 : 입출력에 대한 정의만 있고 내용은 없음. 메소드 내용은 인터페이스를 상속받은 클래스들이 public으로 오버라이딩해서 반드시 구현해야 함(오버라이딩 안할시 컴파일 오류)
//인터페이스를 사용하면 의존적인 클래스에서 독립적인 클래스로 만들 수 있다.(점원이 사람종류에 의존적인 클래스에서 독립적인 클래스로 변함)
//물리적세계 - 자바세계 : 컴퓨터 - 독립적인클래스(점원) / USB포터 - 인터페이스(어른) / 하드디스크,디지털카메라... - 인터페이스를상속받은클래스(할머니, 할아버지, 아저씨...)
//인터페이스의 디폴트 메서드(자바 8 이후) : 디폴트 메서드를 사용하면 메서드안에 구현체를 가질 수 있다.
//      디폴트 메서드를 사용하면 인터페이스를 구현한(상속받은) 실제 클래스(할머니,할아버지..)는 그 메서드를 구현하지 않아도 사용가능하다.
//      디폴드 메서드를 오버라이딩 할 수 도 있다.
//      사용방법 : default 반환자료형 메소드명(){};
//인터페이스의 스태틱 메서드(자바 8 이후) : 인터페이스에서 static 메서드를 구현 할 수 있다. 일반 클래스의 스태틱 메서드 사용법과 동일하다.
//        구현방법 : 인터페이스명.스태틱메서드명
//        사용방법 : static 반환자료형 메소드명(){};

//+다형성 : 폴리모피즘. 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것.
// instanceof : 어떤 객체가 특정 클래스의 객체인지 조사 할 때 사용(객체 instanceof 클래스명 => 객체는 이클래스로 만들어진 객체니?)
// class 클래스명 extends 부모클래스 implements 인터페이스1, 인터페이스2
//      클래스명 객체 = new 클래스명();
//      부모클래스명 객체 = new 클래스명();
//      인터페이스1 객체 = new 클래스명(); => 인터페이스1으로 선언된 인터페스1의 객체는 인터페스1의 메소드만 사용 가능
//      인터페이스2 객체 = new 클래스명(); => 인터페이스2으로 선언된 인터페스2의 객체는 인터페스2의 메소드만 사용 가능
//      => 자식인터페이스 인터페이스명 extends 인터페이스1, 인터페이스2(인터페이스 다중상속을 통해 인터페스1,2의 메소드 모두 사용가능하게 만들자)
//          자식인터페이스 객체 new 클래스명();


/*
마트의 점원이 하는 일
/나는 사람을 상대하는 점원이다.
/성인이 오면 과일을 준다.
/할머니가 오면 바나나를 준다.
/할아버지가 오면 사과를 준다.
/Person, GM, GF, Checker 클래스

중요한 클래스는 점원(cherker) 클래스. 구현체(할머니, 할아버지,..)는 늘어 날 수 있지만 인터페이스(Adult)는 하나
*/
/*
*  +다형성
/Bouncer(경비원) 클래스 추가
/throwFruit(과일을 던진다-마트를 지키기 위해) 메서드 추가
/어른종류가 바뀔 때마다 throwFruit 메서드 추가 해야함... => Throwable 인터페이스 작성 gm, gf 클래스가 인터페이스를 구현하도록 변경

*/


//문제점 해결을 위해 Adult 인터페이스의 등장 <= 사람에서 상속 받는 클래스가 추가 될 수록 send 메소드도 추가해햐 함
interface Adult{
    String getSend(); //메소드 추가 시 입출력에 대한 정의만 있고 구현체(내용)는는상속 받은 클래스에서 오버라이딩해야함

    //디폴트 메서드
    default void printAdult(){
        System.out.printf("나는 어른(%d 세 이상)이다. %s\n",adultAge(), getSend()); //adultAge() => static메서드
    }

    //스태틱 메서드
    int basicAge = 1; //인터페이스 상수
    static int adultAge(){
        return basicAge * 20;
    }
}

//+다형성
interface Throwable{
    void throwF();
}


//Adult, Throwable 인터페이스를 다중 상속 받은 ThrowableAdult 인터페이스 생성
interface ThrowableAdult extends Adult, Throwable{

}


class Person{
    String name;

    void setName(String name){
        this.name = name;
    }
}

//class GM extends Person{}
//class GM extends Person implements Adult,Throwable{
    //인터페이스 메서드 오버라이딩해서 사용해야 함(필수)
class GM extends Person implements ThrowableAdult{
    //다중 상속받은 인터페이스를 상속 받아서 두개의 메소드를 한꺼번에 사용하자
    @Override
    public String getSend() {
        return "banana to gm";
    }

    //디폴트 메서드 오버라이딩(필수아님)
    @Override
    public void printAdult(){
        System.out.printf("나는 어른(%d 세 이상)중에서도 할머니다. %s\n",Adult.adultAge(), getSend()); //Adult.adultAge() => 인터페이스의 static메서드
    }

    //+다형성
    @Override
    public void throwF() {
        System.out.println("할머니는 바나나 껍질을 던져");
    }
}

//class GF extends Person{}
//class GF extends Person implements Adult, Throwable{ //+다형성 : Throwable 인터페이스도 추가
    //인터페이스 메서드 오버라이딩해서 사용해야 함(필수)
class GF extends Person implements ThrowableAdult{
    //다중 상속받은 인터페이스를 상속 받아서 두개의 메소드를 한꺼번에 사용하자

    @Override
    public String getSend() {
        return "apple to gf";
    }

    //+다형성
    @Override
    public void throwF() {
        System.out.println("할아버지는 사과를 던져");
    }
}


//사람인 아줌마, 아저씨, 아가씨, 총각이 추가 될 때 마다 send 메소드를 추가해야 한다.
//점원이 귀찮음을 해결하기 위해 인터페이스가 등장한다.
class Checker{
    /*
    void send(GM gm){//할머니가 오면 바나나를 준다.
        System.out.println("send banana to gm");
    }

   void send(GF gf){//할아버지가 오면 사과를 준다.
        System.out.println("send apple to gf");
   } //메소드 오버로딩
   */
    void send(Adult adult){
        //System.out.println("send apple");
            //항상 send apple만 출력하는 문제 => 인터페이스에 메소드 추가
        System.out.println("send "+adult.getSend());
            //adult.getSend()를 호출하면 Adult 인터페이스를 구현한 구현체(gm, gf)의 getSend() 메소드가 호출된다.
    }
    //추상클래스 send 오버로딩(입력 자료형이 다름)
    void send(Adult2 adult2){
        //System.out.println("send apple");
        //항상 send apple만 출력하는 문제 => 인터페이스에 메소드 추가
        System.out.println("send "+adult2.getSend());
        //adult.getSend()를 호출하면 Adult 인터페이스를 구현한 구현체(gm, gf)의 getSend() 메소드가 호출된다.
    }

    //디폴트 메서드 사용하기
    void printAdult(Adult adult){
        adult.printAdult();
    }
}

//+다형성 : 경비원추가
class Bouncer{
    /*
    void throwFruit(Person person){
        //입력자료형은 사람이다. 하지만 메소드를 호출시 할머니, 할아버지 객체로 전달 할 수 있다.
        //그 이유는 할머니, 할아버지 클래스가 사람이라는 부모 클래스를 상속 받았기 때문이다.
        //즉 Person gm = new GM(); //gm is a Person 가능능
       if (person instanceof GM){//(객체 instanceof 클래스명 => 사람객체는 할머니클래스로 만들어진 객체니?)
            System.out.println("할머니는 바나나 껍질을 던져");
        } else if(person instanceof GF){
            System.out.println("할아버지는 사과를 던져");
        }
    }
     */
    //+다형성 인터페이스 throwF활용 => 결과는 똑같다
    void throwFruit(Throwable person){ //Person 대신에 Throwable 사용
        //gm,gf 객체는 각각 GM,GF 클래스의 객체이면서, Person 클래스의 객체이기도 하고, Adult, Throwable 인터페이스의 객체이기도 하다.
        person.throwF();
    }
}

public class InterfaceStudy {
    public static void main(String[] args){
        Checker ck = new Checker();
        GM gm = new GM();
        GF gf = new GF();
        ck.send(gm); // send banana to gm 출력 => send apple 출력 => send banana to gm 출력
        ck.send(gf); // send apple to gf 출력 => send apple 출력 => send apple to gf 출력

        //인터페이스의 디폴트 메서드(gm-오버라이딩함)
        ck.printAdult(gm); //나는 어른중에서도 할머니다. banana to gm
        ck.printAdult(gf); //나는 어른이다. apple to gf

        //+다형성
        GM gm2 = new GM();
        GF gf2 = new GF();
        Bouncer bouncer = new Bouncer();
        bouncer.throwFruit(gm2);
        bouncer.throwFruit(gf2);

    }
    
}
