package N02_controlStatement;

import java.util.Scanner;

public class Q02_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int x=sc.nextInt();

        for(int i=1;i<=x;i++){
            System.out.print(i+"  ");
        }
    }
}
