class Solution {
    public int characterReplacement(String s, int k) {
        
        int maxLength=0;
        int maxFrequency=0;
        Map<Character, Integer> map=new HashMap<>();

        int j=0;

        for(int i=0;i<s.length();i++){
            int len=(i-j)+1;
            
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxFrequency=Math.max(maxFrequency,map.get(s.charAt(i)));

            if(len-maxFrequency>k){
              map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);
              j++;
            }
            len=(i-j)+1;
            maxLength=Math.max(maxLength,len);
          
        }
        return maxLength;
    }
}
