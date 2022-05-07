package jump2Java.dataTypeStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class FinalStudy {
    public static void main(String[] args) {

        //final은 자료형에 값을 단 한번만 설정 할 수 있게 강제하는 키워드
        // 프로그램 수행 도중 그 값이 변경되면 안되는 상황에서 사용
        final int n = 123;  // final 로 설정하면 값을 바꿀수 없다.
        //n = 456;  // 컴파일 에러 발생 : cannot assign a value to final variable n

        final ArrayList<String> a = new ArrayList<>(Arrays.asList("a", "b"));
        //a = new ArrayList<>(Arrays.asList("c", "d"));  // 컴파일 에러 발생

        //final로 선언시 리스트에 값을 add하거나 remove하는 것은 가능하다. 다만 재할당이 불가능 할 뿐이다.
        //List.of로 add와 remove도 불가능하게 할 수 싰다.
        //final List<String> a1 = List.of("a", "b");
        //a1.add("c");  // UnsupportedOperationException 발생
    }
}
