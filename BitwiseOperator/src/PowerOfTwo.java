public class PowerOfTwo {
    public static void main(String[] args) {

        int n = 8;

        boolean ans = isPowerOfTwo(n);

        System.out.println(ans);
    }

    static boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;

    }
}