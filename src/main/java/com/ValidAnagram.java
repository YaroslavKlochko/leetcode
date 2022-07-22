public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("abba", "acca"));
    }
// The idea is simple. It creates a size 26 int arrays as buckets for each letter in alphabet.
// It increments the bucket value with String s and decrement with string t.
// So if they are anagrams, all buckets should remain with initial value which is zero. So just checking that and return

    static boolean isAnagram(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            alphabet[t.charAt(i) - 'a']--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
//        int[] alphabet = new int[26];
//        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
//        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
//        for (int i : alphabet) if (i != 0) return false;
//        return true;
    }
}