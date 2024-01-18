package N02_controlStatement;

import java.util.Scanner;

public class Q03_method {
    static double sum(double x, double y){
        return x+y;
    }

    static double min(double x, double y){
        return x-y;
    }

    static double mul(double x, double y){
        return x*y;
    }

    static double div(double x, double y){
        return x/y;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("두 개의 숫자를 입력하시오");
        double x=sc.nextDouble();
        double y=sc.nextDouble();

        System.out.println("덧셈 결과 " + sum(x, y));
        System.out.println("뺄셈 결과 " + min(x, y));
        System.out.println("곱셈 결과 " + mul(x, y));
        System.out.println("나눗셈 결과 "+ div(x, y));
    }
}
