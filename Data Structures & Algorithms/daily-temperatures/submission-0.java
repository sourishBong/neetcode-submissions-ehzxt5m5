class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];

        for(int i=0;i<temperatures.length;i++){
            int j=i+1;
            int count=1;
            while(j<temperatures.length){
                if(temperatures[i]<temperatures[j]){
                    break;
                }
                count++;
                j++;
            }
            count=(j== temperatures.length)?0:count;
            result[i]=count;
        }
        return result;
    }
}
