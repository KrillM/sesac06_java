package N01_basicSyntax;

public class Ex04_operator {
    public static void main(String[] args) {
        int x, y;
        double a, b;

        x =10; y=5; a=2.3; b =1.2;

        System.out.println("정수형 연산자");
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);

        System.out.println();

        System.out.println("실수형 연산자");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println();

        System.out.println("증감 연산자");

        for(int i=0;i<20;i++){
            x++;
            a++;
        }
        System.out.println(x);
        System.out.println(a);

        System.out.println();

        System.out.println("산술 대입 연산자");
        y-=2;
        System.out.println(y);

        System.out.println();

        System.out.println("비교 연산자");
        System.out.println(x>y);
        System.out.println(x<y);

        System.out.println();

        System.out.println("논리 연산자");
        boolean j = true;
        boolean k = false;
        boolean l = true;

        System.out.println(j && k);
        System.out.println(j && l);
        System.out.println(j || k);
        System.out.println(k || l);
        System.out.println(!k);

        System.out.println();

        System.out.println("삼항 연산자");
        System.out.println(x>y ? x:y);
        System.out.println(x<y ? x:y);

    }
}
