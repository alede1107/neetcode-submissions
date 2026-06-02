class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        for (int i =0;i<prices.length;i++){
            for (int j=1; j<prices.length;j++){
                if ((max<prices[j]-prices[i])&&(i<j)){
                    max = prices[j]-prices[i];
                }
            }
        }
        return max;
    }
}
