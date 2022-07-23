// 2 base cases
// interate and check characters position
// create a box and check next state
// check can we win

public class FlipGameTwo294 {

    public boolean canWin(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i + 1) == '+') {
                String nextState = s.substring(0, i) + "--" + s.substring(i + 2);
                if (!canWin(nextState)) {
                    return true;
                }
            }
        }
        return false;
    }
}
