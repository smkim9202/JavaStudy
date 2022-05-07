package jump2Java.IOStudy;

import java.io.IOException;
import java.util.Scanner;

//콘솔 입출력
// 콘솔 : 사용자의 입력을 받거나 사용자에게 문자열을 출력해주는 역할의 통칭. 인텔리제이에서 실행하면 인텔리제이의 콘솔창이 콘솔이 될 것이고, 윈도우 명령창에서 실행하면 명령창이 콘솔이 된다.
// 스트림 : A에서 B로 이동하는 흐름 => 파일데이터, HTTP 송수신 데이터, 키보드 입력
// 콘솔 입력 :
//     [byte] System.in : InputStream의 객체로 import과정이 필요하다. read()메소드를 사용하면 1byte의 사용자의 입력을 받아들인다.
//     [character] InputStreamReader(System.in) : 바이트 대신 문자로 입력 스트림을 읽는다. read()메소드를 1번 사용해도 지정한 크기만큼 읽어준다.
//     [String] BufferedReader((new InputStreamReader(System.in))) : readLine() 메소드는 사용자가 엔터키를 치기 전까지 입력한 내용의 크기를 전부 받아들인다.
//      Scanner(System.in) : 콘솔입력을 쉽게 처리 할 수 있다. 단어, 숫자, 문자열등 다양하게 읽어 들일 수 있는 메소드들이 있다. next() 단어 / nextLine() 라인 / nextInt 정수
// 콘솔 출력 :
//      System.out : 콘솔에 값을 출력할 때 사용되는 PrintStream 클래스의 객체다. 보통 System.out.println()으로 콘솔에 문자열 출력이나, 디버깅 시 많이 사용한다.
//      System.err : 오류메시지를 출력 할 경우 사용
//      Unix 콘솔에서 자바 프로그램 실행시 출력 옵션을 지정하면 System.out과 System.err로 출력한 내용을 별도의 파일로 저장 할 수 있다.
//          $ java 클래스명 > out.txt 2> error.txt => 컴파일 후(class 파일 생성 후) 유닉스에서 명령어를 치면 out.txt에 일반출력을, error.txt에 에러출력을 해서 문자열이 저장된다.

public class consoleStudy {
    public static void main(String[] args) throws IOException{

        //System.in 입력//
        //InputStream으로 값을 읽어 들일 때 IOException이 발생 할 수 있기 때문에 예외처리를 하는데 throws로 예외처리를 뒤로 미루게 했다.
/*        InputStream in = System.in;

        int a; //int 자료형의 저장되는 값은 0-255 사이의 정수값으로 아스키 코드값이다.
        a = in.read(); //1byte의 사용자의 입력을 받아들인 후 int자료형에 정장된다. 1byte만 읽기 때문에 그 이상을 전달해도 맨 앞의 1byte만 읽는다.

        System.out.println(a); //콘솔에 입력시 해당하는 아스키코드 출력
*/

        //여러글자를 입력 받고 싶을 시 => read() 메소드를 여러번 실행해서 입력시 읽어들이는 크기를 늘렸다.
/*        int b1;
        int b2;
        int b3;

        b1 = in.read();
        b2 = in.read();
        b3 = in.read();

        System.out.println(b1); //첫글자 아스키코드
        System.out.println(b2); //두번째글자 아스키코드
        System.out.println(b3); //세번째글자 아스키코드 이후는 짤림
*/

        //개선 된 형태의 여러글자 입력 받기 => 배열이용
        //문자값 그대로는 출력되지 않는다.
/*        byte[] c = new byte[3];
        in.read(c);

        System.out.println(c[0]); //첫글자 아스키코드
        System.out.println(c[1]); //두번째글자 아스키코드
        System.out.println(c[2]); //세번째글자 아스키코드 이후는 짤림
*/

        //InputStreamReader//
        //문자값 그대로 출력하기
        //고정 된 길이로만 스트림을 읽어야 한다.
/*      InputStreamReader reader = new InputStreamReader(System.in);
        char[] d = new char[3];
        reader.read(d);

        System.out.println(d); //입력한 문자열 그대로 출력
*/

        //BufferedReader//
        //입력받은 크기 그대로 출력하기
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(reader);

        String e = br.readLine(); //엔터키를 입력할때까지 입력했던 문자열을 전부 읽어주는 메소드
        System.out.println(e);
*/

        //Scanner//
        //생성자의 입력으로 System.in 즉 콘솔입력인 InputStream을 필요로 한다.
        //단어 뿐만 아니라 숫자, 문자열등 다양하게 읽어 들일 수 있는 메소드들이 준비되어 있다.
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next()); //next() 메소드는 하나(Token)를 읽어들인다.


    }

}
