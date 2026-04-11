class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();



        for(int i=0;i<strs.length;i++){
            int[] chars=new int[26];
            String s=strs[i];
            for(int j=0;j<s.length();j++){
                chars[s.charAt(j)-'a']++;
            }
            StringBuffer sb=new StringBuffer();
            for(int j=0;j<chars.length;j++){
                while(chars[j]>0) {
                    sb.append((char) (j + 'a'));
                    chars[j]--;
                }
            }
            String str=new String(sb);
            //checking if key is present then use same lsit or create new
            map.computeIfAbsent(str, k->new ArrayList<>()).add(strs[i]);

        }
        // if list of list is created then iterating map and add list.
        // for(Map.Entry<String,List<String>> l:map.entrySet()){
        //     list.add(l.getValue());
        // }

        //if you create the list of list here
        List<List<String>> list=new ArrayList<>(map.values());

        return list;
    }
}
