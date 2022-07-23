public class FibonacciDpAlgorithm {

    public int fibonacciNum(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciNum(n - 1) + fibonacciNum(n - 2);
    }
}
