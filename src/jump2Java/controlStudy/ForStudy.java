package jump2Java.controlStudy;

import java.util.ArrayList;
import java.util.Arrays;

public class ForStudy {
    public static void main(String[] args) {
        //for문
        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        }

        //for each문으로 변경
        for(Integer mark: marks){
            System.out.println(mark);
        }

        //for- continue문
        int[] marks2 = {90, 25, 67, 45, 80};
        for(int i=0; i<marks2.length; i++) {
            if (marks2[i] < 60) {
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        }

        //이중 for문
        for(int i=2; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

        //for each문
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one","two","three"));
        for(String number: numbers){
            System.out.println(number);
        }
    }

}
