package com.example;

//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
//Note that after backspacing an empty text, the text will continue empty.

////algorithm:

//check with helper method our strings
// in helper method we need to create a box for String
//go through all elements
//add characters if they fit the condition or delete
//return our result

//Example 1:
//
//        Input: s = "ab#c", t = "ad#c"
//        Output: true
//        Explanation: Both s and t become "ac".
//        Example 2:
//
//        Input: s = "ab##", t = "c#d#"
//        Output: true
//        Explanation: Both s and t become "".
//        Example 3:


public class BackSpaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return strComparison(s).equals(strComparison(t));
    }
    private String strComparison(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
