package com.mantis.leetcode.array;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2021/1/1 11:39
 * @history: 1.2021/1/1 created by wei.wang
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
            return true;
        }
        for (int index = 0; index < flowerbed.length - 2; index++) {
            if (index == 0 && flowerbed[index] == 0 && flowerbed[index + 1] == 0) {
                flowerbed[index] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
            if (flowerbed[flowerbed.length - 2] == 0 && flowerbed[flowerbed.length - 1] == 0) {
                flowerbed[flowerbed.length - 1] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
            if (flowerbed[index] == 0 && flowerbed[index + 1] == 0 && flowerbed[index + 2] == 0) {
                flowerbed[index + 1] = 1;
                n--;
                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1};

        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        System.out.println(canPlaceFlowers.canPlaceFlowers(arr, 1));
    }
}
