package jump2Java.dataTypeStudy;

public class TypeConversionStudy {

    public static void main(String[] args) {

        //형변환 : 문자열 => 정수(integer) 변환 : int n = Integer.parseInt(문자열)
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println("문자열 123 정수형으로 변환 => " + n);

        //형변환 : 정수 => 문자열 변환 : String 변수 = "" + 정수형;
        String num2 = "" + n;
        System.out.println("정수형 123 문자열로 변환 => " + num2);

        //String.valueOf(정수형), Integer.toString(정수형)
        String num3 = String.valueOf(n);
        System.out.println("정수형 123 문자열로 변환 => " +num3);
        String num4 = Integer.toString(n);
        System.out.println("정수형 123 문자열로 변환 => " +num4);

        //문자열 => 소숫점 포함 : Double.parseDouble, Float.parseFloat
        String num5 = "123.456";
        double d = Double.parseDouble(num5);
        System.out.println("문자열 123.456 소숫점으로 변환 => " +d);
        //int n2 = Integer.parseInt(num5);  // 실수 형태의 문자열을 정수로 변환할 경우 NumberFormatException이 발생한다.

        //정수 실수 사이의 형 변환
        int n3 = 123;
        double d2 = n3; //정수를 실수로 바꿀 때 캐스틴 필요 없음
        System.out.println("정수 123 소숫점으로 변환 => " + d2); //123.0출력
        int n4 = (int) d2; //실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println("소숫점 123.0 정수로 변환 => " + n4);  // 소숫점이 생략된 123 출력
    }
}
