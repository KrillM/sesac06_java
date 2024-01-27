package N10_codingTest;

public class Q03 {

    static int search(int[]x, int target){
        int start = 0;
        int end = x.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x[mid] == target) {
                return mid;
            } else if (x[mid] >= x[start]) {
                if (target >= x[start] && target < x[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target <= x[end] && target > x[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]x= {3, 4, 5, 6, 7, 8, 0, 1, 2};
        int target = 0;
        System.out.println(search(x, target));
    }
}
