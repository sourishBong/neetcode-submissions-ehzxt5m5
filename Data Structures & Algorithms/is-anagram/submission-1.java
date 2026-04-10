class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1=new HashMap<>();
         
         //pass 1
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(map1.containsKey(c))
                map1.put(c,map1.get(c)+1);
            else
                map1.put(c,1);
        }

        //pass 2
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(map1.containsKey(c))
                map1.put(c,map1.get(c)-1);
            else
                return false;
        }

        //pass 3
        for(Map.Entry<Character,Integer> entry:map1.entrySet()){
            if(entry.getValue()>0)
                return false;
        }
            return true;
    }
}
