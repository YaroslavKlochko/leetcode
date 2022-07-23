// create pointer
// go over and count all capitals
// check 3 base cases in return statement

public class DetectCapital520 {

    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
        }
        return count == word.length() || count == 0 || count == 1 & Character.isUpperCase(word.charAt(0));
    }
}
