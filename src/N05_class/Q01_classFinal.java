package N05_class;

interface Flyable{
    void fly();
}

abstract class Vehicle{
    private String name;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void move();
}

class Car extends Vehicle{
    @Override
    public void move(){
        System.out.println("도로를 따라 이동 중");
    }
}

class Airplane extends Vehicle implements Flyable{
    @Override
    public void move(){
        System.out.println("하늘을 날아가는 중");
    }

    @Override
    public void fly(){
        System.out.println("고도 10000피트에서 비행 중");
    }
}

public class Q01_classFinal {
    public static void main(String[] args) {
        Vehicle[]vehicle=new Vehicle[2];
        vehicle[0] = new Car();
        vehicle[1] = new Airplane();

        for(int i=0;i< vehicle.length;i++){
            vehicle[i].move();

            if(vehicle[i] instanceof Flyable){
                ((Flyable) vehicle[i]).fly();
            }
        }

    }
}
