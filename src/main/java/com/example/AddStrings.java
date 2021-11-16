package com.example;

//Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
//You must solve the problem without using any built-in library for handling large integers (such as BigInteger).
// You must also not convert the inputs to integers directly.

//algorithm:

//create a box for Strings
//create 3 pointers
//go through the strings and convert to int
//take the last digit and subtract it
//create a break condition
//return modified result

public class AddStrings {

    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += num1.charAt(i--) + '0';
            }
            if (j >= 0) {
                sum += num2.charAt(j--) + '0';
            }
            result.append(sum % 10); 
            carry = sum / 10;
        }
        if (carry != 0) {
            result.append(carry);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "57";

        System.out.println(addStrings(num1, num2));
    }
}
