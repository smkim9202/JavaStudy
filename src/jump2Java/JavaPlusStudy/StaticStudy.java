package jump2Java.JavaPlusStudy;

//정적
//static 변수 : 항상 값이 변하지 않는 경우 사용. 보통 프로그래밍시 공유의 목적으로 사용.
//             변수 앞에 static이 붙으면 자바는 메모리 할당을 딱 한번만 하게 된다.
//             또한 같은 곳의 메모리 주소만을 바라보기 때문에 변수의 값을 공유한다.
//static 메소드 : 메소드 앞에 static이 붙는 경우.
//              클래스.스택틱메소드() : 객체 생성없이 클래스를 통해 메서드를 직접 호출이 가능하다.
//              보통 스태틱 메소드는 유틸리티성 메소드를 작성할 때 많이 사용한다. : 오늘의 날짜 구하기, 숫자에 콤마 추가하기 등의 메소드 작성
//싱글톤 패턴(singleton pattern) : 단 하나의 객체만을 생성하게 강제하는 패턴(클래스를 통해 생성 할 수 있는 객체는 Only One)

import java.text.SimpleDateFormat;
import java.util.Date;

class HouseLee{//이씨 집안
    //String lastname = "이";
    static String lastname = "이";
}

public class StaticStudy {
    public static void main(String[] args) {
        HouseLee lee1 = new HouseLee();
        HouseLee lee2 = new HouseLee();
        //이씨집안 클래스로 객체를 생성 할 때마다 객체변수 lastname을 저장하기 위한 메모리가 별도로 할당된다.
        //HouseLee 클래스의 lastname은 어떤 객체라도 동일한 값인 "이"를 받고 싶다면?
        //변하지 않는 경우 static을 사용한다.
        //static 변수로 변경 후엔 lastname의 메모리를 딱 한번만 할당한다. 그 후 객체들이 같은 곳의 메모리 주소만을 바라보게 한다.
        //static 앞에 final 키워드를 붙이면 lastname의 값이 변경 할수 없게 된다. 변경 시도시 오류가 발생한다.
        //Static을 사용하는 이유 : 공유. 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 된다.

        //static 변수
        Counter c1 = new Counter(); //count가 객체변수 일 때 결과값 : 1 => static 변수 일 때 결과값 : 1
        Counter c2 = new Counter(); //count가 객체변수 일 때 결과값 : 1 => static 변수 일 때 결과값 : 2

        //static 메서드
        System.out.println(Counter.getCount()); //static 메서드는 클래스를 이용하여 호출

        //날짜 구하는 Util
        System.out.println(Util.getCurrentDate("yyyyMMdd")); //오늘 날짜 출력

        //싱글톤패턴
        //Singleton singleton = new Singleton(); //컴파일 오류 발생 : Singleton클래스의 생성자에 private 키워드로 다른 클래스에서의 객체 생성을 막음
        //Singleton singleton = Singleton.getInstance(); //getInatance()라는 static 메소드를 이용하여 객체를 생성 => 매번 새로운 객체가 호출 되기때문에 싱글톤은 아님
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2); //싱글톤으로 객체가 딱 한번만 만들어지기 때문에 true 출력

    }
}


class Counter{
    //int count = 0;
    static int count = 0;
    Counter(){
        //this.count++;
        count++; //count는 더이상 객체변수가 아니므로 this를 제거
        //System.out.println(this.count);
        System.out.println(count); //count는 더이상 객체변수가 아니므로 this를 제거
    }

    public static int getCount(){ //static 메서드
        return count; //count가 static변수이기 때문에 접근이 가능하다. 만약 객체변수 였으면 접근이 불가능하다.
    }
}

//오늘의 날짜 구하는 스태틱 메서드
class Util{
    public static String getCurrentDate(String fmt){
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(new Date());
    }
}

//싱글톤패턴
class Singleton{
    private static Singleton one;
    private Singleton(){
    }

    public static Singleton getInstance(){
        //return new Singleton(); //같은 클래스이므로 생성자 호출이 가능하다.
        if(one==null){ // 메서드 호출시 첫 호출에만 스태틱 변수인 one에 객체를 넣어주고 이후에는 one이 null이 아니기 때문에 항상 같은 객체를 리턴한다.
            one = new Singleton();
        }
        return one;
    }
}