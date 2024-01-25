package N07_wrapper;

public class Ex01_boxing {
    public static void main(String[] args) {
        // boxing
        // - 기본 타입의 값을 포장 객체로 만드는 과정
        // - 포장 클래스 변수에 값이 대입될 때 발생
        Integer x = 100;
        Double y = 3.14;

        System.out.println(x.intValue()); // Integer 객체 내부의 int 값을 리턴
        System.out.println(y.doubleValue()); // Double 객체 내부의 double 값 리턴

        // unboxing
        // - 포장 객체에서 기본 타입 값을 얻는 과정
        // - 기본 타입 변수에 포장 객체가 대입될 때 발생
        int a = x;
        double b = y;
        System.out.println(a);
        System.out.println(b);
    }
}
