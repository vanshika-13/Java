public class MissingNum {
    static int missingNumber(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += array[i];
        }
        int val = n * (n + 1) / 2;
        return val - sum;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 6 };
        System.out.println(missingNumber(arr, 6));
    }
}
