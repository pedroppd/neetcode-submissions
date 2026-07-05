class MinStack {

    private Stack<Integer> min;

    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();  
    }
    
    public void push(int val) {
        int currentMin = min.size() - 1;
        if(min.isEmpty() || val <= min.get(currentMin)) {
            min.add(val);
        }
        stack.add(val);
    }
    
    public void pop() {
        int currentMin = min.size() - 1;
        int lastIdx = stack.size() - 1;
        if(stack.get(lastIdx).equals(min.get(currentMin))) {
            min.remove(currentMin);
        }
        stack.remove(lastIdx);
    }
    
    public int top() {
        int lastIdx = stack.size() - 1;
        return stack.get(lastIdx);
    }
    
    public int getMin() {
        int currentMin = min.size() - 1;
        return min.get(currentMin);
    }
}
