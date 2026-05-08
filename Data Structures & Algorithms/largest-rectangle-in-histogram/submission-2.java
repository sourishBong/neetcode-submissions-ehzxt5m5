class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=Integer.MIN_VALUE;    
        Stack<Integer> st=new Stack();      
        int[] leftSmall=new int[heights.length];
        int[] rightSmall=new int[heights.length];

        for(int i=0;i<heights.length;i++){
           while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           }

           if(st.isEmpty()){
            leftSmall[i]=0;
           }else{
            //i+1 becuase its range should be 1 index more than the next small 
            //range cannot start from next small
            leftSmall[i]=st.peek()+1;
           }

           st.push(i);

        }

        //clearing stack
        st.clear();

        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[i]<=heights[st.peek()]){
            st.pop();
           }

           if(st.isEmpty()){
            rightSmall[i]=heights.length-1;
           }else{
            //i-1 becuase its range should be 1 index less than the next small 
            //range cannot start from next small
            rightSmall[i]=st.peek()-1;
           }

           st.push(i);
        } 

        for(int i=0;i<heights.length;i++){
            int area=(rightSmall[i]-leftSmall[i]+1)*heights[i];
            max=Math.max(max,area);
        } 
        return max;
    }
}
