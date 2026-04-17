class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
       

        for(int i=0;i<nums.length;i++){

            if(i>0 && nums[i]==nums[i-1])
                continue;

            int n1=nums[i];
            int j=i+1;
            int k=nums.length-1;

            while(j<k){

                 List<Integer> temp=new ArrayList<>();
                
                if(nums[j]+nums[k]==-n1){

                //skipping to the next n2 element because previous is same(n2=nums[j])
               while(j<k && nums[j]==nums[j+1])
                        j++;
                //skipping to the next n3 element because previous is same(n3=nums[k])
                while(j<k && nums[k]==nums[k-1])
                        k--;

                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    temp.add(n1);
                    result.add(temp);
                    j++;
                    k--;
                }else if(nums[j]+nums[k]>-n1)
                    k--;
                else
                    j++;
            }          
        }
        return result;
    }
}
