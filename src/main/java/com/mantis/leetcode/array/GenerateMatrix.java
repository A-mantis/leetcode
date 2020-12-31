package com.mantis.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/31 14:26
 * @history: 1.2020/12/31 created by wei.wang
 */
public class GenerateMatrix {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int height = matrix.length;
        int length = height == 0 ? 0 : matrix[0].length;
        int startIndexX = 0;
        int startIndexY = 0;

        int currentX = startIndexX;
        int currentY = startIndexY;
        int index = 1;
        while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length && index <= n * n) {
            //右
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length && index <= n * n) {
                matrix[currentX][currentY] = index;
                currentY++;
                index++;
            }

            currentY--;
            currentX++;

            startIndexX++;

            //下
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length && index <= n * n) {
                matrix[currentX][currentY] = index;
                currentX++;
                index++;
            }

            currentX--;
            currentY--;

            length--;

            //左
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length && index <= n * n) {
                matrix[currentX][currentY] = index;
                currentY--;
                index++;
            }

            currentY++;
            currentX--;

            height--;

            //上
            while (currentX >= startIndexX && currentY >= startIndexY && currentX < height && currentY < length && index <= n * n) {
                matrix[currentX][currentY] = index;
                currentX--;
                index++;
            }

            currentX++;
            currentY++;

            startIndexY++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        GenerateMatrix generateMatrix = new GenerateMatrix();
        generateMatrix.generateMatrix(4);
    }
}
