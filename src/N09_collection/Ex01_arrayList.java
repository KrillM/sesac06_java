package N09_collection;

import java.util.ArrayList;
import java.util.List;

public class Ex01_arrayList {
    public static void main(String[] args) {
        // ArrayList 컬렉션 생성
        List<Book> list =  new ArrayList<>();
        list.add(new Book("데미안", "헤르만 헤세"));
        list.add(new Book("레 미제라블", "빅토르 위고"));
        list.add(new Book("죄와 벌", "도스토옙스키"));
        list.add(new Book("전쟁과 평화", "톨스토이"));
        System.out.println(list);

        // 리스트 개수 얻기
        int size = list.size();
        System.out.printf("총 %d권의 책이 존재합니다 %n%n", size);

        // 특정 인덱스 객체 가져오기
        Book thirdBook = list.get(2);
        System.out.println(thirdBook);

        // 인덱스로 특정 객체 삭제
        list.remove(2);
        for(Book b : list)
            System.out.println(b);

        // 모든 객체 삭제
        System.out.println("객체가 비어있나요? "+ list.isEmpty());
        list.clear();
        System.out.println("객체가 비어있나요? "+ list.isEmpty());

    }
}
