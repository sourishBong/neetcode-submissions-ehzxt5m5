class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){

            //adding the length to the string and then a delimeter so that if a number is there
            //in between we can see combination of number + delimeter to return words.
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {

        int i=0;
        List<String> result=new ArrayList<>();

        while(i<str.length()){
            int j=i;

            //this is to find the delimeter so that we can mark the start of the string
            while(str.charAt(j)!='#'){
                j++;
            }
            //to find the length of each string
            int length=Integer.parseInt(str.substring(i,j));

            //to find the startinf of each string
            i=j+1;
            result.add(str.substring(i,i+length));
            i=i+length;
        }

        return result;
    }
}
