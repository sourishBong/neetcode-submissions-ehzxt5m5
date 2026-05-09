class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0;    
        Stack<Integer> st=new Stack();      

        for(int i=0;i<=heights.length;i++){
           while(!st.isEmpty() && 
           (i==heights.length || heights[i]<=heights[st.peek()])){
            int height=heights[st.peek()];
            st.pop();
            int width=0;
            if(st.isEmpty())
                width=i;
            else
                width=i-st.peek()-1;
                max=Math.max(max,width*height);
            
           }

           st.push(i);

        }

        
        return max;
    }
}
