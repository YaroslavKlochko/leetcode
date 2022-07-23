// create 3 pointers
// double iteration and check the letters
// reverse and return

public class ReverseOnlyLetters917 {

    String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }
            while (right > left && !Character.isLetter(s.charAt(right))) {
                right--;
            }
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = chars[temp];
        }
        return new String(chars);
    }
}
