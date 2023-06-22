package Array;

import java.util.Arrays;

public class NthLargest {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 67, 23 };
        int k = arr.length;
        int n = 3;
        Arrays.sort(arr);
        System.out.println(arr[k - 1 - n]);
    }
}
