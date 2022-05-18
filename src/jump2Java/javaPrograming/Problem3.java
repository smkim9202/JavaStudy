package jump2Java.javaPrograming;
//자릿수 구하기 : 양의 정수 입력 받아 그 자릿수 출력하는 프로그램
//  메소드 이름은? getDigitCount()
//  입력 받는 값은? 양의 정수
//  출력하는 값은? 입력 받은 정수의 자릿수

public class Problem3 {

    //몫이 0이 될때까지 나눈 횟수로 구하기
    static int getDigitCount(int n){
        int count = 0;
        while (true) {
            if (n == 0) {
                break;
            }
            n = n / 10; // n을 10으로 나눈 후 구해진 몫을 n에 대입
            count++;
        }
        return count;
    }

    //숫자를 문자열로 바꾸고 그 문자열의 갯수를 세는 방법
    static int getDigitCount2(int n) {
        String s = ""+n; //문자열로 형변환
        return s.length(); //문자열 길이
    }



    public static void main(String[] args) {
        System.out.println(getDigitCount(3));
        System.out.println(getDigitCount(25));
        System.out.println(getDigitCount(333));
        System.out.println(getDigitCount(7865));

        System.out.println(getDigitCount2(3));
        System.out.println(getDigitCount2(25));
        System.out.println(getDigitCount2(333));
        System.out.println(getDigitCount2(7865));
    }



}
