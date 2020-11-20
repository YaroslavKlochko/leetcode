package com.example;

public class Main {
    public static void main(String[] args) {

        ShuffleString shuffleString = new ShuffleString();
        String s = "codeleet";
        int[]indices = new int[]{4,5,6,7,0,2,1,3};

        System.out.println(shuffleString.restoreString(s, indices));
    }
}
