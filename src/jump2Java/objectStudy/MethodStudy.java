package jump2Java.objectStudy;
//메소드란?
//클래스 내부에 함수를 메소드라고 한다.
//함수라는 것이 별도로 존재하지만, 자바는 클래스를 떠나 존재 할 수 없으므로 따로 함수가 존재하지 않는다.
//반복해서 사용되는 것을 한뭉치로 묶어서 "어떤 입력값을 주었을 때 어떤 리턴값을 돌려준다"라는 식의 메소드를 작성해서 사용한다.
//입력값 ====> 메소드(블랙박스) =====어떤 처리 ===> 리턴값
//매개변수(parameter) : 메소드에 입력으로 전달된 값을 받는 변수
//인수(arguments) : 메소드 호출 시 전달하는 입력값
//return : 특별한 경우 메소드를 빠져나기 원할 때 return을 단독으로 사용하여 메소드를 즉시 빠져나갈 수 있음
//메소드 내에서 선언 된 변수는 메소드 안에서만 효력범위를 가진다.(메소드 밖에서 호출 시 적용 X) => 로컬변수
//메소드 입력항목의 값이 객체인지 구별하는 기준 : 입력항목이 primitive 자료형이면 값이 전달, 그 이외의 경우 reference 자료형은 객체가 전달된다.

//메소드 분류 4가지
//  입출력이 모두 있는 메소드(일반적인 메소드)
//  입출력이 모두 없는 메소드
//  입력은 없고 출력은 있는 메소드
//  입력은 있고 출력은 없는 메소드




public class MethodStudy {
    //일반적인 메소드(입출력이 모두 있는 메소드)
    int sum(int a, int b) {//리턴자료형 메소드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...){
        //sum 메소드는 입력값으로 두개의 값(int a, int b)을 받고
        //입력값을 더한값(int 자료형)을 리턴값으로 돌려준다.
        //a,b는 매개변수
        return a + b; //return 리턴값;
            //return : 결과 값을 돌려주는 명령어
    }

    //입력값이 없는 메소드(입력은 있고 출력은 없는 메소드)
    String say(){ //리턴자료형 메소드명(){
        //say 메소드는 입력값은 없고 String 자료형을 리턴값으로 돌려준다.
        return "HI"; //return 리턴값;
    }

    //리턴값이 없는 메소드(입력은 있고 출력은 없는 메소드)
    void hup(int a, int b){ //void 메소드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...){
        //hup 메소드는 입력값으로 두개의 값(int a, int b)을 받고
        //리턴자료형이 void이기 때문에 리턴값은 없다.
        System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다."); //리턴자료형이 void일 경우 return문 필요 없음
    }

    //입력값도 리턴값도 없는 메소드(입출력이 모두 없는 메소드)
    void introduce () { //void 메소드명(){
        //introduce 메소드는 입력값은 없고, 리턴자료형이 void이기 때문에 리턴값이 없다.
        System.out.println("My job is Developer"); //리턴자료형이 void일 경우 return문 필요 없음
    }

    //retuen의 또 다른 쓰임새
    void sayNick(String nick) {
        if ("fool".equals(nick)) {
            return; //return을 단독으로 사용하여 메소드 빠져나감 -  void인 메소드에만 해당당
        }
        System.out.println("나의 별명 => " + nick);
    }

    //메소드 내에서 선언된 변수의 효력 범위
    void varTest(int var){ //var는 로컬변수
        var += 10;
        System.out.println(var);
    }


    //로컬변수를 외부에서 사용하려면 return을 활용한다.
    int varTest2(int var2){ //var는 로컬변수
        var2 += 10;
        return var2;
    }

    //메소드 입력값이 객체 일 경우
    int obj; //객체변수 obj
    void varTest3(MethodStudy ms2){
        //ms2.obj++;
        this.obj++;
    }


        public static void main (String[]args){
            int a = 3;
            int b = 4;

            //일반적인 메소드(입출력이 모두 있는 메소드)
            MethodStudy ms = new MethodStudy();
            int c = ms.sum(a, b); //리턴값을받을변수 = 객체.메소드명(입력인수1, 엽력입수2, ...);
            int d = ms.sum(3, 4);
            //3,4는 인수
            System.out.println(c); // 7 출력
            System.out.println(d); // 7 출력

            //입력값이 없는 메소드(입력은 있고 출력은 없는 메소드)
            String hi = ms.say(); //리턴값을받을변수 = 객체.메소드명();
            System.out.println(hi); // "HI" 출력

            //리턴값이 없는 메소드(입력은 있고 출력은 없는 메소드)
            ms.hup(3, 4); //객체.메소드명(입력인수1, 입력인수2, ...);

            //입력값도 리턴값도 없는 메소드(입출력이 모두 없는 메소드)
            ms.introduce(); //객체.메소드명()

            //retuen의 또 다른 쓰임새
            ms.sayNick("angel");
            ms.sayNick("fool"); //return문에서 빠져나감

            //메소드 내에서 선언된 변수의 효력 범위
            int var =1;
            ms.varTest(var); //11 출력
            System.out.println(var);//1 출력
                //메소드 내에서 선언 된 변수 var는 메소드 내에서만 효력있다.

            //로컬변수를 외부에서 사용하려면 return을 활용한다.
            int var2 = 1;
            var2 = ms.varTest2(var2);
            System.out.println(var2); //11 출력

            //메소드 입력값이 객체 일 경우
            MethodStudy ms2 = new MethodStudy();
            ms2.obj = 1;
            ms2.varTest3(ms2);
            System.out.println(ms2.obj); //2 출력
        }
    }

