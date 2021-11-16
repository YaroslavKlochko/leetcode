package com.example;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 4};
        containDuplicate(nums);
    }

    public static void containDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (numbers.contains(nums[i])) {
                return;
            }
            numbers.add(i);
        }
    }
}
