package jump2Java.JavaPlusStudy;

//람다 : Java 8버전부터 함수형 프로그래밍 지원하기 위해 스트림과 함께 도입
//익명함수(Anonymous functions)를 의미한다.
//인터페이스를 구현클래스 없이 람다를 사용해서 바로 사용 할 수 있다.
//단, 인터페이스의 메서드가 1개 이상이면 람다함수를 사용 할 수 없다.
//인터페이스 변수명 = (인터페이스 메소드의 입력항목) -> 리턴값구현
//람다 함수로 사용할 인터페이스는 @FunctionalInterface 어노테이션을 사용해서 2개이상의 메서드를 작성 불가능 하게 한다.

//람다 함수 인터페이스

import java.util.function.BinaryOperator;

public class LambdaStudy {

    public static void main(String[] args) {

        //일반코드
        MyCalculator mc = new MyCalculator();
        int result = mc.sum(3, 4);
        System.out.println(result); //7출력

        //람다적용코드
        //인터페이스 메서드의 입력항목 -> 리턴값
        //Calculator calculator = (int a, int b) -> a+b;

        //입력항목 자료형도 생략해서 작성해도 된다.
        //Calculator calculator = (a,b) -> a+b;

        //(a,b)->a+b 와 Integer.sum(int a, int b) 동일 하기 때문에 축약 가능
        Calculator calculator = Integer::sum;

        int result2 = calculator.sum(3,4);
        System.out.println(result2);

        //람다 함수 인터페이스
        //BiFunction<입력항목, 입력항목, 출력항목>
        //apply() : 호출시 람다함수 (a,b) -> a+b가 실행
        //BiFunction<Integer, Integer, Integer> mylambda = (a,b) -> a+b;

        //Integer 반복도 축약 가능
        //BinaryOperator<항목들자료형>
        BinaryOperator<Integer> mylambda = (a,b) -> a+b;

        int result3 = mylambda.apply(3, 4);
        System.out.println();



    }
}
@FunctionalInterface //람다함수로 사용 예정. 2개 이상의 메서드 작성 불가
interface Calculator{
    int sum(int a, int b);
}

class MyCalculator implements Calculator{

    @Override
    public int sum(int a, int b) {
        return a+b;
    }
}