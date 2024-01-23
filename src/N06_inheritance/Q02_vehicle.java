package N06_inheritance;

class Vehicle{
    private String brand;
    private String color;
    private String model;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void print(){
        System.out.println("오빠차 뽑았다 널 데리러가");
    }
}

class Car extends Vehicle{
    @Override
    public void print(){
        System.out.println(getSpeed()+"km/h로 달리는 "+getColor()+" "+getBrand());
    }
}

class Truck extends Vehicle{
    @Override
    public void print(){;
        System.out.println(getSpeed()+"km/h로 달리는 "+getBrand()+" "+getModel());
    }
}

public class Q02_vehicle {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        car.setBrand("테슬라");
        car.setColor("검은");
        car.setSpeed(160);
        car.print();

        truck.setBrand("현대");
        truck.setSpeed(120);
        truck.setModel("포터");
        truck.print();
    }
}
