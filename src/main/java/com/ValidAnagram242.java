// base case
// create a box for alphabet
// go through each and match the indices
// iterate and check the anagram

public class ValidAnagram242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i : counts) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        // Step 1: If lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create a map to count the frequency of each character
        Map<Character, Integer> countMap = new HashMap<>();

        // Step 3: Count characters in string s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // Get current character from s
            // Increment count for this character, or set to 1 if not present
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Step 4: Reduce counts using characters in t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i); // Get current character from t
            // Decrement count (if key exists, subtract 1, otherwise start from -1)
            countMap.put(c, countMap.getOrDefault(c, 0) - 1);
            // Early return: If any count goes below zero, t has more of this char than s
            if (countMap.get(c) < 0) {
                return false;
            }
        }

        // Step 5: Ensure all counts are zero (all chars matched)
        for (int count : countMap.values()) {
            if (count != 0) {
                return false; // Found mismatch in counts, so not an anagram
            }
        }

        // Step 6: If all checks pass, s and t are anagrams
        return true;
    }
}
