package leetcode;

import org.junit.Test;

/**
 * Created by Kyle on 2017/10/23.
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {

        int buyPrice;
        int sellPrice;

        int totalProfit = 0;
        int i = 0;

        while (i < prices.length - 1 ) {
            while (i < prices.length - 1 && prices[i + 1] <= prices[i]) {
                i++;
            }
            buyPrice = prices[i];
            while (i < prices.length - 1 && prices[i + 1] >= prices[i]) {
                i++;
            }
            sellPrice = prices[i];
            totalProfit = totalProfit + sellPrice - buyPrice;
        }
        return totalProfit;
    }

    @Test
    public void test() {
        System.out.println(maxProfit(new int[]{1, 2}));
    }
}
