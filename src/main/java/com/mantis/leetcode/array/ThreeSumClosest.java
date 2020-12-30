package com.mantis.leetcode.array;

import java.util.Arrays;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/30 13:57
 * @history: 1.2020/12/30 created by wei.wang
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = 0;
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for (int index = 0; index < length; index++) {
            left = index + 1;
            right = length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[index];
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    result = sum;
                }
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        threeSumClosest.threeSumClosest(arr, 1);
    }
}
