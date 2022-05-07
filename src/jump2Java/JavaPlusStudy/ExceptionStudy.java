package jump2Java.JavaPlusStudy;


//Unhandled exception: java.io.FileNotFoundException => 저장된 파일을 찾을 수 없습니다
//java.lang.ArithmeticException: / by zero =? 0으로 나눌 수 없습니다.
//java.lang.ArrayIndexOutOfBoundsException: 숫자 => 배열에서 구할 수 없는 값으로 숫자 해당하는 인덱스에 값이 없다.

//try{...실행...}catch(오류클래스 e){해당오류발생시 예외가 발생하여 수행 할 문장}finally{예외와 상관없이 무조건 수행 할 문장}
//오류클래스 e : 오류클래스의 객체로, 오류객체를 통해 해당 예외 클래스의 메서드를 호출할수 있다.
//finally : 예외에 상관없이 무조건 수행 해야 한다.

//throws : 예외 던지기
//      만들예외 클래스에서 throw new
//      클래스 객체 호출 한곳에서 예외 던지기 => 만들예외 클래스에서 throws new 처리시 객체 호출 한곳에서 예외 처리

//예외처리 직접 만들기 : RuntimeException, Exception 클래스 상속 받기
//      class 만들예외 extends RuntimeException{}  : 실행시 발생하는 예외. 발생 할지말지 모르는 경우에 사용 => throw new 만들예외();
//      class 만들예외 extends Exception{} : 컴파일시 발생하는 예외. 프로그램 작성시 이미 예측가능한 예외 작성시 사용 => try{}catch(만들예외 e){}

//System.err.println("");  => 콘솔로 데이터를 출력하는데 사용(에러)

//트랜잭션(Transaction)
// 포장, 영수증발행, 발송 3가지 중 하나라도 실패시 모두 취소하고 "상품발송"전의 상태로 되돌리고 싶은 경우
// 모두 취소하지 않으면 데이터의 정합성이 흔들리게 된다. 이렇게 모두 취소하는 행위를 롤백(Rollback)이라고 한다.
// 3가지를 각각 예외처리 할 경우 뒤죽박죽 섞여버린다 => 트랜잭션관리 잘못하고 있는 것 => 3가지 전부 취소 될 수 있도록 롤백해서 트랜잭션관리를 잘하자

//수도코드(pseudocode) : 흉내내어 알고리즘 써놓은 코드. 알고리즘의 모델을 대략적으로 모델링하는 데 쓰인다.
/*
상품발송(){
    try{
        포장();
        영수증발행();
        발송();
        }catch(예외){
            모두취소(); //하나라도 실패시
        }
}
포장() throws 예외{
...
}

영수증발행() throws 예외{
...
}

발송() throws 예외{
...
}
*/


public class ExceptionStudy {
    public static void main(String[] args) {
        //FileNotFoundException
/*        BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
        br.readLine();
        br.close();*/

        //ArithmeticException
        int c;
        try{
            c = 4/0;
        }catch (ArithmeticException e){ //e는 ArithmeticException 클래스의 객체 e로 오류 객체에 해당한다. 오류 객체를 통해 해당 예외 클래스의 메서드를 호출할 수 있다.
            c = -1; //예외 발생시 이 문장 수행
        }

        //ArrayIndexOutOfBoundsException
/*        int[] a = {1,2,3};
        System.out.println(a[3]);*/


        ExceptionStudy es = new ExceptionStudy();
        int a;
        try{
            a = 4/0; //ArithmeticException 발생
            es.shouldBeRun(); //위 문장에서 예외 발생시 실행되지 않음
        }catch (ArithmeticException e){
            c = -1;
        }finally { //예외와 상관없이 무조건 수행해야 할 것들
            es.shouldBeRun();
        }

        es.sayNick("fool");
        es.sayNick("ㅋㅋ");

        try{
            es.sayNick2("fool2");
            es.sayNick("ㅋㅋ"); //위 문장에서 예외 발생시 실행되지 않음
        }catch (FoolException e){
            System.out.println("FoolException이 발생했습니다.");
        }



    }

    public void shouldBeRun(){
        System.out.println("ok thanks.");
    }

    //예외처리 만들어서 사용하기
    public void sayNick(String nick){
        //RuntimeException 상속 받은 경우
/*        if("fool".equals(nick)){
            //return; 메소드를 종료해 별명이 출력되지 못하도록 처리
            throw new FoolRuntimeException(); //nick 입력시 예외발생
        }
        System.out.println("당신의 별명은 " +nick+"입니다.");*/

        //Exception 상속 받은 경우
        try{
            if("fool".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch (FoolException e){
            System.err.println("FoolException 발생");
        }
    }

    public void sayNick2(String nick) throws FoolException{
        //호출 한 곳에서 예외처리 : 예외를 뒤로 미루고 호출시 예외처리를 해준다.
        if("fool2".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");

    }
}

//RuntimeException : 실행시 발생하는 예외
class FoolRuntimeException extends RuntimeException{

}
//Exception : 컴파일시 발생하는 예외
class FoolException extends Exception{

}
