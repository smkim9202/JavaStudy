package jump2Java.JavaPlusStudy;

// 접근제어자 : 변수나 메소드의 사용 권한을 설정 할 수 있다.
// 변수, 클래스, 메소드 모두가 접근제어자 규칙에 따른다.
// 접근 허용 범위 순위 : private => default => protected => public
//  private : 해당 클래스에서만 접근 가능
//  default : 해당 패키지 내에서만 접근 가능
//  protected : 해당 패키지 & 해당 클래스를 상속받은 다른 패키지에서만 접근 가능
//  public : 어떤 클래스도 접근 가능하다.

//private : private으로 설정한 변수와 메소드는 오직 이 클래스에서만 접근이 가능하다.
class Sample{
    private String secret;
    private String getSecret() {
        return this.secret;

    }
}


//default : 해당 패키지 내에서만 접근이 가능하다.
class HouseKim{
    //접근제한자를 생략하고 사용시 default 접근제어자로 설정된다.
    String lastname = "kim";
}




public class AccessModifierStudy {
    //protected : 해당 패키지 & 해당 클래스를 상속받은 다른 패키지의 클래스에서 접근 가능하다. => sub패키지 AccessEx.java
    protected String lastname = "park";
    //public : 어떤 클래스도 접근 가능하다.
    public String info = "this is public message";

    public static void main(String[] args){
        //default 접근제한자 : 같은 패키지에서 해당 변수, 메서드에 접근이 가능하다.
        HouseKim hKim = new HouseKim();
        System.out.println(hKim.lastname); //default : hkim클래스의 lastname 사용 가능! default 접근제한자를 사용했고, 같은 패키지 안에 있기 때문..


    }

}
