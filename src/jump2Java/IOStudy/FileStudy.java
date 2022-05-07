package jump2Java.IOStudy;

//파일 입출력
// 파일 쓰기 (새 파일 저장) :
//      FileOutStream(파일경로/파일명.확장자) : 파일을 생성하기 위해 경로 포함 파일명을 생성자의 입력으로 전달한다. 파일을 사용한 후엔 close()메소드를 사용해 파일을 닫아줘야 한다.
//              write(getByte())메소드를 사용해서 바이트 단위로 데이터를 처리해서 노트에 추가해준다. 
//      FileWriter : write() 메소드를 문자열 그대로 사용 할 수 있어서 편하다.
//              wirte()
//      PrintWriter : println 메서드를 사용 할 수 있어서 \r\n을 덧붙이지 않을 수 있다.
//              println() : 자동 줄바꿈
// 파일 쓰기 (기존 파일 내용 추가) :
//      FileWriter(파일경로/파일명.확장자, true) : true를 두번째 파라미터로 추가 전달하면 파일을 추가 모드로 연다.
//      PrintWriter(new FileWriter(파일경로/파일명.확장자, true)) : 파라미터로 추가모드로 열린 FileWriter의 객체를 전달해야 한다.
// 파일 읽기 :
//      FileInputStream(파일경로/파일명.확장자) : 배열을 이용하여 파일을 읽어야 하기 때문에 정확한 길이를 모를 경우 조금 불편하다. 배열을 문자열로 변경하는 new String(바이트 배열)처럼 사용해야한다.
//      BufferedReader(new FileReader(파일경로/파일명.확장자)) : 파일을 라인단위로 읽을 수 있다. while문에서 readline()메소드를 사용하고, if(line==null) break; 처럼 조건문을 사용해 읽을게 더이상 없을 경우 빠져나가야한다.
//          readLine() 메소드는 한 라인단위로 파일을 읽는다. 더 이상 읽을 라인 없을 시 null을 리턴한다.

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileStudy {
    public static void main(String[] args) throws IOException{

        //파일 쓰기 //
        //FileOutputStream
        FileOutputStream output = new FileOutputStream("c:/webtest/jump2Java/out.txt"); //경로 밑에 out.txt파일 생성 됨

        for(int i=1; i<11; i++){
            String data = i + "번째 줄입니다.\r\n"; //윈도우에서는 \r을 추가해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시된다.
            output.write(data.getBytes(StandardCharsets.UTF_8)); //getBytes() : String을 byte 배열로 바꾸어 준다.
        }
        output.close(); //파일객체를 닫아준다. 자바 프로그램 종료 시 객체도 자동으로 닫아주지만, 실행 중에 파일을 닫지 않고 다시 사용하려고 하면 오류가 발생 할 수 있다.
        
        //FileWriter : String을 byte로 변환하지 않고 문자열 그대로를 사용하는 방법
        FileWriter fw = new FileWriter("c:/webtest/jump2Java/out.txt");
        for(int i=1; i<11; i++){
            String data = i + "번째 줄입니다.FileWriter\r\n"; //윈도우에서는 \r을 추가해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시된다.
            fw.write(data); //getBytes() 없이도 문자열을 바로 사용 가능하다.
        }
        fw.close(); //파일객체를 닫아준다. 자바 프로그램 종료 시 객체도 자동으로 닫아주지만, 실행 중에 파일을 닫지 않고 다시 사용하려고 하면 오류가 발생 할 수 있다.


        //PrintWriter : println() 사용 해서 \r\n 쓰지 않기
        PrintWriter pw = new PrintWriter("c:/webtest/jump2Java/out.txt");
        for(int i=1; i<11; i++){
            String data = i + "번째 줄입니다.PrintWriter"; //윈도우에서는 \r을 추가해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시된다.
            pw.println(data); //write() 대신 println()을 사용 할 수 ㅣㅇㅆ다.
        }
        pw.close(); //파일객체를 닫아준다. 자바 프로그램 종료 시 객체도 자동으로 닫아주지만, 실행 중에 파일을 닫지 않고 다시 사용하려고 하면 오류가 발생 할 수 있다.

        //파일 추가 모드로 열기//
        //FileWriter로 추가모드
        FileWriter fw2 = new FileWriter("c:/webtest/jump2Java/out.txt", true); //추가모드로 열기
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.FileWriter\r\n";
            fw2.write(data);
        }
        fw2.close();

        //PrintWriter로 추가모드
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/webtest/jump2Java/out.txt", true)); //추가모드로 열기
        for(int i=11; i<21; i++) {
            String data = i+" 번째 줄입니다.PrintWriter\r\n";
            pw2.write(data);
        }
        pw2.close();

        //파일 읽기 //
        //FileInputStream
        byte[] b = new byte[64]; //정확한 길이를 모를 경우 파일 내용이 다 출력 되지 않을 수 있다.
        FileInputStream input = new FileInputStream("c:/webtest/jump2Java/out.txt");
        input.read(b);
        System.out.println(new String(b)); //byte를 문자열로 변경하여 출력
        input.close();

        System.out.println("------------------------------------------");

        //BufferedReader(new FileReader(파일경로/파일명.확장자))
        BufferedReader br = new BufferedReader(new FileReader("c:/webtest/jump2Java/out.txt"));
        while(true) {
            String line = br.readLine(); //readLine() 메소드는 한 라인단위로 파일을 읽는다. 더 이상 읽을 라인 없을 시 null을 리턴한다.
            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
    }

}
