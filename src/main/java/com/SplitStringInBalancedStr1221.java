public class SplitStringInBalancedStr1221 {
    public int balancedStringSplit(String s) {
        int balancedCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == 'R') {
                count++;
            } else if (current == 'L') {
                count--;
            }
            if (count == 0) {
                balancedCount++;
            }
        }
        return balancedCount;
    }
}
