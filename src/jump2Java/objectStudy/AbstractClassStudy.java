package jump2Java.objectStudy;
//추상클래스 : 인터페이스의 역할 + 클래스의 기능
// 추상클래스는 일반클래스와 달리 단독으로 객체를 생성 할 수 없고, 반드시 추상 클래스를 상속한 실제 클래스를 통해서만 객체 생성이 가능하다.
//인터페이스와 차이점 : 일반 클래스처럼 객체변수, 생성자, private 메서드 등을 가질 수 있음
// abstract class 클래스명 extends 부모클래스명
// 1. Adult 인터페이스, Person 클래스 => abstract class Adult extends Person
// 2. default 메서드 => 디폴트 제거  / 메서드 => abstract 메서드 / int 변수명 = 상수; => static int 변수명 = 상수;



/*
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

 */
//추상클래스로 변경
abstract class Adult2 extends Person{
    abstract String getSend();
        //추상클래스 메소드도 몸통이 없다. 상속 받는 클래스에서 해당 메소드를 구현해야만 사용 가능
        //abstract이 붙은 메소드는 반드시 오버라이딩 해서 사용

    //디폴트 메서드 => 일반 메서드로 변경 : 반드시 실제 클래스에서 오버라이딩 안해도 사용가능
    void printAdult(){
        System.out.printf("나는 어른(%d 세 이상)이다. %s\n",adultAge(), getSend());
    }

    //인터페이스에서는 자동으로 static으로 인식하지만 추상클래스는 명시적으로 적어 주어야 함
    static int basicAge = 1;
    static int adultAge(){
        return basicAge * 20;
    }
}

class Uncle extends Adult2 implements Throwable{
    @Override
    public String getSend() {
        return "orange to uncle";
    }

    //+다형성
    @Override
    public void throwF() {
        System.out.println("삼촌은 오렌지를 던져");
    }
}

class Aunt extends Adult2 implements Throwable{
    @Override
    public String getSend() {
        return "melon to Aunt";
    }

    //+다형성
    @Override
    public void throwF() {
        System.out.println("이모는 멜론을 던져");
    }
}

public class AbstractClassStudy {
    public static void main(String[] args){
        Checker ck = new Checker(); //Cherker클래스에 send메서드 정의하고 오기
        Uncle uncle = new Uncle();
        Aunt aunt = new Aunt();

        ck.send(uncle);
        ck.send(aunt);



    }
}
