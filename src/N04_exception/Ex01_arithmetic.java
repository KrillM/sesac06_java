package N04_exception;

import java.util.Scanner;

public class Ex01_arithmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요.");
        int x=-1;
        int y=-1;

        try{
            x=sc.nextInt();
            y=sc.nextInt();

            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 있는 숫자는 존재하지 않습니다.");
        }
    }
}
