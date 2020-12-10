package com.example;

/**
 * Given a String, must return the longest palindromic substring in it.
 * <p>
 * Approach in this solution is expand around the center. Time complexity is  O(n^2);
 */

public class PalindromicSubstring {
    public String longestPalindromic(String s) {
        if(s == null  || s.length() < 1) return "";

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s, i, i+1);
            int len = Math.max(len1,len2);
            if(len > end - start) {
                start = i - ((len - 1) / 2);
                end = i + (len / 2);
            }
        }
        return s.substring(start, end +1);
    }

    private int expandFromMiddle(String s, int left, int right  ) {
        if(s == null || left > right) return 0;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
