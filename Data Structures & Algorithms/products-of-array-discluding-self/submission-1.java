class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        int temp=1;
        int countZero=0;

        //pass 1
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]!=0)
                temp=temp*nums[i];
            else{
                countZero++;
            }
        }

        //pass 2
        for(int i=0;i<nums.length;i++){
            if(countZero==1){
                if(nums[i]==0)
                    output[i]=temp;
                else
                    output[i]=0;
            }else if(countZero>1){
                output[i]=0;
            }else{
                output[i]=temp/nums[i];
            }

        }
            return output;
    }
}  
