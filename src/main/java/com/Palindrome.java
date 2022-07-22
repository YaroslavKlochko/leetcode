package com.example;

public class Palindrome {
    public String findLongestPalindrome(String s) {
        if (s.equals("") || s.length() < 1) return "";

        int startPoint = 0;
        int endPoint = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = checkMiddlePosition(s, i, i);
            int len2 = checkMiddlePosition(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > (endPoint - startPoint)) {
                startPoint = i - ((len - 1) / 2);
                endPoint = i + (len / 2);
            }
        }
        return s.substring(startPoint, endPoint + 1);
    }

    public int checkMiddlePosition(String s, int left, int right) {
        if (s.equals("") || s.length() < 1) return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return (right - left) - 1;
    }
}

// give it back and keep in mind we are working with indices

//check the middle position for the 1st element
//check the middle position for the second element
//find the maximum value between the 1st and the 2nd point
// проверяем значение больше ли максимального элемента или нет, если нет, то записываем в 1st element
// проверяем значение больше ли максимального элемента или нет, если нет, то записываем в 2nd element

// give the part of the string we are working with indices



