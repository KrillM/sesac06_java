package N05_class;

class Calculator{
    static double pi = Math.PI;

    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }
}

public class Ex01_static {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double circleArea = num1 * num2 * Calculator.pi;
        int plus = Calculator.plus(num1, num2);
        int minus = Calculator.minus(num1, num2);

        System.out.printf("원 넓이 %f ,", circleArea);
        System.out.printf("더하기 %d ,", plus);
        System.out.printf("빼기 %d", minus);
    }
}
