package com.mantis.leetcode.array;

/**
 * @Description:
 * @author: wei.wang
 * @since: 2020/12/31 15:01
 * @history: 1.2020/12/31 created by wei.wang
 */
public class SpiralMatrixIII {
    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[] dr = new int[]{0, 1, 0, -1};
        int[] dc = new int[]{1, 0, -1, 0};

        int[][] ans = new int[R * C][2];
        int t = 0;

        ans[t++] = new int[]{r0, c0};
        if (R * C == 1) {
            return ans;
        }

        for (int k = 1; k < 2 * (R + C); k += 2) {
            for (int i = 0; i < 4; ++i) {
                int dk = k + (i / 2);
                for (int j = 0; j < dk; ++j) {
                    r0 += dr[i];
                    c0 += dc[i];
                    if (0 <= r0 && r0 < R && 0 <= c0 && c0 < C) {
                        ans[t++] = new int[]{r0, c0};
                        if (t == R * C) {
                            return ans;
                        }
                    }
                }
            }
        }

        throw null;
    }

    public static void main(String[] args) {
        SpiralMatrixIII spiralMatrixIII = new SpiralMatrixIII();
        spiralMatrixIII.spiralMatrixIII(5, 6, 1, 4);
    }
}
