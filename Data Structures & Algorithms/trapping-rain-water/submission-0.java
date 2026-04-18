class Solution {
    public int trap(int[] height) {
        int total=0;

        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];

        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];

        //pass 1 Max height of each element in left
        int max=leftMax[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(max,height[i]);  
            max=leftMax[i];      
        }

        //pass 2 Max height of each element in right
        max=rightMax[rightMax.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(max,height[i]);
            max=rightMax[i];
        }

        for(int i=0;i<height.length;i++){
            total=total+ (Math.min(rightMax[i],leftMax[i])-height[i]);
        }

        return total;
    }
}

