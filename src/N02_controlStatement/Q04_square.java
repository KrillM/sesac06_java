package N02_controlStatement;

import java.util.Scanner;

public class Q04_square {

    static double square(double x){
        return x*x*Math.PI;
    }

    static void square(int x, int y){
        System.out.println("사각형 넓이: " + (double)(x*y));
    }

    static double square(double x, double y){
        return (x*y)/2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("원의 반지름을 적으시오");
        double a =sc.nextDouble();

        System.out.println("사각형의 가로 길이와 세로 길이를 적으시오");
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("삼각형의 가로 길이와 세로 길이를 적으시오");
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        System.out.println("----------------------------------");
        System.out.println("원의 넓이: "+square(a));
        square(b, c);
        System.out.println("삼각형의 넓이: "+square(d, e));

    }
}
