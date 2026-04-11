class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] c=strs[i].toCharArray();
            Arrays.sort(c);
            String s=String.valueOf(c);
          
          //checking if key is present then use same lsit or create new
          map.computeIfAbsent(s, k->new ArrayList<>()).add(strs[i]);

        }

        for(Map.Entry<String,List<String>> l:map.entrySet()){
            list.add(l.getValue());
        }
       

        return list;
    }
}
