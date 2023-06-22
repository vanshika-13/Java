package Array;

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 67, 23 };
        int n = arr.length;
        Arrays.sort(arr);
        System.out.println(arr[n - 4]);
    }
}
