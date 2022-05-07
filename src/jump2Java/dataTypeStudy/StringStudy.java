package jump2Java.dataTypeStudy;

public class StringStudy {

    public static void main(String[] args) {
        String a = "hello";
        String b = "java";
        String c = "java";
        String hj = "Hello Java";

        String d = new String("java");
        String e = new String("hello");
        String f = new String("java");

        System.out.println("*********************************************************************");
        System.out.println("eauals() 메소드는 두 개의 문자열의 결과 값을 비교하여 동일하면 true 틀리면 false 리턴한다.");
        System.out.println("리터럴 hello equals() 리터럴 java => " + a.equals(b)); // => false
        System.out.println("리터럴 java equals() 리터럴 java =>" + b.equals(c)); // => true
        System.out.println("리터럴 java equals() 객체 java => " + b.equals(d)); // => true
        System.out.println("객체 java equals() 객체 hello => " + d.equals(e)); // => false
        System.out.println("객체 java equals() 객체 java => " + d.equals(f)); //=> true

        System.out.println("*********************************************************************");
        System.out.println("비교연산자 '=='는 두 개의 자료형이 동일한 객체인지 판별하는 연산자다.");
        System.out.println("리터럴 hello == 리터럴 java => " + (a == b)); // => false
        System.out.println("리터럴 java == 리터럴 java =>" + (b == c)); // => true
        System.out.println("리터럴 java == 객체 java => " + (b == d)); // => false
        System.out.println("객체 java == 객체 hello => " + (d == e)); // => false
        System.out.println("객체 java == 객체 java => " + (d == f)); //=> false

        System.out.println("*********************************************************************");
        System.out.println("'indexOf'는 문자열에서 특정 문자가 시작되는 위치를 리턴한다");
        System.out.println("'Hello Java'에서 'java'가 시작되는 위치는? => " + hj.indexOf("Java")); //=> 6

        System.out.println("*********************************************************************");
        System.out.println("'contains'는 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다");
        System.out.println("'Hello Java'에서 'java'가 포함 되어 있는지? => " + hj.contains("Java")); //=> true

        System.out.println("*********************************************************************");
        System.out.println("'charAt(인덱스번호)'는 문자열에서 특정 위치의 문자(char)를 리턴한다");
        System.out.println("'Hello Java'에서 6번째 문자열? => " + hj.charAt(6)); //=> J

        System.out.println("*********************************************************************");
        System.out.println("'replaceAll(바꾸고 싶은 문자열, 다른 문자열)'은 문자열 중 특정 문자열을 다른 문자열로 바꾼다.");
        System.out.println("'Hello Java'에서 Java를 World로 바꾸기 => " + hj.replaceAll("Java","World"));

        System.out.println("*********************************************************************");
        System.out.println("'substring(시작위치, 끝위치(뽑고싶은 문자열+1))'은 문자열 중 특정 부분을 뽑아낸다.");
        System.out.println("'Hello Java'에서 0~5 출력하기 => " + hj.substring(0,5)); //=> Hello

        System.out.println("*********************************************************************");
        System.out.println("'toUpperCase()'는 문자열을 모두 대문자로 변경한다.");
        System.out.println("'Hello Java' 대문자로 출력하기 => " + hj.toUpperCase()); //=> HELLO JAVA

        System.out.println("*********************************************************************");
        System.out.println("'split(특정 구분자)'은 문자열을 특정 구분자로 분리한다.");
        String str = "a:b:c:d";
        String[] result = str.split(":");
        System.out.println(result);

        System.out.println("*********************************************************************");
        System.out.println("문자열 포매팅 String.format");
        System.out.println(String.format("I eat %s apples.", "five")); //String.format 문자열을 리턴하는 메소드
        System.out.printf("I eat %s apples. \n", "five"); //System.out.printf 문자열을 출력하는 메소드

        System.out.println(String.format("정렬하는 법 => %10s","hi")); //"        hi" 출력
        System.out.println(String.format("소수점 표현 포맷팅 => %10.4f", 3.12345678));
    }
}

