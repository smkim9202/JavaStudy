package jump2Java.JavaPlusStudy;

//패키지(package) : 클래스들을 모아 놓은 자바의 디렉토리
//서브 패키지(subpackage) : 패키지 안에 하위 패키지를 만들어서 사용한다. => 패키지명.서브패키지명
//패키지 사용하기 : 다른 클래스에서 클래스를 사용하려면 import 해야하는데 import 패키지명.* 방식으로 import를 하면 패키지 안에 있는 클래스를 전부 사용할 수 있다.
//패키지 사용하는 이유 : 비슷한 성격의 클래스를 묶을 수 있어 클래스 분류가 용이해진다. 클래스명이 동일한 경우에도 패키지명이 다르면 충돌없이 사용 가능하다. 배포용 자바 클래스는 반드시 패키지명을 포함하는 것이 올바른 방법이다.

public class PackageStudy {
    public static void main(String[] args){
        System.out.println("PackageStudy클래스는 JavaPlusStudy 패키지 안에 있다.");
    }
}
