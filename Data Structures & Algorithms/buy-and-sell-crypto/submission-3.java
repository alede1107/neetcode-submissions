class Solution {
    public int maxProfit(int[] prices) {
        int[] res = new int[prices.length*prices.length];
        int count=0;
        for (int i = 0; i<prices.length;i++){
            for (int j =1+i; j<prices.length;j++){
                if (prices[j]-prices[i]>0){
                    res[count]=prices[j]-prices[i];
                    count+=1;
                }
                
            }
        }
        int max = 0;
        for (int n=0; n<res.length;n++){
            if (res[n]>max){
                max = res[n];
            }
        }
        return max;
    }
}
