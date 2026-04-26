class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        int i=0;
        while(i<s.length()){

            char c=s.charAt(i);
            if(!st.isEmpty() && (c==')' && st.peek()=='(' ||
            c=='}' && st.peek()=='{' ||
                c==']' && st.peek()=='[')){
                    st.pop();
                }else{
                    st.push(c);
                }

                i++;              
        }
        return st.isEmpty();

    }
}
