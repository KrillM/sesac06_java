package N08_generic;

class Calculator<T extends Number> {
    private T num1;
    private T num2;

    public Calculator(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }

}

public class Q02_generic2 {
    public static void main(String[] args) {
        Calculator<Integer> calculator1 = new Calculator<>(1, 1);
        Calculator<Double> calculator2 = new Calculator<>(2.14, 1.0);
        System.out.println("Integer Sum: "+ calculator1.add());
        System.out.println("Double Sum: "+ calculator2.add());
    }
}
