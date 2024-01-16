package N02_controlStatement;

import java.util.Scanner;

public class Q01_conditional {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int x=sc.nextInt();
//
//        if(x<=7){
//            System.out.println("유아");
//        } else if (x>=8 && x<=13) {
//            System.out.println("초등학생");
//        } else if (x>=14 && x<=16) {
//            System.out.println("중학생");
//        } else if (x>=17 && x<=19) {
//            System.out.println("고등학생");
//        } else{
//            System.out.println("성인");
//        }

        Scanner sc=new Scanner(System.in);
        String x=sc.next();

        if(x.equals("홍길동")){
            System.out.println("남자");
        } else if(x.equals("성춘향")){
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요");
        }

    }
}
