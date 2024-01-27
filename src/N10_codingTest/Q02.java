package N10_codingTest;

import java.util.HashMap;

public class Q02 {
    static int[]findIndices(int[]x, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            int complement = target - x[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(x[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] x = {3, 2, 5, 7, 11};
        int target = 9;
        int [] result = findIndices(x, target);
        System.out.println("[" + result[0] +", " +  result[1] + "]");
    }
}
