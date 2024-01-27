package N09_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04_hashMap {
    public static void main(String[] args) {
        // 키 id, 값은 name 인 HashMap 예제

        // Map 컬렉션 생성
        Map<Integer, String> map= new HashMap<>();

        // 객체 저장
        map.put(1001, "노홍철");
        map.put(1002, "하동훈");
        map.put(1003, "정형돈");
        map.put(1004, "박명수");

        // 전체 객체 수
        System.out.println("총 " + map.size() + "명");

        // 키로 값을 얻기
        int key = 1003;
        String value = map.get(key);
        System.out.printf("%d인 학생은 %s입니다. %n", key, value);

        // 키와 값으로 구성된 모든 Map.Entry 객체를 Set 담아 리턴
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        Iterator<Map.Entry<Integer, String>> entryInteger = entrySet.iterator();
        while (entryInteger.hasNext()){
            Map.Entry<Integer, String> entry = entryInteger.next();
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.printf("%s 학생은 %d번 입니다. %n", v, k);
        }

        // 키 Set 컬렉샨을 얻고, 반복해서 키와 값 얻기
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
    }
}
