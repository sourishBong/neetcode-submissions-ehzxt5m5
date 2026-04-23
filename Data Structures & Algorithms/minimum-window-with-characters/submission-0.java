class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";

        int countRequired=t.length();
        int minWindowSize=Integer.MAX_VALUE;

        Map<Character, Integer> map=new HashMap<>();

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int left=0;
        int right=0;

        //will be required for substring
        int startLeft=0;

        while(right<s.length()){

            //checking if char at the position is greater than 0
            //if greater than 0 tht means we need this char in our result 
            //so count will reduce 
           if(map.getOrDefault(s.charAt(right), 0) > 0) {
                countRequired--;
             }

             // count of char in map will reduce each time
             map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)-1);

            //if required count is 0 start shrinking the window by incrementing left
             while(countRequired==0){
                   int currentWindowSize=(right-left)+1;
                   if(minWindowSize>currentWindowSize){
                    minWindowSize=currentWindowSize;
                    // minWindowSize=Math.min(minWindowSize,currentWindowSize);
                    startLeft=left;
                        }
                //when we shrink increase the frequency of char at that position by 1
                 map.put(s.charAt(left),map.getOrDefault(s.charAt(left),0)+1);

                 //if greater than 0 then countRequired will increment
                 if(map.get(s.charAt(left))>0){
                    countRequired++;
                 }
                 left++;
             }            
            right++;
        }


        return minWindowSize==Integer.MAX_VALUE ? "":s.substring(startLeft, startLeft + minWindowSize) ;
    }
}
