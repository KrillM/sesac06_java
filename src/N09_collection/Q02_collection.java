package N09_collection;

import java.util.*;

public class Q02_collection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");

        while (true){
            System.out.println("정수 입력: ");
            int x = sc.nextInt();

            if(x == -1){
                System.out.println("중복 제거된 정수 목록: "+set);
                break;
            }
            set.add(x);
        }
    }
}
