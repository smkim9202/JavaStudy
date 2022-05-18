package jump2Java.javaPrograming;
//공백을 제외한 글자수 세기
//  메소드 이름은? getExcludeSpaceCount()
//  입력 받는 값은? 문자열
//  출력하는 값은? 문자열에서 공백을 제외한 글자수

public class Problem4 {
    static int getExcludeSpaceCount(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') { //공백이 아닌 경우에만
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String writeString = "공백을 제외한 글자수";
        System.out.println("["+writeString.charAt(0)+"]");
        System.out.println("["+writeString.charAt(3)+"]");

        System.out.println(getExcludeSpaceCount("공백을 제외한 글자수"));
        System.out.println(getExcludeSpaceCount("점프 투 자바의 연습문제 풀이 중"));

    }


}
