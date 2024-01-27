package N09_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03_hashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("apple");
        set1.add("banana");
        set1.add("candy");
        set1.add("apple"); // set은 중복이 불가능하다

        System.out.println(set1); // [banana, apple, candy]

        // 저장된 객체 개수 출력
        System.out.println("총 "+set1.size()+"종류의 과일이 있습니다.\n");

        ///////////////////////////////////
        // Course 클래스 정의 후
        Set<Course> set2 = new HashSet<>();

        // 객체 저장
        Course java = new Course(101, "Java");
        Course js1 = new Course(102, "JavaScript");
        Course js2 = new Course(102, "JavaScript");
        System.out.println(java.hashCode()); // 2301607
        System.out.println(js1.hashCode()); // 1266328083
        System.out.println(js2.hashCode()); // 1266328083
        System.out.println(js1.equals(js2)); // true

        set2.add(java);
        set2.add(js1);
        set2.add(js2); // 인스턴스는 다르지만 동등한 값, 객체이므로 객체 한 개만 저장하였다.

        // 저장된 객체 개수 출력
        System.out.println("총 " + set2.size() +"종류의 과정이 있습니다."); // 2

        // 전체 요소 출력
        // case 1. 반복문 사용
        System.out.println("=== 반복문으로 Set 객체 출력 ===");
        for(Course c : set2)
            System.out.println(c);

        // case 2. iterator() 메소드로 반복자를 얻어서 객체 하나씩 가져오는 방법
        // Iterator (반복자)가 제공하는 메소드
        // - boolean hasNext(): 가져올 객체가 있으면 true, 없으면 false
        // - E next(): 컬렉션에서 하나의 객체를 가져옴
        // - void remove(): next()로 가져온 객체를 Set, 컬렉션에서 제거

        System.out.println("=== Iterator로 Set 객체 출력 ===");
        Iterator<Course> iterator =  set2.iterator();
        while (iterator.hasNext()){
            Course c = iterator.next();
            System.out.println(c);
        }

    }
}
