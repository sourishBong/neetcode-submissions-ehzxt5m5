class MinStack {
    Stack<int[]> st=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        int currentMin= st.isEmpty()? val:Math.min(st.peek()[1],val);
        st.push(new int[]{val,currentMin});
    }
    
    public void pop() {
        if(!st.isEmpty())
            st.pop();
    }
    
    public int top() {
        int top=st.peek()[0];
        return top;
    }
    
    public int getMin() {
        return st.peek()[1];
    }
}
