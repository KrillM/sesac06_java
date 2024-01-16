package N02_controlStatement;

import java.util.Random;

public class Ex01_conditionalStatement {
    public static void main(String[] args) {
        Random r=new Random();
        int x=r.nextInt(10)+1;

        // 기본 자료형 조건문
        if(x%2==0){
            System.out.println(x+" is Even");
        }
        else{
            System.out.println(x+" is Odd");
        }

        String[]names = {"krille", "yena", ""};
        String name = names[r.nextInt(names.length)];

        // 참조 자료형 조건문
        if(name.equals(names[0])){
            System.out.println("Welcome "+names[0]);
        }
        else if(name.equals(names[1])){
            System.out.println("Welcome "+names[1]);
        }
        else{
            System.out.println("Who R U?");
        }

        /* 두 연산자 비교
        * ==: 두 객체의 '참조'를 비교한다. (동일한 메모리 위치를 가르키는지 확인한다.)
        * .equals(): 두 객체의 '내용'을 비교한다.
        * */

        // "문자열 리터럴"인 경우, Java 컴파일러가 문자열 풀(String pool)이라는 공유된 메모리 영역에 해당 문자열을 특별 저장한다.
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1 == str2); // 왼쪽의 코드가 true가 나오는 이유이기도 하다.
        System.out.println(str1.equals(str2));

        String str3 = "hi";
        System.out.println(str3 == str2);

        // 문자열이 "동적 할당"인 경우 new String("...") 사용하여 새로운 문자열 객체를 생성해 서로 다른 객체를 가르킨다.
        // 그러므로 문자열은 .equals()로 비교하는 것이 바람직하다.
        String str4 = new String("hi");
        System.out.println(str3 == str4); // 다른 메모리 주소를 가지기 때문에 위와 달리 false가 출력
        System.out.println(str3.equals(str4));

    }
}
