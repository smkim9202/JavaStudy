package jump2Java.dataTypeStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListStudy {
    public static void main(String[] args) {
        //배열과 비슷한 자바의 자료형으로 크기가 정해져 있지 않고 동적으로 변한다.
        //배열 : 크기가 정해져 있어서 크기를 정한 후 그 이상의 값을 담을 수 없다.
        //리스트 : 크기가 정해져 있지 않아 원하는 만큼의 값을 담을 수 있다. 동적으로 자료형의 갯수가 가변하는 상황에서 사용

        //List(인터페이스) - ArrayList, Vector, LinkedList
        //순서유지, 가변배열, 인덱스 사용 가능

        //ArrayList => import java.util.ArrayList;
        ArrayList pitches = new ArrayList();
        System.out.println("변수명.add('삽일 할 내용') => 마지막 위치에 삽입");
        System.out.println("변수명.add(인덱스번호,'삽일 할 내용') => 인덱스 위치에 삽입");
        pitches.add("123");
        pitches.add("456");
        pitches.add(0, "789");
        pitches.add("101112");
        System.out.println("pitches 현재 항목 => " + pitches);

        System.out.println("변수명.get('인덱스번호')로 특정 인덱스 값 추출 => " + pitches.get(1));
        System.out.println("변수명.size()로 ArrayList  담긴 갯수 리턴 => " + pitches.size());
        System.out.println("변수명.contains('찾을 객체')으로 해당 항목이 ArrayList 안에 있는지 판별 후 결과 boolean 리턴 => " + pitches.contains("5677"));
        System.out.println("변수명.remove(객체)으로 객체에 해당하는 항목을 ArrayList 안에서 삭제 후 삭제결과 boolean 리턴 => " + pitches.remove("123"));
        System.out.println("pitches 현재 항목 => " + pitches);
        System.out.println("변수명.remove(인덱스)으로 해당 인덱스의 항목을  ArrayList 안에서 삭제 후 삭제 항목 리턴 => " + pitches.remove(0));
        System.out.println("pitches 현재 항목 => " + pitches);

        //제네릭스 맛보기
        //<String>이라는 제네릭스 표현식은 ArrayList안에 담을 수 있는 자료형은 String 타입 뿐이다 라는것을 의미한다. 어떤 자료형도 사용 가능하다.
        ArrayList<String> pitches2 = new ArrayList<>(); // 뒷 부분에 자료형은 굳이 적지 않아도 명확하기 때문에 생략한다.
        pitches2.add("138");
        pitches2.add("129");

        String one = (String) pitches.get(0); //제네릭스를 사용하지 않을 경우 객체는 Object 자료형으로 인식된다. 값을 가져 올 경우 형변환(casting)을 해주어야만 한다.
        String two = pitches2.get(0); //제네릭스를 사용하면 형 변환이 필요없다.

        //다양한 방법으로 ArrayList 만들기
        //배열 데이터로 ArrayList 생성하기 => Arrays.aslist(배열변수명); import java.util.Arrays;
        String[] data = {"321","654","987"};
        //ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList(data)); //Arrays 클래스의 asList 메소드 사용해서 문자열 배열로 ArrayList 생성하기
        ArrayList<String> pitches3 = new ArrayList<>(Arrays.asList("321","654","987")); //String배열 대신 String 자료형을 여러개 전달 하기도 가능
        System.out.println("pitches3 현재 항목 => " + pitches3);

        //ArrayList 콤마로 구분하여 하나의 문자열로 만들기
        //for문으로 pitches4 요소들 콤마로 구분해서 하나의 문자열로 만들기
        ArrayList<String> pitches4 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = "";
        for (int i = 0; i < pitches4.size(); i++) {
            result += pitches4.get(i);
            result += ",";  // 콤마를 추가한다.
        }
        result = result.substring(0, result.length() - 1);  // 마지막 콤마는 제거한다.
        System.out.println("for문을 이용한 문자열만들기 => " + result);  // 138,129,142 출력

        //String.join("구분자",리스트객체) 사용해서 pitches4 요소들 세미클론으로 구분해서 하나의 문자열로 만들기 => Java 8버전부터 사용가능
        String result2 = String.join(":",pitches4);
        System.out.println("String.join을 이용한 문자열만들기 => " + result2);

        //ArrayList 정렬하기 => 객체명.sort(Comparator.naturalOrder()); import java.util.Comparator;
        //오름차순(순방향) 정렬 - Comparator.naturalOrder()
        //내림차순(역방향) 정렬 - Comparator.reverseOrder()
        pitches3.sort(Comparator.naturalOrder());  // 오름차순으로 정렬
        System.out.println("오르차순으로 정렬 => " + pitches3);  // [321, 654, 987] 출력
        pitches3.sort(Comparator.reverseOrder());  // 내림차순으로 정렬
        System.out.println("내림차순으로 정렬 => " + pitches3);  // [987, 654, 321] 출력

    }
}
