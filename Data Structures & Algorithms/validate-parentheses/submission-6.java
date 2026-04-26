class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();

        int i=0;
        while(i<s.length()){

            char c=s.charAt(i);
            
                    if(c=='(')
                        st.push(')');
                    else if(c=='{')
                        st.push('}');
                    else if(c=='[')
                        st.push(']');
                    else if(st.isEmpty() || c!=st.peek())
                        return false;
                    else
                        st.pop();
                

                i++;              
        }
        return st.isEmpty();

    }
}
