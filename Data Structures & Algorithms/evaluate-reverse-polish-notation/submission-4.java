class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1)
            return Integer.parseInt(tokens[0]);
        Stack<Integer> st=new Stack<>();
        int result=0;

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-")
                    || tokens[i].equals("*")|| tokens[i].equals("/")){
                        int a=0;
                        int b=0;
                        if(st.size()>=2){
                            a=st.pop();
                            b=st.pop();
                        }
                        if(tokens[i].equals("+")){
                            result=a+b;
                        }else if(tokens[i].equals("-")){
                            result=b-a;
                        }else if(tokens[i].equals("*")){
                            result=a*b;
                        }else if(tokens[i].equals("/")){
                            result=b/a;
                        }

                        st.push(result);
               
            }else{
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        return result;
    }
}
