package com.example;

//apple door table hookah whiteboard

public class ReverseString {

    public static void reverString(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while(left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }

    public static String reverseString(String str) {

        StringBuilder result = new StringBuilder();
        for (int i = str.length() - 1; i >=0 ; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("apple banana car")
        );
    }
}
