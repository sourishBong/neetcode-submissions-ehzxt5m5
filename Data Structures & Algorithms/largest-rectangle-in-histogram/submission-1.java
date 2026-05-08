class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=Integer.MIN_VALUE;        
        for(int i=0;i<heights.length;i++){
            int width=0;
            int j=i+1;
            int k=i;
            while(k>=0 && heights[i]<=heights[k]){
                width++;
                k--;
            }
            while(j<=heights.length-1 && heights[i]<=heights[j]){
                width++;
                j++;
            }

            max=Math.max(max,heights[i]*width);

        }       
        return max;
    }
}
