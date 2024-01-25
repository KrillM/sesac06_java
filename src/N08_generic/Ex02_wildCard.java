package N08_generic;

// 참고. Number 클래스
// Java의 모든 숫자 형식의 부모 클래스

// 제네릭 제한
// Number를 상속한 클래스만 허용
class Box<T extends Number>{
    private T item;
    public void setItem(T item){
        this.item = item;
    }
}

interface Movable{
    void move();
}

class Car implements Movable{
    @Override
    public void move(){
        System.out.println("테슬라 출발!");
    }
}

class Container<T extends Movable>{
    private T item;
    public Container(T item){
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}

public class Ex02_wildCard {
    public static void main(String[] args) {
//        Box<String> stringBox = new Box<String>();
        Box<Integer> integerBox = new Box<Integer>();
        Box<Double> doubleBox = new Box<Double>();

        Container<Car> carContainer = new Container<>(new Car());
        carContainer.makeItMove();
    }
}
