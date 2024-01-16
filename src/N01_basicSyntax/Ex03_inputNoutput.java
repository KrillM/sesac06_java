package N01_basicSyntax;

import java.util.Scanner;

public class Ex03_inputNoutput {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("공백으로 구분을 하여 이름/나이/키/결혼 여부를 입력하세요. >>");

        String name=sc.next();
        int age=sc.nextInt();
        double height = sc.nextDouble();
        boolean single =sc.nextBoolean();

        System.out.println("이름 "+name+", 나이 "+age+", 키: "+height+", 결혼 여부 "+single);
        sc.close();
    }
}
