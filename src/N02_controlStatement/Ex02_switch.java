package N02_controlStatement;

import java.util.Scanner;

public class Ex02_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= -1;

        try{
            while (x!=0){
                System.out.println("1. 2. 0. 종료");
                x=sc.nextInt();

                switch (x){
                    case 1:
                        System.out.println("숫자 1");
                        break;
                    case 2:
                        System.out.println("숫자 2");
                        break;
                    case 0:
                        System.out.println("장비를 정지합니다.");
                        break;
                    default:
                        System.out.println("올바른 숫자를 누르세요.");
                        break;
                }
            }
        }
        catch (Exception e) {
            System.out.println("올바른 숫자를 입력하시오");
        }
    }
}
