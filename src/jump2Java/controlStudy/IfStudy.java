package jump2Java.controlStudy;

import java.util.ArrayList;

public class IfStudy {
    public static void main(String[] args) {

        ArrayList<String> pocket = new ArrayList();
        pocket.add("paper");
        pocket.add("phone");
        pocket.add("money");

        //if문
        if (pocket.contains("money")){
            System.out.println("택시를 타고 가라");
        }else{
            System.out.println("걸어가라");
        }

        //else if문
        if(pocket.contains("card")){
            System.out.println("버스를 타라");
        }else if(pocket.contains("money")){
            System.out.println("택시를 타라");
        }else{
            System.out.println("걸어가라");
        }

    }


}
