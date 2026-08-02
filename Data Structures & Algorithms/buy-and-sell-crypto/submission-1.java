class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int result = Integer.MIN_VALUE;

        for(int i=0; i< prices.length; i++){
            
            int sell = prices[i];

            result = Math.max(result, sell-buy);

            if(buy > sell){
                buy = sell;
            }
        }

    return result;
        
    }
}
