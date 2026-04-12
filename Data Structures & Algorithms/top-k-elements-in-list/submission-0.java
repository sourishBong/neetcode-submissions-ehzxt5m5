class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        

        //pass 1
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Integer res[]= map.entrySet().stream().sorted(Map.Entry
        .comparingByValue(Comparator.reverseOrder())).limit(k)
               .map(Map.Entry::getKey).toArray(Integer[]::new);
        
        int result[]=Arrays.stream(res)
         .mapToInt(Integer::intValue)
         .toArray();

         return result;

    }
}
