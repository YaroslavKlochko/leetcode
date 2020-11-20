package com.example;

/**
 * Given a string s and an integer array indices of the same length.
 * <p>
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * <p>
 * Return the shuffled string.
 * <p>
 * Example:
 * Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
 * Output: "leetcode"
 * Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
 */
public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] result= s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
