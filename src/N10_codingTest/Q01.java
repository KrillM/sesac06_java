package N10_codingTest;

public class Q01 {

    static int sumLessThan(int[]x, int max){
        int total=0;
        for(int i=0;i<x.length;i++){
            if(x[i]<max)
                total+=x[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] x = {2, 5, 8, 3, 7};
        System.out.println(sumLessThan(x, 5));
    }
}
