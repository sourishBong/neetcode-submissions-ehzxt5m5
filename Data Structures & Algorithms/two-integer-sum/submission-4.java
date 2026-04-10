class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int op[]=new int[2];
        //pass 1
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        //pass 2
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                //  op[0]=i;
                //  op[1]=map.get(diff);
                return new int[]{i, map.get(diff)};
            }
        }
        return op;
    }
}
