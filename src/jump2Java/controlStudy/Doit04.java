package jump2Java.controlStudy;


/*
 * Jump To Java 04장 연습문제
 * */
public class Doit04 {
    public static void main(String[] args) {
        //Q2. while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
        System.out.println("Q2.");

        int result = 0;
        int n = 1;
        while(n <= 1000){
            if (n % 3 == 0){
                result += n;
            }
            n += 1;
        }
        System.out.println(result);

        //Q3. * 찍기(for문 while문)
        System.out.println("Q3.");

        for(int i=1; i<6; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int i = 0;
        while(true){
            i += 1;
            if (i >5){
                break;
            }
            for (int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Q4. for문을 사용해 1부터 100까지의 숫자를 출력 => hup 구하기
        System.out.println("Q4.");

//        for (int j = 1; j < 101; j++) {
//            System.out.println(j);
//        }

        int hup = 0;
        for(i=1; i<=100; i++){
            hup += i;
        }
        System.out.println(hup);

        //Q5. A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다. for each 문을 사용하여 A 학급의 평균 점수 구하기
        System.out.println("Q5.");
        int[] marks = {70, 60, 55, 75, 95, 90, 80, 80, 85, 100};

        int total = 0;
        for (int mark: marks){
            total += mark;
         }
        float avg = (float) total/marks.length;
        System.out.println(avg);

        int total2 =0;
        for(i=0; i<marks.length; i++){
            int mark = marks[i];
            total2 += mark;
        }
        float avg2 = (float) total2/marks.length;
        System.out.println(avg2);

    }

}
