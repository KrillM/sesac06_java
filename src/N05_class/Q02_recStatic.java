package N05_class;

import java.util.ArrayList;
import java.util.Scanner;

class Nemo{
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int calculate() {
        return getHeight() * getWidth();
    }
}

public class Q02_recStatic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Nemo>nemos=new ArrayList<>();

        while(true){
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x==0 && y==0){
                for (Nemo nemo : nemos) {
                    System.out.println("가로 길이는: " + nemo.getWidth());
                    System.out.println("세로 길이는: " + nemo.getHeight());
                    System.out.println("넓이는: " + nemo.calculate());
                    System.out.println("-------------------------");
                }
                break;
            }

            Nemo nemo = new Nemo();
            nemo.setWidth(x);
            nemo.setHeight(y);
            nemos.add(nemo);
        }

        System.out.println("Rectangle 인스턴스 개수는: "+(nemos.size()));
    }
}
