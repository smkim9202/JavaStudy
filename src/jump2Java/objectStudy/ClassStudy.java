package jump2Java.objectStudy;
//클래스란?
//Animal 클래스를 classStudy.java 파일에 작성 하지만 보통 클래스는 특별한 경우가 아니라면 파일 단위로 하나씩 작성한다.
//클래스 주요 기능 : 객체(object)를 만드는 기능
//클래스 : 객체변수, 메소드
//객체 변수 : 클래스에 선언된 변수로 인스턴스변수, 멤버변수, 속성이라고도 한다. 객체간 서로 공유되지 않는다.(독립적이다)
//객체 변수 접근 방법 : 객체.객체변수
//메소드 : 객체 변수에 값을 대입하는 방법 중 가장 보편적인 방법으로 클래스 내에 구현된 함수를 의미
//메소드 호출 방법 : 객체.메소드



class Animal{
    String name; //객체변수(인스턴스변수, 멤버변수, 속성)Animal 클래스의 name이라는 String 변수 추가

    public void setName(String name){ //setName메소드 추가
        // 입력 : String name
        // 출력 : void(리턴값 없음)
        // 입력으로 name이라는 문자열을 받고 출력은 없는 형태의 메소드
        this.name = name;
            //this는 Animal클래스에 의해서 생성된 객체를 지칭
    }
}

public class ClassStudy {
    public static void main(String[] args) {
        Animal cat = new Animal(); //객체생성
        //new 키워드 : 객체를 생성하는 키워드
        //Animal 클래스의 instance인 cat, 즉 Animal의 객체가 만들어 짐
        //cat : 객체, Animal의 intance(객체가 어떤 클래스의 객체인지 관계 위주로 설명)
        System.out.println(cat.name); //객체변수에 접근 : cat.name
        //결과 : null 출력 => null(할당되어 있지 않은 상태)
        //객체변수로 name 선언 후 아무런 값도 대입 하지 않은 상태
        cat.setName("body"); //메소드 호출
        System.out.println(cat.name);
        //결과 : body 출력
        //setName 메소드 먼저 호출 후 cat.name 접근

        Animal dog = new Animal(); //객체생성
        dog.setName("happy"); //메소드 호출출
        System.out.println(cat.name);
        System.out.println(dog.name);
        //객체변수는 객체간 서로 공유되지 않음


    }
}
