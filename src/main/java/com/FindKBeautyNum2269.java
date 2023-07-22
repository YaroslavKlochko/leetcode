public class FindKBeautyNum2269 {
    public int divisorSubstrings(int num, int k) {
        int i = 0, j = 0, len = num, count = 0;
        StringBuilder str = new StringBuilder();
        while (len != 0) {
            str.append(len % 10);
            len /= 10;
        }
        String stri = str.reverse().toString();
        while (j < stri.length()) {
            if (j - i + 1 < k)
                j++;
            else if (j - i + 1 == k) {
                int n = Integer.parseInt(stri.substring(i, (j + 1)));
                if (n != 0) {
                    if (num % n == 0)
                        count++;
                }
                i++;
                j++;
            }
        }
        return count;
    }
}
