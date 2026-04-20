class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        int max=0;
        Map<Character,Integer> map =new HashMap<>();
        int i=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                while(i<=map.get(s.charAt(j))){
                    i++;
                }
            }
            map.put(s.charAt(j),j);
            max=Math.max(max,j-i);
        }
        return max+1;
    }
}
