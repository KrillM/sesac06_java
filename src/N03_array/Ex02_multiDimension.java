package N03_array;

import java.util.Arrays;

public class Ex02_multiDimension {

    public static void main(String[] args) {
        int[][]x=new int[5][5];
        int num=1;

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++) {
                x[i][j] = num;
                System.out.print(x[i][j]+"\t");
                num++;
            }
            System.out.println();
        }

        System.out.println();

        // 배열 복사
        int[]origin = {1,2,3};
        int[]newOne = new int[5];

        // 1. for문
        for(int i=0;i<origin.length;i++){
            newOne[i]=origin[i];
        }
        System.out.println(Arrays.toString(newOne));

        // 2. arraycopy()
        newOne=new int[5];
        System.arraycopy(origin, 0, newOne, 2, origin.length);
        // 순서대로: 복사할 배열, 복사할 배열 시작 위치, 넣을 배열 위치, 어디까지 출력할 것인지
        System.out.println(Arrays.toString(newOne));
    }
}
