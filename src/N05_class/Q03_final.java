package N05_class;

import java.util.Scanner;

class Circle{
    static final double pi = Math.PI;

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

}
public class Q03_final {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle circle=new Circle();

        System.out.println("반지름을 입력하시오");
        int x=sc.nextInt();
        circle.setRadius(x);

        System.out.printf("원의 넓이: %.3f",(double)(circle.getRadius() * circle.getRadius() * Circle.pi));
    }
}
