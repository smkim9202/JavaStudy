package jump2Java.JavaPlusStudy;

//스트림 : 흐름이라는 뜻으로 데이터가 물결처럼 흘러가면서 필터링 과정을 통해 여러번 변경되어 반환된다.
//Arrays.stream 처럼 스트림을 생성하고 boxed, filter, distinct, sorted, mapToInt 처럼 스트림을 가공하고 toArray 처럼 스트림을 원하는 형태로 반환하는 방법에는 여러가지가 있다.
//배열 또는 컬렉션 인스턴스를 다루는 방법은 for




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class StreamStudy {
    public static void main(String[] args) {

        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};
        //data에서 int[] result = {8,6,4,2}; 출력하기


        //일반코드 작성
        //짝수만 포함하는 ArrayList 생성
        ArrayList<Integer> dataList = new ArrayList<>();
        for(int i=0; i<data.length; i++){
            if(data[i] % 2 ==0){
                dataList.add(data[i]);
            }
        }

        //Set을 사용하여 중복을 제거
        HashSet<Integer> dataSet = new HashSet<>(dataList);

        //Set을 다시 List로 변경
        ArrayList<Integer> distinctList = new ArrayList<>(dataSet);

        //역순으로 정렬
        distinctList.sort(Comparator.reverseOrder());

        //Integer 리스트를 정수 배열로 변환
        int[] result = new int[distinctList.size()];
        for (int i = 0; i < distinctList.size(); i++) {
            result[i] = distinctList.get(i);
        }
        System.out.println(result);


        //스트림 사용
        int[] result2 = Arrays.stream(data) //IntStream 생성 => 정수배열을 IntStream으로 생성
                .boxed() //IntStream을 Stream<Integer>로 변경 => IntStream을 Integer의 Stream으로 변경한다. 뒤에 사용 할 Comparator.reverserOrder은 원사타입 대신 Integer를 사용해야 하기 때문
                .filter((a) -> a % 2 == 0)//짝수만 필터링 => 람다함수로 a가 짝수인지 조사해서 해당 데이터만 필터링
                .distinct() //스트림에서 중복을 제거
                .sorted(Comparator.reverseOrder())//역순으로 정렬
                .mapToInt(Integer::intValue) //Stream<Integer>를 IntStream으로 변경
                .toArray() //ImtStream의 배열인 int[] 배열을 리턴한다.
                ;


        System.out.println(result2);


    }


}
