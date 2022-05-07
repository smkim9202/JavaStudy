package jump2Java.objectStudy;
//생성자
//객체변수에 값을 설정 하지 않은 상태에서 호출하면 null이 출력된다.
//기본값을 설정해서 따로 값을 설정하지 않아도 특정한 값이 출력되게 하고 싶을 때 생성자를 사용한다.
//생성자 : 클래스명(객체변수){this.메서드(객체변수);} => 클래스명과 메소드명 동일, 리턴타입 정의 X
//생성자는 객체 생성 시 호출 됨 : new 클래스명(입력인수, ...)
//디폴트 생성자 : 생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 경우. 클래스의 객체가 만들어 질 때 디폴트 생성자 실행. 생성자를 작성 하지 않아도 컴파일러가 자동으로 디폴트 생성자 추가한다.
//생성자 오버로딩 : 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.

class Comics {
    String name;

    void setName(String name){
        this.name = name;
    }

}

class Romance extends Comics{
    //디폴트 생성자
    Romance(){
    }
    void fun(){
        System.out.println(this.name + " is romance comics");
    }
}

class JapaneseRomance extends Romance{
    //생성자 : 클래스명과 동일, 리턴타입 정의하지 않음(void도 사용 안함)
    JapaneseRomance(String name){
        this.setName(name);
    }
    //생성자 오버로딩
    JapaneseRomance(int type){
        if (type == 1){
            this.setName("yamyamlove");
        }else if (type == 2){
            this.setName("callme");
        }
    }

    void fun(){//오버라이딩
        System.out.println(this.name + " is Japanese romance comics");
    }

    void fun(int percent){//오버로딩
        System.out.println(this.name + " is Japanese romance comics" + percent + "% fun");
    }

}



public class ConstructorStudy {
    public static void main(String[] args){
        JapaneseRomance jrc = new JapaneseRomance("lovelovelove"); //객체 생성 시 생성자 호출(문자열로 생성)
        //JapaneseRomance jrc = new JapaneseRomance();
        System.out.println(jrc.name);
            //null 출력(생성자 없을 시 comics클래스 name변수에 값이 설정 되어 있지 않기 때문에 null 출력)
            //생성자 있을 시 객체 생성 할 때 키워드로 전달해야 함
        jrc.setName("love virus");
        jrc.fun(); //love virus is Japanese romance comics 출력
        jrc.fun(70); //love virus is Japanese romance comics70% fun 출력

        //생성자 오버로딩
        JapaneseRomance jrc2 = new JapaneseRomance(1);
        System.out.println(jrc2.name); //yamyamlove 출력 =>int 자료형으로 입력받는 생성자


    }

}
