// create 2 pointers
// create temporary box
// replace characters

public class ReverseString344_1 {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
//----------------------------------------------------------------------------------------------------

    public void reverseStringTest(char[] s) {
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = temp;
        }
    }
//----------------------------------------------------------------------------------------------------

    public static String reverseString(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        char[] test = {'a', 'b', 'c', 'd', 'e'};
    }
}
