package N07_wrapper;

// 포장 값 비교
// - 포장 객체 내부 값을 비교하기 위해 ==, !=는 불가능
// - equals() 메소드를 통해 내부 값을 비교
// 다만, 특정 범위에 포함되는 값은 포장 객체에 공유된다 (같은 참조값)
// 대부분의 포장 클래스에는 "parse + 기본타입" 명으로 된 static 메소드가 존재 => 기본 타입으로 변환할 때 사용

public class Ex02_valueCompare {
    public static void main(String[] args) {
        // int일때 -128~127 이내 값을 가지는 경우 같은 주소를 공유한다.
        Integer x = 10;
        Integer y = 10;
        System.out.printf("%d == %d : %b%n", x, y, x==y); // true

        Integer a1 = 1000;
        Integer a2 = 1000;
        System.out.println(a1.equals(a2));
    }
}
