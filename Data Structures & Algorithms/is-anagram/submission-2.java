class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1=new HashMap<>();
         
        //checking whether length is correct or not

        if(s.length()!=t.length())
            return false;

        int[] count=new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            int idx=t.charAt(i)-'a';
            count[idx]--;
            if(count[idx]<0) return false;
        }

        return true;
    }
}
