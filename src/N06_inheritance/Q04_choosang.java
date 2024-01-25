package N06_inheritance;

import java.util.ArrayList;

abstract class Shape{
    private String color;
    private String type;

    abstract void calculateArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}

class Circle extends Shape{
    private final double pi = Math.PI;

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle(String type, String color, int radius){
        setType(type);
        setColor(color);
        setRadius(radius);
    }

    @Override
    public void calculateArea(){
        System.out.println("=== "+getType()+" 정보 ===");
        System.out.println("도형의 색상: "+getColor());
        System.out.println("도형의 넓이: "+(double)(pi * getRadius() * getRadius()));
    }
}

class Rectangle extends Shape{

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

    Rectangle(String type, String color, int width, int height){
        setType(type);
        setColor(color);
        setWidth(width);
        setHeight(height);
    }

    @Override
    public void calculateArea(){
        System.out.println("=== "+getType()+" 정보 ===");
        System.out.println("도형의 색상: "+getColor());
        System.out.println("도형의 넓이: "+(getWidth() * getHeight()));
    }
}

public class Q04_choosang {
    public static void main(String[] args) {
        ArrayList<Shape> shape = new ArrayList<>();
        shape.add(new Circle("Circle", "Red", 5));
        shape.add(new Rectangle("Rectangle", "Blue", 4, 5));

        for(Shape i : shape){
            i.calculateArea();
        }
    }
}
