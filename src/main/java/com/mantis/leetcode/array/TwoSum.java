package com.mantis.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/29 23:08
 * @history: 1.2020/12/29 created by wei.wang
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int index = 0; index < length; index++) {
            if (map.containsKey(target - nums[index])) {
                return new int[]{map.get(target - nums[index]), index};
            } else {
                map.put(nums[index], index);
            }
        }
        return null;
    }
}
