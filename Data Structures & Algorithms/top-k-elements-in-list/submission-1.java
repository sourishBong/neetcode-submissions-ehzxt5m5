class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap=
            new PriorityQueue<>(Map.Entry.comparingByValue());

        //pass 1
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k) 
                minHeap.poll();
        }

        int result[]=new int[k];
        int idx=0;

        while(!minHeap.isEmpty()){
            result[idx]=minHeap.poll().getKey();
            idx++;
        }
        return result;
    }
}
