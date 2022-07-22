package com.example;

public class LinearOrSequentialSearch {

    public static void main(String[] args) {
        int[] mockArr = {2, 3, 6, 1, 3, 2, 6, 4, 3, 7};
        System.out.println(linearSearch(mockArr, 7));
    }

    public static int linearSearch(int[] list, int target) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
