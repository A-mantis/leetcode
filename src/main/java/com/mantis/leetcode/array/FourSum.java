package com.mantis.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/30 10:46
 * @history: 1.2020/12/30 created by wei.wang
 */
public class FourSum {
    /**
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) {
            return ans;
        }
        int len = nums.length;
        // 排序
        Arrays.sort(nums);
        for (int index = 0; index < len; index++) {
            if (nums[index] > target) {
                break;
            }
            for (int i = index + 1; i < len; i++) {
                int L = i + 1;
                int R = len - 1;
                while (L < R) {
                    int sum = nums[index] + nums[i] + nums[L] + nums[R];
                    if (sum == target) {
                        List<Integer> tmpList = Arrays.asList(nums[index], nums[i], nums[L], nums[R]);
                        if (!ans.contains(tmpList)) {
                            ans.add(tmpList);
                        }
                        while (L < R && nums[L] == nums[L + 1]) {
                            L++; // 去重
                        }
                        while (L < R && nums[R] == nums[R - 1]) {
                            R--; // 去重
                        }
                        L++;
                        R--;
                    } else if (sum < target) {
                        L++;
                    } else if (sum > target) {
                        R--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        FourSum fourSum = new FourSum();
        List<List<Integer>> listList = fourSum.fourSum(arr, -1);
        System.out.println(listList);
    }
}
