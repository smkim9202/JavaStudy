package jump2Java.javaPrograming;
//1000미만의 자연수에서 3의 배수와 5의 배수의 총합을 구하라
//  입력받는 값은? 1~999(1000미만의 자연수)
//  출력하는 값은? 3의배수와 5의 배수의 총합
//  생각해 볼 것은? 배수찾는법 - %(나머지구하는연산자), 중복숫자제거 - ||(또는 연산자)

public class Problem1 {
    public static void main(String[] args) {

        int result = 0;
        // 입력 구하기 (1~999) => for문
        for (int n = 1; n<1000; n++){
            if(n % 3 == 0 || n % 5 == 0){ // 3의 배수 구하기
                result += n; //더해주기
            }

        }
        System.out.println("3과 5의 배수 총합 => " + result);

    }

}
