class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        //because we are taking fequency as the index and array index
        //starts with 0 so +1 to accomodate all index
        List<Integer>[] bucket=new List[nums.length+1];


        //pass 1
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            //to get the index
            int index=entry.getValue();

            if(bucket[index]==null)
                bucket[index]=new ArrayList<>();
            //adding the key as the value   
            bucket[index].add(entry.getKey());
        }
        
       int result[]=new int[k];
       //to keep track of added K elements 
        int countK=0;
       for(int i=bucket.length-1;i>=0 && countK<k;i--){
            if(bucket[i]==null)
                continue;
            for(int num:bucket[i]){
                result[countK]=num;
                countK++;
                if(countK==k) break;
            }
       }
        return result;
    }
}
