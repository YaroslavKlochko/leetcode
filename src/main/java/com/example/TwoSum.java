package com.example;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have <strong>exactly one solution</strong>, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum {

    /**
     * @param nums   source array
     * @param target sum of elements
     * @return array with indexes of elements
     */
    public static int[] twoSum(final int[] nums, final int target) {
        final HashMap<Integer, Integer> hashMap = new HashMap<>();
        int i = 0;
        while ((i < nums.length) && (hashMap.get(nums[i]) == null)) {
            hashMap.put(target - nums[i], i);
            i++;
        }
        if (i < nums.length) {
            return new int[]{hashMap.get(nums[i]), i};
        }
        return new int[]{};
    }
}
