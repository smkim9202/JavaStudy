package jump2Java.objectStudy;
//계산기 프로그램으로 객체지향 알아보기

class Calculator{
    static int result = 0;

    static int add(int num){
        result += num;
        return result;
    }
}

class Calculator2{
    int result = 0;

    int add(int num){
        result += num;
        return result;
    }

    //빼기 기능 추가
    int sub(int num){
        result -= num;
        return result;
    }

}



public class ObjectStudy {
    public static void main(String[] args){
        //객체를 생성하지 않을 경우 계산기가 필요 할 때마다 클래스를 만들어 줘야 한다.
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));

        //객체를 생성하면 하나의 클래스로 여러개의 계산기를 사용 할 수 있다.
        //Calculator 클래스의 static 키워드를 모두 삭제
        Calculator2 cal1 = new Calculator2();
        Calculator2 cal2 = new Calculator2();

        System.out.println("cal1 계산기" + cal1.add(3));
        System.out.println("cal1 계산기" + cal1.add(7));

        System.out.println("cal2 계산기" + cal2.add(3));
        System.out.println("cal2 계산기" + cal2.add(7));
        System.out.println("cal2 계산기" + cal2.sub(7));

    }



}
