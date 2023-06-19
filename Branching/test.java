import java.io.*;
import java.util.*;

class Solution {

    public boolean checkIsPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) {
                sum += i;
            }
        return n == sum;
    }

    public ArrayList<Integer> perfect(int n) {
        if (n == 1)
            return new ArrayList<Integer>();
        ArrayList<Integer> curr = perfect(n - 1);
        if (checkIsPerfect(n))
            curr.add(n);
        return curr;
    }
}

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Reading N and K
        String str = bufferedReader.readLine().trim();
        int n = Integer.parseInt(str);

        Solution solution = new Solution();
        ArrayList<Integer> result = solution.perfect(n);
        System.out.println(result);
    }
}