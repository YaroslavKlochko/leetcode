package com.example;

import static java.lang.Integer.parseInt;

public class PalindromeNumber {

    public static void main(String[] args) {
        isPalindrome(121);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String myReversedValue = String.valueOf(x);
        StringBuilder stringBuilder = new StringBuilder(myReversedValue).reverse();
        return x == parseInt(stringBuilder.toString());
    }
}
