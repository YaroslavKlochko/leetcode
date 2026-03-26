public class MinAddToMakeParenthesisValid921 {
    public int bracketMatch(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int needLeft = 0;
        int needRight = 0;

        for(char c : s.toCharArray()) {
            if(c == '(') {
                needRight++;
            } else if(c == ')') {
                if(needRight > 0) {
                    needRight--;
                } else {
                    needLeft++;
                }
            }
        }
         return needLeft + needRight;
    }
}
