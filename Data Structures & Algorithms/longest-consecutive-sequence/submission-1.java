class Solution {
    public int longestConsecutive(int[] nums) {
        int longest =1;
        if(nums.length==0)
            return 0;
         for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int count = 1;

            while(linearSearch(nums,current+1)==true){
                current=current+1;
                count=count+1;
            }

            longest = Math.max(longest, count);
            }

        return longest;
    }
     private static boolean linearSearch(int[] nums, int j) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==j)
                return true;
        }
        return false;
    }
}
