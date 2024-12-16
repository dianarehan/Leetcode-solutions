import java.util.HashMap;

public class Solution {

    public static int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        HashMap<String, Integer> dp = new HashMap<>();
        return helper(0, true, prices, dp);
    }

    private static int helper(int day, boolean canBuy, int[] prices, HashMap<String, Integer> dp) {
        if (day >= prices.length) return 0;
        String key = day + "," + canBuy;
        if (dp.containsKey(key)) return dp.get(key);
        int profit = 0;
        if (canBuy) {
            int buy = helper(day + 1, false, prices, dp) - prices[day];
            int skip = helper(day + 1, true, prices, dp);
            profit = Math.max(buy, skip);
        } else {
            int sell = helper(day + 2, true, prices, dp) + prices[day]; 
            int skip = helper(day + 1, false, prices, dp);
            profit = Math.max(sell, skip);
        }
        dp.put(key, profit);
        return profit;
    }
}
