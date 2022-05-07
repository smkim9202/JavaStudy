package jump2Java.dataTypeStudy;

public class ArrayStudy {
    public static void main(String[] args) {
        //배열 자료형은 타입 앞에 []기호를 사용하여 표현한다.

        int[] odds = {1,3,5,7,9};
        String[] weeks = {"월","화","수","목","금","토","일"};

        //배열의 길이를 먼저 설정하여 배열 변수를 먼저 생성 한 후 값은 나중에 대입하는 방법
        //초기값 없이 배열 변수를 만들 때에는 반드시 길이에 대한 숫자값이 필요하다.
        //String[] weeks3 = new String[];    // 길이에 대한 숫자값이 없으므로 컴파일 오류가 발생한다
        String[] weeks2 = new String[7];
        weeks2[0] = "월";
        weeks2[1] = "화";
        weeks2[2] = "수";
        weeks2[3] = "목";
        weeks2[4] = "금";
        weeks2[5] = "토";
        weeks2[6] = "일";

        System.out.println("*********************************************************************");
        System.out.println("배열변수명[인덱싱번호] 배열의 값 인덱싱으로 얻기 => " + weeks[3]);

        System.out.println("배열의 길이만큼 for문 돌리기 => 배열변수명.length ");
        for (int i=0; i<weeks.length; i++)
            System.out.println(weeks[i]);

        //System.out.println(weeks[7]); // ArrayIndexOutOfBoundsException 오류 발생
        System.out.println("ArrayIndexOutOfBoundsException 오류 발생 : 없는 값을 요구 할 경우 발생");
    }

}
