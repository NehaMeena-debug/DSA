public class buy_Sell_Stock {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int buy = prices[0];
        int sell = 0;

        for (int i = 1; i < n; i++) {
        if (prices[i] < buy) {
                buy = prices[i];
            } 
            else {
                int profit = prices[i] - buy;
                if (profit > sell) {
                    sell = profit;
                }
            }
        }

       
        return sell;
    }

}
