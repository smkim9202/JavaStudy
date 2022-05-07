package jump2Java.dataTypeStudy;

import java.util.Arrays;
import java.util.HashSet;

public class SetStudy {
    public static void main(String[] args) {
        //집합과 관련 된 처리를 하는 자료형. 중복 허용 X, 순서 X(Unordered), 인덱싱 X

        //Set(인터페이스) - HashSet, LinkedHashSet, TreeSet

        //HashSet 생성 후 항목 값 넣기 => Arrays.asList(배열); import java.util.Arrays;
        HashSet<String> set = new HashSet<>(Arrays.asList("a","d","y","s","s"));
        System.out.println("HashSet set => " + set); //순서가 뒤죽박죽 출력 됨, 중복 된 값은 사라짐

        System.out.println("*********************************************************************");
       //집합
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        //교집합 => 교집합 담을 객체 Copy 후 객체명.retainAll(비교객체)
        HashSet<Integer> intersection = new HashSet<>(s1); //s1 데이터 유지를 위해 intersection HashSet 객체 Copy
        //s1.retainAll(s2); // s1의 내용이 교집합으로 변경 됨
        intersection.retainAll(s2);
        System.out.println("s1,s2의 교집합 intersection => " + intersection);

        //합집합 => 합집합 담을 객체 Copy 후 객체명.addAll(비교객체)
        HashSet<Integer> union = new HashSet<>(s1); //s1 데이터 유지를 위해 union HashSet 객체 Copy
        union.addAll(s2);
        System.out.println("s1,s2의 합집합 union => " + union);

        //차집합 => 차집합 담을 객체 Copy 후 객체명.removeAll(비교객체)
        HashSet<Integer> substract = new HashSet<>(s1); //s1 데이터 유지를 위해 substract HashSet 객체 Copy
        substract.removeAll(s2); //차집합 s1-s2
        System.out.println("s1-s2의 차집합 substract => " + substract);

        System.out.println("*********************************************************************");
        //집합관련 메소드
        //값 추가하기 => add()
        HashSet<String> set2 = new HashSet<>();
        set2.add("Jump");
        set2.add("To");
        set2.add("Java");
        System.out.println("add()메소드로 값을 추가한 set2 => " +set2);

        //값 여러개 추가하기 => addAll(Arrays.asList(배열));
        set2.addAll(Arrays.asList("python","MFC"));
        System.out.println("addAll()메소드로 값을 추가한 set2 => " +set2);

        //특정 값 제거하기 => remove("항목");
        set2.remove("MFC");
        System.out.println("remove()메소드로 값을 삭제한 set2 => " +set2);


        //Set의 가장 큰 특징 : 순서가 없음
        //LinkedHashSet, TreeSet => Set에 입력된 순서대로 데이터를 가져오고 싶은 경우.오르차순 정렬된 데이터 가져오고 싶은 경우
        //LinkedHashSet : 입력한 순서대로 값을 정렬하여 저장하는 특징
        //TreeSet : 오름차순으로 값을 정렬하여 저장하는 특징

    }
}
