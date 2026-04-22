class Solution {
    public boolean checkInclusion(String s1, String s2) {
            //edge case
            if(s1.length()>s2.length())
                return false;

            int[] s1Freq=new int[26];

            int[] s2Freq=new int[26];

            int k=s1.length();

            int left=0;

            for(int i=0;i<s1.length();i++){
                s1Freq[s1.charAt(i)-'a']++;
            }

            for(int right=0;right<s2.length();right++){
                int len=(right-left)+1;

                s2Freq[s2.charAt(right)-'a']++;

                if(len>k){
                  s2Freq[s2.charAt(left)-'a']--;
                  left++;  
                }

               if(Arrays.equals(s1Freq,s2Freq))
                return true;

            }
            return false;
    }
}
