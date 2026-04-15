class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;

       Set<Integer> set=new HashSet<>();
        int longest=1;
        int currCount=0;
        int currentSmall=0;
        //pass 1
       for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
       }

        //pass 2
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]-1)){
                continue;
            }else if(set.contains(nums[i])){
                currentSmall=nums[i];
                currCount=1;
                while(set.contains(currentSmall+1)){
                   currCount=currCount+1; 
                   currentSmall=currentSmall+1;
                }
            } 
        longest=Math.max(longest,currCount);
        }
        return longest;
    }
}
