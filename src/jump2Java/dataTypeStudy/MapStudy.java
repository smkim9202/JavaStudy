package jump2Java.dataTypeStudy;

import java.util.HashMap;

public class MapStudy {
    public static void main(String[] args) {
        //대응관계를 쉽게 표현 할 수 있게 해주는 자료형으로 사전(dictionary)과 비슷하다.
        //key와 value을 한 쌍으로 갖는 자료형이다. key 중복불가, value 중복가능
        //배열,리스트 : sequential(순차적)으로 해당 요소 값을 구함
        //맵 : key를 통해 value을 얻는다.

        //Map(인터페이스) - HashMap, LinkedHashMap, TreeMap, HashTable

        //HashMap 생성 후 항목값 입력하기 => put()
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("cat", "고양이");

        //key에 해당하는 value값 얻기 => get(key)
        System.out.println(map.get("java")); //key에 해당하는 value이 없을 경우 null 출력
        //key에 해당하는 value값 없을 경우 디폴트 값 지정하기 => getOrDefault()
        System.out.println(map.getOrDefault("coke", "콜라"));

        //key가 있는지 조사하기 => containsKey(key)
        System.out.println(map.containsKey("people")); //존해하면 true 존재하지 않으면 false 리턴

        //key값에 해당하는 항목(아이텐 key,value)을 삭제한 후 value값 리턴 => remove()
        System.out.println(map.remove("baseball"));

        //Map의 갯수를 리턴 => size
        System.out.println(map.size());

        //모든 key값 Set자료형으로 리턴 => keySet()
        System.out.println(map.keySet());

        //Map의 가장 큰 특징 : 순서에 의존하지 않고 key와 value을 가지고 옴
        //LinkedHashMap, TreeMap => Map에 입력된 순서대로 데이터를 가져오고 싶은 경우. key에 의해 소트된 데이터를 가져오고 싶은 경우
        //LinkedHashMap : 입력된 순서대로 데이터를 저장
        //TreeMap : 입력된 key의 오름차순 순서대로 데이터를 저장
    }
}