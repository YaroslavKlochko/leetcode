import java.util.Stack;

// create a box
// iterate and add to each pair
// initialize break statement

public class ValidParenthesis20_1 {

    public static boolean isValidTest(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValidTest("()(){}[(])");
    }

    public boolean isValid(String s) {
        int length;

        do {
            length = s.length();
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
        } while (length != s.length());

        return s.length() == 0;
    }
}
