import org.junit.Test;

/**
 * Created by Kyle on 2017/10/23.
 */
public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int temp = prices[j] - prices[i];
                if (temp >= max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    public int maxPro(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            int num = prices[i];
            int min = prices[i];
            int minIndex = i;
            if (minIndex >= i) {
                for (int j = i; j >= 0; j--) {
                    if (prices[j] < min) {
                        min = prices[j];
                        minIndex = j;
                    }
                }
                if (i > minIndex) {
                    int temp = num - min;
                    if (result < temp)
                        result = temp;
                }
            } else {
                if (i > minIndex) {
                    int temp = num - min;
                    if (result < temp)
                        result = temp;
                }
            }

        }
        return result;
    }

    public int solution(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            } else if (profit < prices[i] - min) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }

    @Test
    public void test() {
        System.out.println(solution(new int[]{7,1,5,3,6,4}));
    }
}
