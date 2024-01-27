package N09_collection;

import java.util.*;

public class Q01_collection {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map<String, Integer> map= new HashMap<>();
        System.out.println("이름과 나이를 입력하세요. \'종료\'를 입력하면 종료됩니다.");

        while (true){
            System.out.println("이름 입력: ");
            String name = sc.next();

            if(name.equals("종료")){
                Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

                Iterator<Map.Entry<String, Integer>> entryInteger = entrySet.iterator();
                while (entryInteger.hasNext()){
                    Map.Entry<String, Integer> entry = entryInteger.next();
                    String k = entry.getKey();
                    Integer v = entry.getValue();
                    System.out.printf("이름: %s, 나이: %d %n", k, v);
                }
                break;
            }
            System.out.println("나이 입력: ");
            int age = sc.nextInt();
            map.put(name, age);

        }
    }
}
