public class SupPow {
    static int base = 1337;

    public static int superPow(int a, int[] b) {
        return superPow(a, b, b.length - 1);
    }

    public static int superPow(int a, int[] b, int index) {
        if (index == 0)
            return pow(a, b[index]) % base;
        int pre = superPow(a, b, index - 1);
        return (pow(pre, 10) * pow(a, b[index])) % base;
    }

    public static int pow(int x, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return x % base;
        int half = pow(x, n / 2);
        if (n % 2 == 0)
            return (half * half) % base;
        else
            return (((half * half) % base) * (x % base)) % base;
    }

    public static void main(String args[]) {
        int arr[] = { 33, 3, 4, 5 };
        System.out.println(superPow(4, arr));
    }
}
