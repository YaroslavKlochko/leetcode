package com.example;

import java.util.Arrays;

//Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
//
//Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with; and each cookie j has a size s[j].
// If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
// Your goal is to maximize the number of your content children and output the maximum number.

//algorithm:

//sort all input
//create variable for happy children and pointers
//make a cycle to identify children


public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int i = g.length - 1;
        int j = s.length - 1;
        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                contentChildren++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return contentChildren;
    }

    public static void main(String[] args) {
        int[] greedChildren = {1,2};
        int[] satisfied = {1,2,3};
        System.out.println(findContentChildren(greedChildren, satisfied));
    }
}
