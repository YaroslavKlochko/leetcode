
//cover base case;
// get previous and 2 elements from now

public class ClimbStairs70 {


    //0 2^n
    public int climbStairs1(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        return climbStairs1(n - 1) + climbStairs1(n - 2);
    }

    //----------------------------------------------------------------------------------------

    public int climbStairs2(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for (int i = 2; i < n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];
        }
        return mem[n - 1];
    }
}
