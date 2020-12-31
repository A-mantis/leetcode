package com.mantis.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/31 14:09
 * @history: 1.2020/12/31 created by wei.wang
 */
public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return new ArrayList<Integer>();
        }
        int height = matrix.length;
        int length = height == 0 ? 0 : matrix[0].length;
        int startIndexX = 0;
        int startIndexY = 0;

        int currentX = startIndexX;
        int currentY = startIndexY;
        List<Integer> result = new ArrayList<Integer>();

        while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length) {
            //右
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length) {
                result.add(matrix[currentX][currentY]);
                currentY++;
            }

            currentY--;
            currentX++;

            startIndexX++;

            //下
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length) {
                result.add(matrix[currentX][currentY]);
                currentX++;
            }

            currentX--;
            currentY--;

            length--;

            //左
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length) {
                result.add(matrix[currentX][currentY]);
                currentY--;
            }

            currentY++;
            currentX--;

            height--;

            //上
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length) {
                result.add(matrix[currentX][currentY]);
                currentX--;
            }

            currentX++;
            currentY++;

            startIndexY++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        SpiralOrder spiralOrder = new SpiralOrder();
        System.out.println(spiralOrder.spiralOrder(arr));
    }
}
