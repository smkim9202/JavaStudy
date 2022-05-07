package jump2Java.dataTypeStudy;

public class EumStudy {
    //서로 관련이 있는 여러 개의 상수 집합을 정의 할 때 사용하는 자료형
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };



    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO); //AMERICANO 출력

        System.out.println("*********************************************************************");

        for(CoffeeType type:CoffeeType.values()){
            System.out.println(type);
        }

        System.out.println("*********************************************************************");

        /**
         * 오늘 판매된 커피의 갯수를 리턴하는 메소드이다.
         * @param type 커피의 종류 (CoffeType)
         *
         *
         *
         */

        //int countSellCoffee(CoffeType type){
        //    int americano = countSellCoffee(CoffeType.AMERICANO);// 아메리카노의 오늘 판매갯수
        //}

    }

}
