public class BinaryNumsWithAltBits693 {
    public boolean hasAlternatingBits(int n) {
        while (n != 0) {
            int a = (n & 1);
            n >>= 1;
            int b = (n & 1);
            if (a == b)
                return false;
        }
        return true;
    }
}
