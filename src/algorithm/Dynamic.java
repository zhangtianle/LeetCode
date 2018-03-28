package algorithm;

import org.junit.Test;

public class Dynamic {

    /**
     * 币值最大问题 P.220
     */
    private void maxCoinValue() {
        // 输入的值
        int[] coins = new int[]{5, 1, 2, 10, 6, 2};

        int[] f = new int[coins.length];
        f[0] = coins[0];
        f[1] = Math.max(coins[0], coins[1]);

        for (int i = 2; i < coins.length; i++) {
            f[i] = Math.max(f[i - 2] + coins[i], f[i]);
        }

        System.out.println(f[f.length - 1]);
    }

    /**
     * 找零问题 P. 221
     */
    private void changeMaking() {
        // 输入数据
        int[] coins = new int[]{1, 3, 4};
        int n = 6;

        // f(n) 为总金额为n的数量最小的硬币数目
        int[] f = new int[n + 1];
        f[0] = 0;

        for (int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            int j = 0;
            while (j < coins.length && i >= coins[j]) {
                min = Math.min(f[i - coins[j]], min);
                j++;
            }
            f[i] = min + 1;
        }
        System.out.println(f[n]);
    }

    /**
     * 硬币收集问题 P.223
     */
    private void robotCoinCollection() {
        // 输入数据
        int[][] coins = new int[5][6];
        coins[0][4] = 1;
        coins[1][1] = 1;
        coins[1][3] = 1;
        coins[2][3] = 1;
        coins[2][5] = 1;
        coins[3][2] = 1;
        coins[3][5] = 1;
        coins[4][0] = 1;
        coins[4][4] = 1;

        // f(i,j) 为机器人截止到 i, j 单元格能够收集到的最大硬币数
        int[][] f = new int[coins.length][coins[0].length];
        f[0][0] = coins[0][0];

        for (int i = 1; i < coins[0].length; i++) {
            f[0][i] = f[0][i - 1] + coins[0][i];
        }

        for (int i = 1; i < coins.length; i++) {
            f[i][0] = f[i - 1][0] + coins[i][0];
            for (int j = 1; j < coins[0].length; j++) {
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]) + coins[i][j];
            }
        }

        System.out.println(f[coins.length - 1][coins[0].length - 1]);
    }

    @Test
    public void test() {
        maxCoinValue();
        changeMaking();
        robotCoinCollection();
    }


}
