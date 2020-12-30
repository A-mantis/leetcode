package com.mantis.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/30 16:08
 * @history: 1.2020/12/30 created by wei.wang
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> listList = new ArrayList<List<Integer>>();
        backtracking(new ArrayList<Integer>(), listList, 0, target, candidates);
        return listList;
    }

    /**
     * 回溯函数
     * @param integerList   保存结果
     * @param listList  保存结果集
     * @param start     起始位置
     * @param target    目标
     * @param candidates    数组
     */
    public void backtracking(List<Integer> integerList, List<List<Integer>> listList, int start, int target, int[] candidates) {
        if (target == 0) {
            listList.add(new ArrayList<Integer>(integerList));
        }
        for (int index = start; index < candidates.length; index++) {
            if (candidates[index] <= target) {
                integerList.add(candidates[index]);
                backtracking(integerList, listList, index + 1, target - candidates[index], candidates);
                integerList.remove(integerList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 3, 5, 1};
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(arr, 9));
    }
}
