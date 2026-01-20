
// Approach 1: Brute Force

// Try all buy-sell pairs

// Time: O(n²)

// Space: O(1)


class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;

        // Try all possible buy and sell pairs
        for (int i = 0; i < n; i++) {           // buy day
            for (int j = i + 1; j < n; j++) {   // sell day (must be after buy)
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}


// Approach 2: Optimal (Greedy)

// Track minimum price so far

// Compute profit in one pass

// Time: O(n)

// Space: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // If we find a cheaper price, update buying price
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // Otherwise, try selling today
            else {
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}

