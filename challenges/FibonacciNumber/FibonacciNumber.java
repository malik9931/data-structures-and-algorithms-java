// package FibonacciNumber;

public class FibonacciNumber {
    static int recreFib(int n) {
        if (n <= 1)
            return n;
        // System.out.println("Hey - I'm busy looking at: " + n);
        return recreFib(n - 1) + recreFib(n - 2);
    }

    static int iteratFib(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1 */
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            /*
             * Add the previous 2 numbers in the series and store it
             */
            // System.out.println("Hey - I'm busy looking at: " + i);
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String args[]) {
        // By Recretion
        int n =13;
        System.out.println(recreFib(n));

        // By Iteration
        int x = 44;
        System.out.println(iteratFib(x));

    }

}
