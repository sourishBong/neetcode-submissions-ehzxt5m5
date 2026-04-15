class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;

        int longest=1;
        int currentCount=1;
        int lastSmaller=nums[0];

        //sorting the array
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
          if(lastSmaller==(nums[i]-1)){
                lastSmaller=nums[i];
                currentCount=currentCount+1;
            }else if(lastSmaller!=(nums[i])){
                currentCount=1;
                lastSmaller=nums[i];
            }

            longest=Math.max(longest,currentCount);
        }
        return longest;
    }
}
