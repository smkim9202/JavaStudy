package jump2Java.dataTypeStudy;

import java.util.*;

/*
* Jump To Java 03장 연습문제
* */
public class Doit03 {
    public static void main(String[] args){
        //Q1. 국영수 평균 점수 구하기
        System.out.println("Q1.");

        int kor = 80;
        int eng = 75;
        int mat = 55;

        int avg = (kor+eng+mat)/3;

        System.out.println("국영수 평균 => " + avg);


        //Q2. 자연수 13 짝/홀 판별
        System.out.println("Q2.");

        int n =13;
        if(n % 2 == 0)
            System.out.println(String.format("%d은 짝수 입니다.",n));
        else
            System.out.println(String.format("%d은 홀수 입니다.",n));


        //Q3. 주민등록번호는 881120-1068234에서 연월일부분과 뒷부분을 substring으로 나누어 출력 substring(시작위치, 끝위치(뽑고싶은 문자열+1))'
        System.out.println("Q3.");

        String pin = "881120-1068234";
        String birth = pin.substring(0,6);
        String num = pin.substring(7);
        System.out.println(String.format("생년월일 => %s, 뒷부분 => %s", birth, num));


        //Q4. 주민등록번호는 881120-1068234에서 성별을 나타내는 숫자 출력하기기
        System.out.println("Q4.");

        String pin2 = "881120-2068234";
        String sex = String.valueOf(pin2.charAt(7)); //String.valueOf() 스트링값으로 변환 null값이면 null이라는 문자열 받아옴
        int pinN = Integer.parseInt(sex);
         if (pinN == 1 || pinN == 3)
            System.out.println("남자입니다.");
        else if(sex.equals("2")  || pinN == 4)
            System.out.println("여자입니다.");
        else
            System.out.println("외국인입니다.");


        //Q5. a:b:c:d => a#b#c#d replace()
        System.out.println("Q5.");

        System.out.println("a:b:c:d".replaceAll(":","#"));


        //Q6. [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
        System.out.println("Q6.");

        ArrayList<Integer> nList = new ArrayList<>(Arrays.asList(1,3,5,4,2));
        System.out.println(nList);

        nList.sort(Comparator.reverseOrder());
        System.out.println(nList);


        //Q7. ['Life', 'is', 'too', 'short'] 리스트를 "Life is too short" 문자열로 뽑기
        System.out.println("Q7.");

        ArrayList<String> mylist = new ArrayList<>(Arrays.asList("Life","is","too","short"));
        System.out.println(mylist);

        String result = String.join(" ",mylist);
        System.out.println("String.join을 이용한 문자열만들기 => " + result);

        //Q8. 맵 grade에서 "B'에 해당되는 값을 추출해 보자. (추출하고 나면 grade에는 "B"에 해당하는 아이템이 사라져야 한다.)
        System.out.println("Q8.");

        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);

        int result2 = grade.remove("B");
        System.out.println(result2);  // 80 출력
        System.out.println(grade);

        //Q9. 다음의 numbers 리스트에서 중복 숫자를 제거해 보자.
        System.out.println("Q9.");
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        System.out.println(numbers);  // [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5] 출력

        HashSet<Integer> temp = new HashSet(numbers);  // List를 Set으로 변경
        System.out.println(temp);

        ArrayList<Integer> result3 = new ArrayList<>(temp);  // Set을 다시 List로 변경
        System.out.println(result3);  // [1, 2, 3, 4, 5] 출력


        //Q10. 다음은 커피의 종류(1: 아메리카노, 2:아이스 아메리카노, 3:카페라떼)를 입력하면 커피의 가격을 알려주는 프로그램이다.
        //위 메소드에서 1, 2, 3과 같은 매직넘버를 제거하여 프로그램을 개선해보자.
        System.out.println("Q10.");

        printCoffeePrice(1);  // "가격은 3000원 입니다." 출력
        //printCoffeePrice(99);  // NullPointerException 발생

        printCoffeePrice(CoffeeType.AMERICANO);  // "가격은 3000원 입니다." 출력

    }

    static void printCoffeePrice(int type) {
        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 3000);  // 1: 아메리카노
        priceMap.put(2, 4000);  // 2: 아이스 아메리카노
        priceMap.put(3, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

        enum CoffeeType {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        };

        static void printCoffeePrice(CoffeeType type) {
            HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
            priceMap.put(CoffeeType.AMERICANO, 3000);  // 1: 아메리카노
            priceMap.put(CoffeeType.ICE_AMERICANO, 4000);  // 2: 아이스 아메리카노
            priceMap.put(CoffeeType.CAFE_LATTE, 5000);  // 3: 카페라떼
            int price = priceMap.get(type);
            System.out.println(String.format("가격은 %d원 입니다.", price));
        }
}
