package jump2Java.javaPrograming;
//게시판 페이징하기 : 한 페이지에 보여 줄 게시물 입력시 총 페이지 수 출력하는 프로그램
//  메소드 이름은? getTotalPage
//  입력 받는 값은? 게시물의 총 건수(m), 한 페이지에 보여 줄 게시물 수(n)
//  출력하는 값은? 총 페이지 수
//  총페이지수 = (m / n) + 1

public class Problem2 {
    static int getTotalPage(int m, int n){
        if (m % n == 0){
            return m / n;
        }else{
            return m / n + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getTotalPage(15,10));
        System.out.println(getTotalPage(10,10));
    }

}


