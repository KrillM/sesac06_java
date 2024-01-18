package N03_array;

import java.util.Arrays;

public class Ex03_arrayMethod {
    public static void main(String[] args) {

        // 원본 -> 1, 2
        int[]x={1,2,3,4,5};
        System.out.println(Arrays.toString(x));

        // 1. copyOF()
        // 순서대로: 복사할 배열, 어디까지(컴퓨터 숫자 + 1)
        int[]cp1 = Arrays.copyOf(x, 3);
        System.out.println(Arrays.toString(cp1));

        // 2. copyRange()
        // 순서대로: 복사할 배열, 시작 위치, 끝 위치 - 1
        int[]cp2 = Arrays.copyOfRange(x, 2,4);
        System.out.println(Arrays.toString(cp2));

        // 3. fill()
        int[]empty=new int[5];
        System.out.println(Arrays.toString(empty));
        Arrays.fill(empty, 7); // 전체 동일한 값으로 채운다
        System.out.println(Arrays.toString(empty));

        // 4. sort()
        int[]chaos = {7,2,9,3,4};
        Arrays.sort(chaos);
        System.out.println(Arrays.toString(chaos));

        // 5. equals()
        int[]a1 = {1,2,3};
        int[]a2 = {1,2,3};
        int[]a3 = {4,5,6};
        boolean arraysEqual1 = Arrays.equals(a1, a2);
        boolean arraysEqual2 = Arrays.equals(a1, a3);

        System.out.println(arraysEqual1); // true
        System.out.println(arraysEqual2); // false

        System.out.println(a1 == a2); // false
        System.out.println(a1 == a3); // false

        // 6. deepEquals()
        int[][]d1 = {{1,2},{3,4}};
        int[][]d2 = {{1,2},{3,4}};
        int[][]d3 = {{5,6},{3,4}};

        boolean deepEquals1 = Arrays.deepEquals(d1, d2);
        boolean deepEquals2 = Arrays.deepEquals(d1, d3);

        System.out.println(deepEquals1); // true
        System.out.println(deepEquals2); // false

        boolean deepEquals3 = Arrays.equals(d2[1], d3[1]);
        System.out.println(deepEquals3); // true

        // 7. binarySearch()
        int[]sa = {10,30,50,70,90};
        int idx = Arrays.binarySearch(sa, 70);
        System.out.println(idx);
    }
}
