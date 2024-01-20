package N04_exception;

import java.util.*;

public class Q03_arrayLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=-1;

        try{
            System.out.println("배열의 크기를 입력하세요.");
            x=sc.nextInt();
            if(x<=0){
                System.out.println("0 이하의 숫자로 배열의 크기를 정할 수 없습니다.");
            }
            else{
                int[]arr=new int[x];
                try{
                    for(int i=0;i<arr.length;i++){
                        arr[i] = sc.nextInt();
                    }

                    System.out.println(Arrays.toString(arr));

                    for(int i=0;i<arr.length;i++){
                        for(int j=0;j<i;j++){
                            if(arr[j]==arr[i]){
                                System.out.print(arr[i]+" ");
                            }
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("정수 외에는 입력할 수 없습니다.");
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("정수 외에는 입력할 수 없습니다.");
        }
    }
}
