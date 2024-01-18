package N03_array;

// Collection Framework
// 객체를 효율적으로 추가, 삭제, 검색할 수 있도록 관련 인터페이스와 클래스를 java.till에 포함

// List - ArrayList | Set - HashSet, TreeSet | Map - HashMap, HashTable, TreeMap

// ArrayList class
// - List Collection에서 가장 많이 사용한다.
// - 표준 배열보다 조금 느리나 많은 조직이 필요할 경우 유용하다.
// - 동적 할당이므로 크기를 미리 지정하지 않아도 된다.
// - 객체 자체를 저장하는 것이 아닌 번지를 저장한다
// -> 동일한 객체를 중복 저장할 수 있다. 그러므로 동일한 번지수가 저장될 수 있으므로 NULL도 가능하다.

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04_arrayList {

    public static void main(String[] args) {
        // 1. 정수형 ArrayList 생성
        ArrayList<Integer> jungsu = new ArrayList<>();

        // 2. 요소 추가
        jungsu.add(10);
        jungsu.add(20);
        jungsu.add(30);

        // 3. 요소 접근
        int print = jungsu.get(1);
        System.out.println(print); // 20

        // 4. 요소 수정
        jungsu.set(0, 40);
        System.out.println(jungsu);

        // 5. 요소 삽입
        jungsu.add(1, 50);
        System.out.println(jungsu);

        // 6. 요소 삭제
        jungsu.remove(jungsu.size()-1);
        System.out.println(jungsu);

        // 7. ArrayList 연결
        System.out.println(Arrays.asList(1,2,3));
        jungsu.addAll(Arrays.asList(1,2,3));
        System.out.println(jungsu);

        // 8. 위치 찾기
        System.out.println(jungsu.indexOf(20));

        // 9. 전부 보기
        for(Integer i : jungsu){
            System.out.print(i+" ");
        }

        // 10. 전체 삭제
        jungsu.clear();
        System.out.println("\n"+jungsu);
    }
}