package N04_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Q02_imagineAllExceptions {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int input=-1;

        try{
            System.out.println("배열의 길이를 입력하시오.");
            input = sc.nextInt();

            if(input<=0){
                System.out.println("0 이하의 숫자로는 배열의 길이를 구할 수 없습니다.");
            }
            else{
                int[]x=new int[input];
                int total=0;
                for(int i=0;i<x.length;i++){
                    x[i]=r.nextInt(10)+1;
                    total+=x[i];
                }

                double avg = (double) total/x.length;

                System.out.println(Arrays.toString(x));
                System.out.printf("총합: %d, 평균 %.1f", total , avg);
            }
        }
        catch (InputMismatchException e){
            System.out.println("정수 외의 숫자는 입력할 수 없습니다.");
        }
    }
}
