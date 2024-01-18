package N03_array;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_arrayAvg {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]x=new int[5];

        int total=0;
        for(int i=0;i<x.length;i++){
            System.out.println("숫자 "+(i+1)+"입력");
            x[i]=sc.nextInt();
            total += x[i];
        }
        double avg = (double) total/x.length;

        System.out.println(Arrays.toString(x));
        System.out.printf("평균 %.1f", avg);
    }
}
