package com.company;

public class BuyAndSell {
    public static int maxProfit(int[] prices) {
        boolean isBought = false;
        int dayOfBuy = -1;
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(!isBought){
                if (prices[i+1]>prices[i]){
                    isBought =true;
                    dayOfBuy = i;
                }
            }
            else{
                if(prices[i+1]<prices[i]){
                    isBought=false;
                    profit+=(prices[i]-prices[dayOfBuy]);
                }
            }
        }
        if (isBought){
            profit+=(prices[prices.length-1] - prices[dayOfBuy]);
        }
        return profit;
    }
}
