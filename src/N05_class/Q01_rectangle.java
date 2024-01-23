package N05_class;

import java.util.ArrayList;
import java.util.Scanner;

class Rectangle{
    private int width;
    private int height;

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWidth(int x){
        this.width=x;
    }

    public void setHeight(int y){
        this.height=y;
    }

    Rectangle(int width, int height){
        setWidth(width);
        setHeight(height);
    }

    public void calculate() {
        System.out.println("가로 길이는: "+getWidth());
        System.out.println("세로 길이는: "+getHeight());
        System.out.println("넓이는: "+getHeight()*getWidth());
        System.out.println("-------------------------");
    }
}

public class Q01_rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Rectangle>rec=new ArrayList<>();

        while(true){
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int x= sc.nextInt();
            int y=sc.nextInt();

            if(x==0 && y==0){
                for(int i=0;i<rec.size();i++)
                    rec.get(i).calculate();
                break;
            }
            rec.add(new Rectangle(x,y));
        }

        System.out.println("Rectangle 인스턴스 개수는: "+(rec.size()));
    }
}
