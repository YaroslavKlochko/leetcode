public class TopUpDpAlgorithm {

    public int fib(int[] memory, int n) {
        if (memory[n] == 0) {
            if (n < 2) {
                memory[n] = n;
            } else {
                int left = fib(memory, n - 1);
                int right = fib(memory, n - 2);
                memory[n] = left + right;
            }
        }
        return memory[n];
    }
}
