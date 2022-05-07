package jump2Java.JavaPlusStudy.sub;
//접근제한자

import jump2Java.JavaPlusStudy.AccessModifierStudy;


class PublicVar{
    AccessModifierStudy ams = new AccessModifierStudy();
    String printAmsInfo = ams.info; //public : AccessModifierStudy클래스의 info 사용 가능! public 접근제한자를 사용해서 어디서든 사용가능.
}

public class AccessEx extends AccessModifierStudy { //AccessModifierStudy 클래스를 상속했다.
    public static void main(String[] args){
        //protected : 해당 패키지 & 해당 클래스를 상속받은 다른 패키지의 클래스에서 접근 가능하다.
        AccessEx ae = new AccessEx();
        System.out.println(ae.lastname); // protected : AccessModifierStudy클래스의 lastname 사용 가능! protected 접근제한자를 사용했고, 다른 패키지지만 해당 클래스를 상속 받았기 때문..


    }

}
