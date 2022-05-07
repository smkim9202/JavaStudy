package jump2Java.dataTypeStudy;

public class StringBufferStudy {

    public static void main(String[] args) {
        
        //멀티 스레드 환경에서 안전한 StringBuffer
        StringBuffer sb = new StringBuffer(); //StringBuffer 객체 sb 생성
        System.out.println("StringBuffer 자료형으로 문자열 추가 변경 작업하기 ");
        sb.append("hello");
        sb.append(" jump ");
        sb.append("to java");
        String result = sb.toString(); //toString() String자료형으로 변경하는 메소드
        System.out.println("append(추가할문자열) 메소드는 추가 => " + result);

        sb.insert(0,"HaHaHa ");
        System.out.println("insert(위치, 삽일 할 문자열) => " + sb.toString());

        System.out.println("substring(시작위치, 끝위치(찾고싶은문자열+1)) => " + sb.substring(0,4));


        System.out.println("*********************************************************************");
        StringBuilder sb2 = new StringBuilder();
        System.out.println("StringBuilder 자료형은 성능이 더 우수하기 때문에 동기화 고려 할 필요 없는 경우 사용 ");
        sb2.append("hello");
        sb2.append(" jump ");
        sb2.append("to java");
        String result2 = sb2.toString();
        System.out.println(result2);



    }
}
