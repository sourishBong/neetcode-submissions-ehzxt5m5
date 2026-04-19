class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int j=1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length-1;i++){
           if(min>prices[i]){
                min=prices[i];
           }
            maxProfit=Math.max(maxProfit,prices[j]-min);
            j++;
        }

       

        return maxProfit;
    }
}
