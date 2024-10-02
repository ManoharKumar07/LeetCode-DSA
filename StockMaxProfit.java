public class StockMaxProfit {
    public static int maxProfit(int[] prices) {
        // If the array is empty or has only one price, no profit can be made.
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        
        // Traverse through the array, starting from the second element.
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday's, add the difference to the profit.
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        // Example 1
        int[] stockPrices1 = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Maximum Profit: " + maxProfit(stockPrices1));  // Output: 865

        // Example 2
        int[] stockPrices2 = {500, 450, 355, 40, 400};
        System.out.println("Maximum Profit: " + maxProfit(stockPrices2));  // Output: 360
    }
}
