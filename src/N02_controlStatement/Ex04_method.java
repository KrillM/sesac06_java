package N02_controlStatement;

public class Ex04_method {

    // call by value: 값 전달
    public static int mul(int x, int y, int z){
        return x*y*z;
    }

    // call by reference: 참조 전달
    public static int sum(int[]x){
        int hap = 0;
        for(int i=0; i<x.length; i++){
            hap += x[i];
        }
        return hap;
    }

    public static void main(String[] args) {

        // call by value
        System.out.println(mul(2, 3, 5));

        // call by reference
        int[]x=new int[100];
        for(int i=0;i<x.length;i++){
            x[i]=i+1;
        }
        System.out.println(sum(x));
    }
}
